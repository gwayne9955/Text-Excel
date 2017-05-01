package textExcel;

public class TextCell extends Cell
{

    public TextCell(String value)
    {
        // trim quotes (") before storing
        this.value = value.substring(1, value.length() - 1);
    }

    @Override
    public String fullCellText()
    {
        // return value in quotes
        return "\"" + value + "\"";
    }
}
