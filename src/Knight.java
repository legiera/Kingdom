public class Knight {

    private int id;
    private Senior successor;
    private int crewvolume; // ilość wojów
    public int income;

    public Knight(){
        this.id=0;
        this.successor=null;
        this.crewvolume=0;
        this.income=0;
    }
    public Knight(int id, Senior successor, int crew){
        this.id=id;
        this.successor=successor;
        this.crewvolume=crew;
        this.income=successor.income;
    }
    int getid(){return id;}
    Senior getSuccessor(){return successor;}
    int getcrewvolume(){return crewvolume;}
    int getIncome(){return income;}


}
