package textExcel;

public class GridHeader
{
    private String       header;

    private final String cellDivider = "|";

    public GridHeader(int numCols, int colWidth)
    {
        // start out with an empty header cell for the left-hand column,
        // which contains the row numbers.
        header = createEmptyCell(colWidth);

        // add a header cell for each column
        for (int col = 0; col < numCols; col++)
        {
            header += createHeaderCell(col, colWidth);
        }

        header += "\n";
    }

    /**
     * @param col
     *            column number
     * @param colWidth
     *            column width
     * @return a header cell for the column
     */
    private String createHeaderCell(int col, int colWidth)
    {
        return CellFormatter.formatCell(Character.toString((char) ('A' + col)),
                colWidth) + cellDivider;
    }

    /**
     * @param colWidth
     * @return an empty cell of the requested width
     */
    private String createEmptyCell(int colWidth)
    {
        return CellFormatter.formatCell("", colWidth) + cellDivider;
    }

    @Override
    public String toString()
    {
        return header;
    }
}
