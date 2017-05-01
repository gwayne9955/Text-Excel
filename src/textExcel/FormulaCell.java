package textExcel;

public class FormulaCell extends RealCell
{
    private Spreadsheet sheet;

    public FormulaCell(String value, Spreadsheet sheet)
    {
        this.value = value;
        this.sheet = sheet;
    }

    @Override
    public String abbreviatedCellText()
    {
        int colWidth = Spreadsheet.getColWidth();

        return CellFormatter.formatCell(Double.toString(getDoubleValue()),
                colWidth);
    }

    @Override
    public double getDoubleValue()
    {
        // remove parentheses
        String exp = value.substring(2, value.length() - 2);

        // tokenize the expression
        String[] tokens = exp.split(" ");

        if (tokens[0].toLowerCase().equals("sum")) { return sumCellRange(
                tokens[1], tokens[3]); }

        if (tokens[0].toLowerCase().equals("avg")) { return avgCellRange(
                tokens[1], tokens[3]); }

        // get the first operand
        double operand1 = getOperand(tokens[0]);
        double operand2 = 0.0;
        String operator = null;

        boolean afterOperand = true;

        // process the rest of the expression
        for (int i = 1; i < tokens.length; i++)
        {
            if (afterOperand)
            {
                // should be an operator
                operator = tokens[i];
                afterOperand = false;
            }
            else
            {
                // should be an operand
                operand2 = getOperand(tokens[i]);

                operand1 = doBinaryOperation(operand1, operand2, operator);

                afterOperand = true;
            }
        }

        return operand1;
    }

    private double sumCellRange(String startCell, String endCell)
    {
        // startCell and endCell are the top left and bottom right cells of a
        // rectangular cell range.

        int startCol = Character.toUpperCase(startCell.charAt(0)) - 'A';
        int endCol = Character.toUpperCase(endCell.charAt(0)) - 'A';

        int startRow = Integer.parseInt(startCell.substring(1)) - 1;
        int endRow = Integer.parseInt(endCell.substring(1)) - 1;

        Double sum = 0.0;
        SpreadsheetLocation loc;

        for (int col = startCol; col <= endCol; col++)
        {
            for (int row = startRow; row <= endRow; row++)
            {
                loc = new SpreadsheetLocation(row, col);
                sum += ((RealCell) sheet.getCell(loc)).getDoubleValue();
            }
        }
        return sum;
    }

    private double avgCellRange(String startCell, String endCell)
    {
        // startCell and endCell are the top left and bottom right cells of a
        // rectangular cell range.

        int startCol = Character.toUpperCase(startCell.charAt(0)) - 'A';
        int endCol = Character.toUpperCase(endCell.charAt(0)) - 'A';

        int startRow = Integer.parseInt(startCell.substring(1)) - 1;
        int endRow = Integer.parseInt(endCell.substring(1)) - 1;

        Double sum = 0.0;
        int cellCount = 0;
        SpreadsheetLocation loc;

        for (int col = startCol; col <= endCol; col++)
        {
            for (int row = startRow; row <= endRow; row++)
            {
                loc = new SpreadsheetLocation(row, col);
                sum += ((RealCell) sheet.getCell(loc)).getDoubleValue();

                cellCount++;
            }
        }
        return sum / cellCount;
    }

    private double getOperand(String token)
    {
        if (isCellReference(token))
        {
            SpreadsheetLocation loc = new SpreadsheetLocation(token);
            Cell c = sheet.getCell(loc);

            return ((RealCell) c).getDoubleValue();
        }
        else
        {
            return Double.parseDouble(token);
        }
    }

    private boolean isCellReference(String token)
    {
        final String CELL_REFERENCE = "[a-gA-G]\\d\\d?";

        return token.matches(CELL_REFERENCE);
    }

    private double doBinaryOperation(double operand1, double operand2,
            String operator)
    {
        Double d = 0.0;

        if (operator.equals("+")) {
        	d = operand1 + operand2;
        }
        
        else if (operator.equals("+")) {
        	d = operand1 + operand2;
        }
        
        else if (operator.equals("+")) {
        	d = operand1 + operand2;
        }
        
        else if (operator.equals("+")) {
        	d = operand1 + operand2;
        }
        
        return d;
    }
}
