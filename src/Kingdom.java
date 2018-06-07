import java.util.List;

public class Kingdom {
    public String name;
    public King king;
    private List<Senior> seniors;

    Kingdom(String name, King king) {
        this.name = name;
        this.king = king;
    }

    public List<Senior> getSeniors() {
        return seniors;
    }
}
