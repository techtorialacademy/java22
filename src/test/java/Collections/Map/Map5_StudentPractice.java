package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Map5_StudentPractice {
    public static void main(String[] args) {

        HashMap<String, String> student1 = new HashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");
        HashMap<String, String> student2 = new HashMap<>();
        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michealson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "High Park");
        HashMap<String, String> student3 = new HashMap<>();
        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");
        HashMap<String, String> student4 = new HashMap<>();
        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        // Creating a List of HashMaps
        ArrayList<HashMap<String, String>> studentList = new ArrayList();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student4);
        studentList.add(student3);
        System.out.println(studentList);

        findChicago(studentList);
        findStudent(studentList);
    }

 // Create a method that will take ArrayList of HashMaps as a parameter and will print
    // the name of the students who live in chicago.
    public static void findChicago(ArrayList<HashMap<String,String>> studentList){
        for (HashMap<String,String> student: studentList){
            if(student.get("City").equalsIgnoreCase("Chicago")){
                System.out.println(student.get("FirstName") + " is living in Chicago.");
            }

        }

    }
    // create a method that will find out all male students who are under the age of 26
    public static void findStudent(ArrayList<HashMap<String,String>> studentList){
        for (HashMap<String,String> student: studentList){
            if(Integer.parseInt(student.get("Age")) < 26  && student.get("Gender").equalsIgnoreCase("M")){
                System.out.println(student.get("FirstName") + " is male under 26");
            }

        }

    }

}
