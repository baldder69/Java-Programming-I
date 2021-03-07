
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String input = scanner.nextLine();

        System.out.println("Team: ");
        String team = scanner.nextLine();
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(input))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                String[] parts = row.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team)) {
                    gamesPlayed++;

                    if (homePoints > visitingPoints) {
                        gamesWon++;
                    } else {
                        gamesLost++;
                    }

                }

                if (visitingTeam.equals(team)) {
                    gamesPlayed++;
                    if (visitingPoints > homePoints) {
                        gamesWon++;
                    } else {
                        gamesLost++;
                    }

                }

            }
        } catch (Exception e) {

        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);
    }

}
