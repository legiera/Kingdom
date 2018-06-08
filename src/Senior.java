import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

class Senior extends Knight {
    private King lord;
    private List<Knight> seniorsknights;

    public Senior(){
        Random rand = new Random();
        this.income= rand.nextInt(10) + 1;
    }

}
