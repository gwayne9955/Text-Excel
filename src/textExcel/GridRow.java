package textExcel;

public class GridRow
{
    private String       gridRow;

    private final String cellDivider = "|";

    public GridRow(int rowNumber, int colWidth, Cell[] row)
    {
        // start out with a cell containing the row number
        gridRow = createRowNumberCell(rowNumber, colWidth);

        // add a cell for each column in the row
        for (int col = 0; col < row.length; col++)
        {
            gridRow += row[col].abbreviatedCellText() + cellDivider;
        }

        gridRow += "\n";
    }

    private String createRowNumberCell(int rowNumber, int colWidth)
    {
        return CellFormatter.formatCell(Integer.toString(rowNumber + 1),
                colWidth) + cellDivider;
    }

    @Override
    public String toString()
    {
        return gridRow;
    }
}
