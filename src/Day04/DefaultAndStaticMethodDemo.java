package Day04;
interface IPLPlayer {
    void role();

    default void fitnessTest() {
        System.out.println("Passed the standard Yo-Yo fitness test.");
    }

    static void tournamentRules() {
        System.out.println("Rule: Each team has 20 overs per innings.");
    }
}

class Batsman implements IPLPlayer {
    @Override
    public void role() {
        System.out.println("Role: Top-order batsman.");
    }
}

class Bowler implements IPLPlayer {
    @Override
    public void role() {
        System.out.println("Role: Fast bowler.");
    }

    @Override
    public void fitnessTest() {
        System.out.println("Passed fast-bowler-specific workload test.");
    }
}

public class DefaultAndStaticMethodDemo {
    public static void main(String[] args) {
        IPLPlayer.tournamentRules();

        System.out.println();

        IPLPlayer player1 = new Batsman();
        player1.role();
        player1.fitnessTest();

        System.out.println();

        IPLPlayer player2 = new Bowler();
        player2.role();
        player2.fitnessTest();
    }
}
