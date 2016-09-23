package View.OUK;

import View.TextAdventureView;

import javax.swing.*;
/**
 * Created by Amasso on 20.09.2016.
 */
public class OMainView extends TextAdventureView {
    private JPanel mainPanel;
    private JTextPane mainTextPane;

    public OMainView(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
