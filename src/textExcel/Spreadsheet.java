package textExcel;

import persistence.PersistenceHelper;
import persistence.Savable;

public class Spreadsheet implements Savable {
    private static final int NUM_ROWS  = 10;
    private static final int NUM_COLS  = 7;
    private static final int COL_WIDTH = 12;

    private String gridHeader;
    private String gridDivider;

    private Cell[][] cells;

    public Spreadsheet() {
        // let's get ourselves a header and a divider line
        gridHeader = new GridHeader(NUM_COLS, COL_WIDTH).toString();
        gridDivider = new GridDivider(NUM_COLS, COL_WIDTH).toString();

        // initialize the spreadsheet
        cells = new Cell[NUM_ROWS][NUM_COLS];
        clearSheet();
    }

    public String processCommand(String command) {
        // if input is empty, we're done
        if (command.length() == 0) return "CONGRATS, YOU'VE ENTERED NOTHING!";

        // let's see which command we're dealing with here
        String commandLowerCase = command.toLowerCase();

        if (commandLowerCase.startsWith("print")) return processPrintCommand();
        if (commandLowerCase.startsWith("clear")) return processClearCommand(command);
        if (commandLowerCase.startsWith("save")) return processSaveCommand(getFilename(command));
        if (commandLowerCase.startsWith("load")) return processLoadCommand(getFilename(command));
        if (commandLowerCase.startsWith("sort")) return processSortCommand(command);
        if (commandLowerCase.startsWith("help")) return processHelpCommand(command);
        // if we haven't identified the command yet, we need to tokenize the
        // input
        String[] tokens = command.split(" ", 3);

        // if the input is a single token, it must be a cell location
        if (tokens.length == 1) return processCellLocation(tokens[0]);

        if (!(tokens.length == 1 || tokens.length == 3)) {
        	return "COMMAND NOT RECOGNIZED\n";
        }
        
        // The only possibility left is a cell assignment
        if ((!(tokens[2].startsWith("\""))) && (!(tokens[2].matches("[0-9]+") || (tokens[2].contains("."))))) {
        	System.out.println("ERROR: PLACE STRING VALUES INSIDE QUOTES");
        	return "";
        }
        return processCellAssignment(tokens[0], tokens[2]);
    }

    private String processPrintCommand() {
        return getGridText();
    }

    private String processClearCommand(String command) {
        String[] tokens = command.split(" ");

        if (tokens.length == 1) {
            clearSheet();
            System.out.println("ALL CELLS CLEARED");
        }
        else {
            clearCell(tokens[1]);
            System.out.println(tokens[1].toUpperCase() + " CLEARED");
        }
        return "";
    }

    private String processSaveCommand(String filename) {
        if (filename.length() == 0) return "Error: the save command requires a filename";

        try {
            PersistenceHelper.save(filename, this);
            System.out.println("File Saved!");
        }
        catch (Exception e) {
            return e.getMessage();
        }
        return "";
    }

    private String processLoadCommand(String filename) {
        if (filename.length() == 0) return "Error: the load command requires a filename";

        try {
            PersistenceHelper.load(filename, this);
            System.out.println("File Loaded!");
        }
        catch (Exception e) {
            return e.getMessage();
        }
        return "";
    }

    private String processSortCommand(String command) {
    	String[] array = command.split(" ");
    	String direction = array[0].substring(array[0].length() - 1, array[0].length());
    	String first = array[1];
    	String last = array[3];
    	sort(direction, first, last);
    	return "";
    }
    
    private String processHelpCommand(String command) {
    	String answer = "HELP COMMAND NOT RECOGNIZED\n";
    	String category = command.substring(command.indexOf("help") + 2);
    	if (category.contains("sum")) {
    		answer = "Type a cell location followed by an ' = '\nThen in parenthesis type 'sum' "
    				+ "followed by the range of cells wishing to be added up. Ex. a1 = ( sum a2 - b3 )\n";
    	}
    	
    	else if (category.contains("avg")) {
    		answer = "Type a cell location followed by an ' = '\nThen in parenthesis type 'avg' "
    				+ "followed by the range of cells wishing to be averaged up. Ex. a1 = ( avg a2 - b3 )\n";
    	}
    	
    	else if (category.contains("sorta")) {
    		answer = "Type 'sorta' then the ranges wished to be \nsorted in ascending order. Ex. sorta a1 - b4\n";
    	}
    	
    	else if (category.contains("sortd")) {
    		answer = "Type 'sortd' then the ranges wished to be \nsorted in descending order. Ex. sortd a1 - b4\n";
    	}
    	
    	else if (category.contains("formula")) {
    		answer = "Type any cell location followed by a ' = ' then a formula that may \ninclude numbers and cells"
    				+ " inside parenthesis. Ex. a4 = ( 3 * b3 )\n";
    	}
    	
    	else if (category.contains("cell")) {
    		answer = "Type any cell and press enter to view the contents of that cell\n"
    				+ "Type any cell followed by a ' = ' and a value, date, or string to \nassign a value to that cell\n";
    	}
    	
    	return answer;
    }
    
    private void sort(String direction, String first, String last) {
    	SpreadsheetLocation first1 = new SpreadsheetLocation(first);
    	SpreadsheetLocation last1 = new SpreadsheetLocation(last);
    	
    	int row1 = first1.getRow();
    	int col1 = first1.getCol();
    	int row2 = last1.getRow();
    	int col2 = last1.getCol();
    	
    	int numberOfRows = row2 - row1 + 1;
		int numberOfCols = col2 - col1 + 1;
		int numberOfElements = numberOfRows * numberOfCols;
		
		for (int i = 1; i < numberOfElements; i++) {
			int j = i;
			int keyRow = j / numberOfCols + row1;
			int keyCol = j % numberOfCols + col1;
			Cell keyCell = cells[keyRow][keyCol];
			double keyValue = ((RealCell) keyCell).getDoubleValue();
			int swapRow = (j - 1) / numberOfCols + row1;
			int swapCol = (j - 1) % numberOfCols + col1;
		
			while (j > 0 && outOfOrder(direction, ((RealCell) cells[swapRow][swapCol]).getDoubleValue(), keyValue)) {
				cells[keyRow][keyCol] = cells[swapRow][swapCol];
				j--;
				keyRow = j / numberOfCols + row1;
				keyCol = j % numberOfCols + col1;
				swapRow = (j - 1) / numberOfCols + row1;
				swapCol = (j - 1) % numberOfCols + col1;
			}
			cells[keyRow][keyCol] = keyCell;
		}
	}

	private boolean outOfOrder(String direction, double swapValue, double keyValue) {
		if (direction.equals("a")) {
			if (swapValue > keyValue) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if (swapValue < keyValue) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	private String processCellLocation(String cell) {
        if (!(cell.matches("^[a-gA-G]([1-9]|10)$"))) { //if the command is not a cell
        	return "COMMAND NOT RECOGNIZED\n";
        }
		
		SpreadsheetLocation loc = new SpreadsheetLocation(cell);
        return cell.toUpperCase() + " = " + getCell(loc).fullCellText();
    }

    private String processCellAssignment(String cell, String value) {
    	 if (!(cell.matches("^[a-gA-G]([1-9]|10)$"))) { //if the command is not a cell
         	return "COMMAND NOT RECOGNIZED\n";
         }
    	SpreadsheetLocation loc = new SpreadsheetLocation(cell);
        processCellAssignment(loc.getRow(), loc.getCol(), value);
        return "";
    }

    private String processCellAssignment(int row, int col, String value) {
        Cell c;

        if (value.startsWith("\"")) { // is this a string value?
            c = new TextCell(value);
        }
        
        else if (value.startsWith("(")) { // is it a formula?
            c = new FormulaCell(value, this);
        }
        
        else if (value.indexOf("/") > -1) { // is it a date?
            c = new DateCell(value);

        }
        else if (value.startsWith("<")) { // is it an empty cell (which will come in as <empty>)?
            c = new EmptyCell();

        }
        else { // if we got this far, it must be a real number
            c = new ValueCell(value);
        }

        cells[row][col] = c;

        return "";
    }

    private String getFilename(String command) {
        int firstSpace = command.indexOf(" ");

        // if there's no space in the command string then there's no filename
        if (firstSpace == -1) return "";

        return command.substring(firstSpace + 1);
    }

    public static int getRows() {
        return NUM_ROWS;
    }

    public static int getCols() {
        return NUM_COLS;
    }

    public static int getColWidth() {
        return COL_WIDTH;
    }

    public Cell getCell(Location loc) {
        return cells[loc.getRow()][loc.getCol()];
    }

    public String getGridText() {
        String ret = gridHeader + gridDivider;

        for (int row = 0; row < NUM_ROWS; row++)
        {
            ret += new GridRow(row, COL_WIDTH, cells[row]).toString();
            ret += gridDivider;
        }
        return ret;
    }

    private void clearSheet() {
        for (int row = 0; row < NUM_ROWS; row++)
        {
            for (int col = 0; col < NUM_COLS; col++)
            {
                clearCell(row, col);
            }
        }
    }

    private void clearCell(String cell) {
        SpreadsheetLocation loc = new SpreadsheetLocation(cell);
        clearCell(loc.getRow(), loc.getCol());
    }

    private void clearCell(int row, int col) {
        cells[row][col] = new EmptyCell();
    }

    @Override
    public String[] getSaveData() {
        String[] saveArray = new String[NUM_ROWS * NUM_COLS];
        int saveArrayIndex = 0;

        for (int row = 0; row < NUM_ROWS; row++)
        {
            for (int col = 0; col < NUM_COLS; col++)
            {
                saveArray[saveArrayIndex] = cells[row][col].fullCellText();
                saveArrayIndex++;
            }
        }
        return saveArray;
    }

    @Override
    public void loadFrom(String[] saveData) {
        for (int i = 0; i < saveData.length; i++)
        {
            // convert counter to 2d array indexes
            int row = i / NUM_COLS;
            int col = i % NUM_COLS;

            processCellAssignment(row, col, saveData[i]);
        }
    }
}
