package textExcel;

public class SpreadsheetLocation implements Location
{

    private int row;
    private int col;

    public SpreadsheetLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public SpreadsheetLocation(String cell)
    {
        // cell references are case-insensitive

        this.row = Integer.parseInt(cell.substring(1)) - 1;
        this.col = cell.toUpperCase().charAt(0) - 'A';
    }

    @Override
    public int getRow()
    {
        return row;
    }

    @Override
    public int getCol()
    {
        return col;
    }
}
