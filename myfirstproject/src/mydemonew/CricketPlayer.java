package mydemonew;

public class CricketPlayer {

    static String teamName = "India";

    String playerName;
    int runs;

    public static void main(String[] args) {

        System.out.println("Welcome to Cricket Team");

        // Object ----------------------------1
        CricketPlayer player1 = new CricketPlayer();
        player1.playerName = "Virat Kohli";
        player1.runs = 138;

        System.out.println("Team Name : " + teamName);
        System.out.println("Player Name :"+player1.playerName);
        System.out.println("runs : " + player1.runs);

        // Object----------------------------- 2
        CricketPlayer player2 = new CricketPlayer();
        player2.playerName = "Rohit Sharma";
        player2.runs = 110;

        System.out.println("Player Name :"+ player2.playerName);
        System.out.println("runs :"+player2.runs);
     // Object----------------------------- 3
        CricketPlayer player3 = new CricketPlayer();
        player3.playerName = "jadeja";
        player3.runs = 118;

        System.out.println("Player Name :"+ player3.playerName);
        System.out.println("runs :"+player3.runs);
    }
}