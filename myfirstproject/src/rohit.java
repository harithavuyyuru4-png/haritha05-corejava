
public class rohit {
	 static String teamName = "India";

	    // Instance Variables (separate for each object)
	    String playerName;
	    int runs;

	    public static void main(String[] args) {

	        // Object 1
	        CricketPlayer player1 = new CricketPlayer();
	        player1.playerName = "Virat Kohli";
	        player1.runs = 13800;

	        // Object 2
	        CricketPlayer player2 = new CricketPlayer();
	        player2.playerName = "Rohit Sharma";
	        player2.runs = 11000;

	        // Display Player 1 Details
	        System.out.println("Player 1 Details");
	        System.out.println("Team Name : " + CricketPlayer.teamName);
	        System.out.println("Player Name : " + player1.playerName);
	        System.out.println("Runs : " + player1.runs);

	        System.out.println();

	        // Display Player 2 Details
	        System.out.println("Player 2 Details");
	        System.out.println("Team Name : " + CricketPlayer.teamName);
	        System.out.println("Player Name : " + player2.playerName);
	        System.out.println("Runs : " + player2.runs);

	        System.out.println();

	        // Changing Static Variable
	        CricketPlayer.teamName = "Indian Cricket Team";

	        System.out.println("After Changing Team Name");
	        System.out.println("Player 1 Team : " + player1.teamName);
	        System.out.println("Player 2 Team : " + player2.teamName);
	    }
	}
	

}

}


}
