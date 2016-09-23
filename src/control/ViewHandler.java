package Control;

import View.MainView;
import View.OUK.OMainView;
import View.TextAdventureView;

import javax.swing.*;


/**
 * Created by Amasso on 20.09.2016.
 */
public class ViewHandler {

    TextAdventureView currentView;

    public enum VIEW{
        OUK,PAT
    }

    public ViewHandler(){
        currentView = new MainView(this);
    }

    public void changeCurrentFrameTo(VIEW v){
        currentView.setVisible(false);
        currentView.dispose();

        if(VIEW.OUK.equals(v)){
            currentView = new OMainView();
        }

        if(VIEW.PAT.equals(v)){
            currentView = new OMainView();
        }
    }

    public TextAdventureView getCurrentFrame(){
        return currentView;
    }

}
