package model;

import java.util.List;

/**
 * The command interface which can convert input centimeters values to meter values
 **/
public class MeterConvertCommand implements ConvertCommand {

    private static final double CENTIMETERS_ONE_METER = 100;

    @Override
    public String convert(List<Double> centimeters) {
        StringBuilder sb = new StringBuilder();
        for (Double centimeter : centimeters) {
            sb.append(centimeter / CENTIMETERS_ONE_METER).append(" m\n");
        }
        return sb.toString();
    }
}
