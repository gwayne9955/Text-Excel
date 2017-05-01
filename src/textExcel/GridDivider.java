package textExcel;

public class GridDivider
{
    private String divider;

    public GridDivider(int numCols, int colWidth)
    {
        divider = "";

        // create a string of dashes the width of one cell
        String divForOneCell = "";

        for (int i = 0; i < colWidth; i++)
        {
            divForOneCell += "-";
        }

        divForOneCell += "+";

        // we need to count one more than numCols to account for the left-hand
        // column of row numbers
        for (int col = 0; col <= numCols; col++)
        {
            divider += divForOneCell;
        }

        divider += "\n";
    }

    @Override
    public String toString()
    {
        return divider;
    }
}
