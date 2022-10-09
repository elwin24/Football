import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello football!");
        List<Team> teams = new ArrayList<>();

        Team team = new Team("Kapaz",12);
        teams.add(team);
        System.out.println(teams);
    }
}