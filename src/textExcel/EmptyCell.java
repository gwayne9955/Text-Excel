package textExcel;

public class EmptyCell extends Cell
{
    public EmptyCell()
    {
        value = "";
    }

    @Override
    public String fullCellText()
    {
        return "<empty>";
    }
}
