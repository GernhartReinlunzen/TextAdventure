package View;

import Control.*;
import View.OUK.OMainView;

import javax.swing.*;

/**
 * Created by 204g06 on 16.09.2016.
 */
public class MainView extends TextAdventureView{
    private JPanel mainPanel;
    private JButton btnViewOUK;
    private JButton btnViewPAT;
    private JLabel label;

    private ViewHandler vHandler;

    public MainView(ViewHandler control){
        vHandler = control;

        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        label.setText("Text Adventure: Regnum Leonum");
        addButtonListener();
    }

    private void addButtonListener() {
        btnViewOUK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                vHandler.changeCurrentFrameTo(new OMainView());
            }
        });

        btnViewPAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                //vHandler.changeCurrentFrameTo();
            }
        });
    }
}
