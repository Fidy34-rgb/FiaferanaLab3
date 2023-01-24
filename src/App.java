import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Player player1 = new Player("Joe");
        player1.addSport("soccer");
        player1.addSport("hockey");
        player1.addSport("rugby");

        Player player2 = new Player("Chris");
        player2.addSport("basketball");
        player2.addSport("golf");
        player2.addSport("rugby");
        
        Player player3 = new Player("James");
        player3.addSport("baseball");
        player3.addSport("cricket");
        player3.addSport("rounders");

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        String [] listOfSports = { "rugby", "hockey", "baseball", "golf", "rounders", "soccer", "basketball", "cricket"};
    for(String sport: listOfSports){
        for(Player player: players){
            ArrayList<String> sports = player.getSports();
            if(sports.contains(sport))
            {
                System.out.println(player.name + " plays " + sport);
            }
        }
    }
    }
}
