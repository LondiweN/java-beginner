/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create team1      
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = {player1, player2, player3 };
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        
        // Create team2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        /* Practice 6-2. Remove the two for loops below */
       
         /* Practice 6-2. Create a Game here */
         Game currGame = new Game();
         currGame.homeTeam = team1;
         currGame.awayTeam = team2;
         
        /* Practice 6-2. Create a Goal object here */
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        
        /* Practice 6-2. Put  Goal object in a Goal array and assign Goal array to goals attribute of Game object */
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        /* Practice 6-2. Print out the score of the Game */
        System.out.println("Goal scored after " + currGame.goals[0].theTime + " mins by " + currGame.goals[0].thePlayer.playerName + " of " + currGame.goals[0].theTeam.teamName);
    }   
}
