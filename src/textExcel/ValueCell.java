package textExcel;

import java.text.DecimalFormat;

public class ValueCell extends RealCell
{
    public ValueCell(String value)
    {
        // this is for formatting, e.g., removing trailing zeros
        double d = Double.parseDouble(value);

        this.value = Double.toString(d);
    }

    @Override
    public String fullCellText()
    {
        DecimalFormat df = new DecimalFormat("0");
        df.setMaximumFractionDigits(12);

        return df.format(getDoubleValue());
    }

    @Override
    public double getDoubleValue()
    {
        return Double.parseDouble(value);
    }
}
