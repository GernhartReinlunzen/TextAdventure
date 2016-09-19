package Control;
import Model.Creature;

/**
 * Created by 204g06 on 16.09.2016.
 */
public class MainController {

    public MainController(Creature player){
        player = new Creature("",100,5,0,5);
    }

    public void TakeDmg(Creature reciever,int dmg){
        reciever.setHealthPoints(reciever.getHealthPoints()-dmg);
    }

    public void sterben(Creature reciever){

    }
}
