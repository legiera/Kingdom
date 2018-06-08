import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class War{

    public void War(Senior S1, Senior S2, Kingdom K1, Kingdom K2 ){
        System.out.printf("The war begins between %s and %s\n", S1.getname(), S2.getname());
        System.out.printf("The %s army is %d\n", S1.getname(), S1.countArmy());
        System.out.printf("The %s army is %d\n", S2.getname(), S2.countArmy());
        if(S1.countArmy()>S2.countArmy()){
            System.out.printf("The %s was defeated\n", S2.getname());
            S2.destroyArmy(K2.getKnights());
            S2.destroySenioritself(K2.getSeniors());
            S2 = null;
        }
        if(S1.countArmy()<S2.countArmy()){
            System.out.printf("The %s was defeated\n", S1.getname());
            S1.destroyArmy(K1.getKnights());
            S1.destroySenioritself(K1.getSeniors());
            S1 = null;
        }
    }

}




