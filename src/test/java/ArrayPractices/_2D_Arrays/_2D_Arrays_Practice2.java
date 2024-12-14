package ArrayPractices._2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2D_Arrays_Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A school stores 4 main information about their students
        // 1st. -> name
        // 2nd -> address
        // 3rd -> age
        // 4th -> password
        // Now, a school manager wants to enter these information and wants them to be stored.
        // Ask how many students' information will be entered. Then, store them
        // accordingly in reflective data type.
        // Display the name of students that has a higher age than the average age of students.
        System.out.println("Enter the number of students :");
        int numberOfStudents = scanner.nextInt();
        // If you want your nextLine method to work after nextInt()
        // one nextLine method without initializing anything..
        scanner.nextLine();

        // Before the loop we will create an array just to store ages.
        int [] ages = new int[numberOfStudents];


        String[] [] studentInfo = new String[numberOfStudents][4];

        // How many times should I ask about entering a student info?
        // I need to create a loop that repeats numberOfStudents times.
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of student: ");
            String name = scanner.nextLine();

            System.out.println("Enter the address of student: ");
            String address = scanner.nextLine();

            System.out.println("Enter the age of student: ");
            // To store age of a student I need to use string data type.
            int age = scanner.nextInt();
            ages[i] = age;
            String ageVersion = "" + age;
            scanner.nextLine();

            System.out.println("Password: ");
            String password = scanner.nextLine();

            String[] student = {name,address,ageVersion,password};
            // Where should I store student information above?
            studentInfo[i] = student;

        }

        System.out.println(Arrays.toString(studentInfo));

        // Using ages array find the average age
        int ageSum = 0;

        for (int i = 0; i < ages.length; i++) {
            ageSum+= ages[i];
        }
        double average = (double)ageSum / ages.length;

        // I need to look at each student, and then check whose age is bigger than average.
        System.out.println("Average age is "+average);
        for (int i = 0; i < studentInfo.length ; i++) {
            String[] student = studentInfo[i];
            int ageOfStudent = ages[i];
            if(ageOfStudent > average){
                System.out.println("Name: " + student[0] + ", and the age is "+ student[2]);
            }
        }









    }
}
