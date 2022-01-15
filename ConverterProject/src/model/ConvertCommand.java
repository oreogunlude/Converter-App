package model;

import java.util.List;

/**
 * The command interface which ca convert input values to other values
 **/
public interface ConvertCommand {

    String convert(List<Double> centimeters);
}
