package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

/**
 * The main UI
 **/
public class UI extends JFrame {

    /*The panel with three area*/
    private JPanel panel;

    public UI(int width, int height, JPanel panel) throws HeadlessException {
        this.panel = panel;
        this.setPreferredSize(new Dimension(width, height));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setContentPane(this.panel);
        this.pack();
        this.setVisible(false);
    }

    /**
     * init the menu and display this frame
     *
     * @param controller controller
     */
    public void initAdShow(Controller controller) {
        initMenu(controller);
        this.setVisible(true);
    }

    /**
     * init the menu
     *
     * @param controller controller
     */
    private void initMenu(Controller controller) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Update model");
        JMenuItem menuItem = new JMenuItem("Save input centimeters");
        menu.add(menuItem);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);

        menuItem.addActionListener((e) -> controller.save());
    }


}
