import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

class Senior extends Knight {
    private King lord;
    private List<Knight> seniorsknights;

    public Senior(King L, String name){
        super(name, null, 0 );
        Random rand = new Random();
        this.income= rand.nextInt(10) + 1;
        this.lord = L;
        this. seniorsknights = new ArrayList<>();
        System.out.printf("The senior %s was created\n", name);
    }

    public boolean addKnight(Knight K, Kingdom kingdom){
        if(!kingdom.getSeniors().contains(this)) return false;
        if(seniorsknights.size()>7) return false;
        seniorsknights.add(K);
        K.setSuccessor(this);
        kingdom.addKnight(K);
        System.out.printf("The liege homage was made between %s and %s\n", this.getname(), K.getname());
        return true;
    }

    public int countArmy(){
        if(seniorsknights.size()==0) return 0;
        int sum =0 ;
        for(Knight K : seniorsknights){
            sum+= K.getcrewvolume();
        }
        return sum;
    }
    public void destroyArmy(List<Knight>knights){

        for(Knight K:seniorsknights){
            knights.remove(K);
            K = null;
        }
        System.out.printf("The %s's army was destroyed\n", this.getname());
    }
    public void destroySenioritself(List<Senior>seniors){
        System.out.printf("The senior %s was destroyed\n", this.getname());
        seniors.remove(this);
    }
}
