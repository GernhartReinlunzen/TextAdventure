package control;

import view.MainView;
import view.TextAdventureView;

import javax.swing.*;

/**
 * Created by Amasso on 20.09.2016.
 */
public class ViewHandler {

    TextAdventureView currentView;

    public ViewHandler(){
        currentView = new MainView(this);
    }

    public void changeCurrentFrameTo(TextAdventureView view){
        currentView.setVisible(false);
        currentView.dispose();

        currentView = view;
    }

    public TextAdventureView getCurrentFrame(){
        return currentView;
    }

}
