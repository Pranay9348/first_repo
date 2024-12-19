import java.util.*;

class Cricketplayer {
    String name;
    int no_of_innings;
    int time_of_notout;
    int total_runs;
    double bat_avg;

    Cricketplayer(String name, int no_of_innings, int time_of_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.time_of_notout = time_of_notout;
        this.total_runs = total_runs;
        this.bat_avg = avg(total_runs, no_of_innings, time_of_notout);
    }

    static double avg(int total_runs, int no_of_innings, int time_of_notout) {
        return ((double) total_runs / (double) (no_of_innings - time_of_notout));
    }

    static void sortPlayer(Cricketplayer[] players) {
        Arrays.sort(players, (player1, player2) -> Double.compare(player2.bat_avg, player1.bat_avg));
    }

    public String toString() {
        return "Name: " + name + ", Innings: " + no_of_innings + ", Not Out: " + time_of_notout + ", Total Runs: " + total_runs + ", Batting Average: " + bat_avg;
    }
}

public class Main {
    public static void main(String[] args) {
        Cricketplayer[] players = new Cricketplayer[5];
        players[0] = new Cricketplayer("Player1", 20, 2, 500);
        players[1] = new Cricketplayer("Player2", 30, 5, 1000);
        players[2] = new Cricketplayer("Player3", 10, 1, 200);
        players[3] = new Cricketplayer("Player4", 40, 3, 1500);
        players[4] = new Cricketplayer("Player5", 25, 4, 800);

        Cricketplayer.sortPlayer(players);

        for (Cricketplayer player : players) {
            System.out.println(player.toString());
        }
    }
}