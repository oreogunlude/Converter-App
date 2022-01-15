package view;

import javax.swing.*;
import java.awt.*;

/**
 * The JPanel class
 **/
public class MyPanel extends JPanel {

    private JTextArea centimetersArea;
    private JTextArea feetArea;
    private JTextArea metersArea;

    /**
     * create the JPanel with three areas
     *
     * @param centimetersArea centimeters area
     * @param feetArea        feet area
     * @param metersArea      meters area
     * @param width           JPanel width in pixels
     * @param height          JPanel height in pixels
     */
    public MyPanel(JTextArea centimetersArea, JTextArea feetArea, JTextArea metersArea, int width, int height) {
        this.centimetersArea = centimetersArea;
        this.feetArea = feetArea;
        this.metersArea = metersArea;

        this.setPreferredSize(new Dimension(width, height));
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(this.feetArea, constraints);

        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        constraints.gridheight = GridBagConstraints.RELATIVE;
        this.add(this.metersArea, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(this.centimetersArea, constraints);
    }

    /**
     * return the centimetersArea
     *
     * @return centimetersArea
     */
    public JTextArea getCentimetersArea() {
        return centimetersArea;
    }
}
