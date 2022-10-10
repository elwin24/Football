import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Team> teams = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello football!");


        Team team1 = new Team("Real Madrid", 42);
        Team team2 = new Team("Barcelona", 32);
        Team team3 = new Team("Sevilla", 22);
        Team team4 = new Team("Selta Vigo", 0);
        Team team5 = new Team("Valencia", 10);
        Team team6 = new Team("Betis", 4);

        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);
        teams.add(team5);
        teams.add(team6);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Collections.sort(Main.teams);
            System.out.println("Input command: ");
            int com = scanner.nextInt();
            UserInterface.service(com);
        }

    }
}