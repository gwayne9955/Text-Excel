package textExcel;

abstract class Cell
{
    protected String value;

    /**
     * @return text for spreadsheet cell display
     */
    public String abbreviatedCellText()
    {
        int colWidth = Spreadsheet.getColWidth();

        return CellFormatter.formatCell(value, colWidth);
    }

    /**
     * @return text for individual cell inspection, not truncated or padded
     */
    public String fullCellText()
    {
        return value;
    }
}
