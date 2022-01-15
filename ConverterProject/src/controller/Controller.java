package controller;

import model.ValueToConvert;

import javax.swing.*;

/**
 * The Controller class
 **/
public class Controller {

    /*The centimeters conversion area*/
    private JTextArea centimetersConversionArea;
    /*The model*/
    private ValueToConvert model;

    /*The Constructor*/
    public Controller(JTextArea centimetersConversionArea, ValueToConvert model) {
        this.centimetersConversionArea = centimetersConversionArea;
        this.model = model;
    }

    /**
     * retrieves the input value from the yellow view and stores it in the Model
     */
    public void save() {
        String centimeters = centimetersConversionArea.getText();
        model.update(centimeters);
    }

}
