package model;

import java.util.List;

/**
 * The command interface which can convert input centimeters values to feet values
 **/
public class FeetConvertCommand implements ConvertCommand {

    private static final double CENTIMETERS_ONE_FIT = 30.48;

    @Override
    public String convert(List<Double> centimeters) {
        StringBuilder sb = new StringBuilder();
        for (Double centimeter : centimeters) {
            sb.append(centimeter / CENTIMETERS_ONE_FIT).append(" fit\n");
        }
        return sb.toString();
    }
}
