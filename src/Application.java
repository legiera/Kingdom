
public class Application {

    public static void main(String[] args) {
        King king1 = new King("W1");
        King king2 =  new King("W2");

        Kingdom K1 = new Kingdom("K1", king1);
        Kingdom K2 = new Kingdom("K2", king2);

        Senior S1 = new Senior(king1, "S1");
        Senior S2 = new Senior(king1,"S2" );
        Senior S3 = new  Senior(king1,"S3");
        Senior S4 =  new Senior(king2, "S4");
        Senior S5 =  new Senior(king2, "S5");

        K1.addSenior(S1);
        K1.addSenior(S2);
        K1.addSenior(S3);
        K2.addSenior(S4);
        K2.addSenior(S5);

        Knight R1 = new Knight("R1", null, 2);
        Knight R2 = new Knight("R2", null, 3);
        Knight R3 = new Knight("R3", null, 4);
        Knight R4 =  new Knight("R4", null, 5);
        Knight R5 =  new Knight("R5", null, 5);
        Knight R6 =  new Knight("R6", null, 6);

        S1.addKnight(R1,K1);
        S2.addKnight(R2, K1);
        S2.addKnight(R3, K1);
        S3.addKnight(R4,K1);
        S4.addKnight(R5, K2);
        S5.addKnight(R6,K2);

        War W1 = new War();
        W1.War(S1, S2, K1, K1);
        W1.War(S3, S5, K1, K2);


    }
}

