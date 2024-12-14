package ClassObjectMethod.CourseManagement;

import java.util.ArrayList;
import java.util.List;

public class Course {
    // Static variable: shared accross all courses
    static int totalEnrolled;

    String title; // course title
    String instructor;
    int capacity;
    List<String> enrolledStudents;

    // Let's assign non-static variables using a constructor
    public Course(String title, String instructor, int capacity) {
        this.title = title;
        this.instructor = instructor;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }


    // Method to add a student by student name
    public void addStudent(String studentName){
        // How could I check if I do have a capacity?
        if(enrolledStudents.size() < capacity ){
            enrolledStudents.add(studentName);
            totalEnrolled++;
            System.out.println(studentName + " is added to "+ title);
            // What if I want to show number of seats left?
            System.out.println(getRemainingSeats() +" seats available");
        }else{
            System.out.println("Unfortunately "+title+" course does not have enough capacity.");
        }
    }

    // Removing a student with a given name?
    public void removeStudent(String studentName){
        // How could I check if I do have a capacity?
            enrolledStudents.remove(studentName);
            totalEnrolled--;
            System.out.println(studentName + " is removed from "+ title);
    }

    // Method to calculate remaining seats
    public int getRemainingSeats(){
        return capacity - enrolledStudents.size();
    }


    public static void main(String[] args) {
        Course SDET = new Course("SDET","Yusuf",100);
        SDET.addStudent("David Johnson");
        Course DevOps = new Course("DevOps","Jane",50);
        DevOps.addStudent("Sean Wall");
        Course Security = new Course("Cyber Security","Ethan",100);
        Security.addStudent("Luis K");
        System.out.println("Total number of students enrolled in alll courses "+ Course.totalEnrolled);

        // If you want to be able create a course without providing capacity, you have to overload the
        // constructor.

    }


}
