package Primitives.ArithmeticOperators;

public class Ex3 {
    // A company has 57 testers and there are 8 teams in the company.
    // After assigning equal amount of testers for each team. How many testers
    // won't be assigned with a team?

public static void main(String[] args) {
    int totalTesters = 57, totalTeams = 8;
    // We will have to find the left over after dividing 57 with 8.
    // Because we have 57 testers which should equally distributed to
    // 8 teams. So we have to divide 57 with 8 and then find the lefover.
    int leftOverTesters = totalTesters % totalTeams;
    System.out.println("Total " + leftOverTesters + " testers will be unassigned.");
    // Find out how many testers each team will get?
    int testersPerTeam = totalTesters / totalTeams;
    System.out.println("In each team there will be " + testersPerTeam + " testers.");


    }
}
