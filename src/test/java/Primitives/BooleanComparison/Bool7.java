package Primitives.BooleanComparison;


import java.util.Scanner;

public class Bool7 {
//# Company wants to increase their server according to
//# their CPU usage.
//# Create a java program that gets average cpu usage
//# as an input
//# and prints true if we need to launch more servers
//# for our application.
// # When average cpu usage is between 40 and 70 inclusive
//# we should launch a new server.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the CPU usage.");
    int CPUUsage = scanner.nextInt();

    // I want cpu usage to be higher or equal to 40 and less than or equal to 70.

    boolean shouldLaunch = CPUUsage >= 40 && CPUUsage <= 70;

    System.out.println(shouldLaunch);
}
}
