package view;

import model.ConvertCommand;
import model.Observer;

import javax.swing.*;
import java.util.List;

/**
 * The observer conversion area
 **/
public class ObserverConversionArea extends JTextArea implements Observer {

    private ConvertCommand command;

    public ObserverConversionArea(ConvertCommand command) {
        this.command = command;
    }

    @Override
    public void update(List<Double> values) {
        String convertValue = command.convert(values);
        this.setText(convertValue);
    }
}
