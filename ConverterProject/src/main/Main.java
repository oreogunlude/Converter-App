package main;

import controller.Controller;
import model.ConversionAreaFactory;
import model.ValueToConvert;
import view.MyPanel;
import view.UI;

import javax.swing.*;
import java.awt.*;

/**
 * The main class
 **/
public class Main {

    /**
     * init controller, ui and model, then launch this program
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ValueToConvert model = new ValueToConvert();
            ConversionAreaFactory factory = new ConversionAreaFactory();
            JTextArea centimetersConversionArea = factory.create(Color.YELLOW, model, 200);
            JTextArea feetConversionArea = factory.create(Color.GREEN, model, 200);
            JTextArea metersConversionArea = factory.create(Color.ORANGE, model, 200);
            MyPanel panel = new MyPanel(centimetersConversionArea, feetConversionArea, metersConversionArea, 600, 500);
            Controller controller = new Controller(panel.getCentimetersArea(), model);
            UI ui = new UI(600, 500, panel);
            ui.initAdShow(controller);
        });
    }
}
