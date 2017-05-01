package textExcel;

public class CellFormatter
{
    /**
     * @param value
     * @param colWidth
     * @return value formatted with right and left padding so that it's centered
     *         within a cell of colWidth, or truncated if it's too long
     */
    public static String formatCell(String value, int colWidth)
    {
        // truncate the value if it's too big to fit in a cell
        if (value.length() > colWidth)
        {
            return value.substring(0, colWidth - 1) + ">";
        }

        String paddedString = getLeftPadding(value, colWidth) + value;

        // this formatting will left justify the string and add right padding as
        // needed to fill out the width of the cell
        return String.format(String.format("%%-%ds", colWidth), paddedString);
    }

    /**
     * @param value
     * @param colWidth
     * @return the "left padding" string needed to center the value in a cell of
     *         colWidth
     */
    private static String getLeftPadding(String value, int colWidth)
    {
        // calculate the number of left padding spaces
        int lengthOfData = value.length();
        int padLeft = (colWidth - lengthOfData) / 2;

        String leftPadding = "";
        for (int i = 0; i < padLeft; i++)
        {
            leftPadding += " ";
        }

        return leftPadding;
    }
}
