package Primitives.BooleanComparison;

public class Bool1 {
    public static void main(String[] args) {
        // Let's create a code that will print true if a user can vote.
        // User's age will be given as an integer variable and age to vote is 18 and up.
        int usersAge = 17;
        int ageToVote = 18;
        // How can we print true or false depending on if a user can vote ?
        boolean canVote = usersAge >= ageToVote;

        System.out.println("Can user vote? -> " + canVote);

    }
}
