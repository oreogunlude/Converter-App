package model;

import view.ObserverConversionArea;

import javax.swing.*;
import java.awt.*;

/**
 * The Conversion Area Factory
 **/
public class ConversionAreaFactory {

    /**
     * generate the JTextArea according to its color
     *
     * @param color given color
     * @param model model object which is a subject
     * @param width area width
     * @return a JTextArea
     */
    public JTextArea create(Color color, Subject model, int width) {
        if (Color.YELLOW == color) {
            JTextArea centimetersArea = new JTextArea();
            centimetersArea.setBackground(Color.YELLOW);
            centimetersArea.setPreferredSize(new Dimension(width, width));
            centimetersArea.setText("0");
            return centimetersArea;
        } else if (Color.GREEN == color) {
            ObserverConversionArea feetConversionArea = new ObserverConversionArea(new FeetConvertCommand());
            feetConversionArea.setBackground(Color.GREEN);
            feetConversionArea.setPreferredSize(new Dimension(width, width));
            feetConversionArea.setText("0 fit");
            model.register(feetConversionArea);
            return feetConversionArea;
        } else if (Color.ORANGE == color) {
            ObserverConversionArea meterConversionArea = new ObserverConversionArea(new MeterConvertCommand());
            meterConversionArea.setBackground(Color.ORANGE);
            meterConversionArea.setPreferredSize(new Dimension(width, width));
            meterConversionArea.setText("0 m");
            model.register(meterConversionArea);
            return meterConversionArea;
        } else {
            throw new RuntimeException("Unsupported color:" + color);
        }
    }
}
