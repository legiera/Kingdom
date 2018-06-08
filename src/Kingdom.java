import java.util.ArrayList;
import java.util.List;

public class Kingdom {
    public String name;
    public King king;
    private List<Senior> seniors;
    private List<Knight> knights;


    Kingdom(String name, King king) {
        this.name = name;
        this.king = king;
        this.seniors = new ArrayList<>();
        this.knights= new ArrayList<>();
        System.out.printf("The kingdom %s was created\nIt's king is %s\n", name, king.getname());
    }

    public List<Senior> getSeniors() {
        return seniors;
    }
    public List<Knight> getKnights() {
        return knights;
    }

    public void addSenior(Senior senior){
        seniors.add(senior);
    }
    public void addKnight(Knight knight){
        knights.add(knight);
    }
}


