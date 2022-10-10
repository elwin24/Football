import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    public static void service(int command) {
        switch (command) {
            case 1 -> showTable();
            case 2 -> addTeam();
            case 3 -> deleteTeam();
            case 4 -> playMatch();
            default -> {
            }
        }
        Collections.sort(Main.teams);
    }

    static void showTable() {
        System.out.println("************** TABLE **************");
        for (int i = 0; i < Main.teams.size(); i++) {
            int place = i + 1;
            System.out.println(place + ".   " + Main.teams.get(i));
        }
    }

    static void addTeam() {
        String teamName = "";
        int teamPoint = 0;
        System.out.println("Adding team . . .");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please add name of team: ");
        teamName = scanner1.nextLine();
        System.out.println("Please add points of team: ");
        teamPoint = scanner1.nextInt();
        Team newTeam = new Team(teamName, teamPoint);
        Main.teams.add(newTeam);
        System.out.println("Team was added successfully ! ");
    }

    static void deleteTeam() {
        String deleteTeam="";
        boolean bool = false;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Select which team you want to delete: ");
        deleteTeam = scanner2.nextLine();

    }

    static void playMatch() {

    }
}
