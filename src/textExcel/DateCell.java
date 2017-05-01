package textExcel;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCell extends Cell
{
    public DateCell(String value)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormat.parse(value, new ParsePosition(0));

        this.value = dateFormat.format(date);
    }

    @Override
    public String fullCellText()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
        Date date = dateFormat.parse(value, new ParsePosition(0));

        return dateFormat.format(date);
    }
}
