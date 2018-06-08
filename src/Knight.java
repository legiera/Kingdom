public class Knight {

    private String name;
    private Senior successor;
    private int crewvolume; // ilość wojów
    public int income;

    public Knight(){
        this.name="";
        this.successor=null;
        this.crewvolume=0;
        this.income=0;
        System.out.printf("The knight %s was created\n", name);
    }
    public Knight(String name, Senior successor, int crew){
        this.name=name;
        this.successor=successor;
        this.crewvolume=crew;
        this.income=0;
        System.out.printf("The knight %s was created\n", name);
    }
    void setSuccessor(Senior successor){
        this.successor = successor;
        this.income = successor.income/2;
    }

    String getname(){return name;}
    Senior getSuccessor(){return successor;}
    int getcrewvolume(){return crewvolume;}
    int getIncome(){return income;}


}
