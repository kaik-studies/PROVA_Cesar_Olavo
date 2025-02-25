package OLAVO;

class Robo implements Domesticavel {
    String ID;

    public String getID() {
        return ID;
    }

    public void executarComando() {
        System.out.println(ID + " está executando o comando: " + Comando + ".");
    }
}

public class Atv_006 {
    Robo myRobot;

    public static void main(String[] args) {
        Atv_006 r1 = new Atv_006();
        r1.myRobot = new Robo(); 
        r1.myRobot.ID = "0775"; 
        r1.myRobot.executarComando(); 
    }
}
