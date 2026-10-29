package Day04;

abstract class IPLTeam {
    String teamName;

    IPLTeam(String teamName) {
        this.teamName = teamName;
    }

    abstract void playAnthem();

    void playMatch() {
        System.out.println(teamName + " takes the field for a 20-over game.");
    }
}

class CSK extends IPLTeam {
    CSK() {
        super("Chennai Super Kings");
    }

    @Override
    void playAnthem() {
        System.out.println("CSK Anthem: Whistle Podu!");
    }
}

class RCB extends IPLTeam {
    RCB() {
        super("Royal Challengers Bengaluru");
    }

    @Override
    void playAnthem() {
        System.out.println("RCB Anthem: Ee Sala Cup Namde!");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {

        IPLTeam team1 = new CSK();
        team1.playMatch();
        team1.playAnthem();

        System.out.println();

        IPLTeam team2 = new RCB();
        team2.playMatch();
        team2.playAnthem();
    }
}
