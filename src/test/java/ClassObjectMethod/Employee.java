package ClassObjectMethod;

public class Employee {
     // By creating our own constructor we could enforce our own logic
    // to create an object.
     // Java always chooses the closest initialization when calling a variable with same name.
    String name;
    String department;
    int yearsOfExperience;
    String title;
    // this keyword
    // this means the current class. And usually used to call instance variable of the class.
    public Employee(String name, String department, int yearsOfExperience, String title){
        this(name,department);
        this.yearsOfExperience = yearsOfExperience;
        this.title = title;
    }

    public Employee(String empName,String departmentName, int experience){
        this(empName,departmentName);
        yearsOfExperience = experience;
    }
    // %99 of the time a constructor is used for initializing the instance variables in the class.

    // An HR should also be able to register an employee without years of experience.
    public Employee(String name, String department){
        System.out.println("This is the common constructor");
        this.name = name;
        this.department = department;
    }

    // Let's create a method to display information of the employee if it is not null
    public void displayInfo(){
       // Let's check if the instance variables are not null
        if(name != null){
            System.out.println("Name of the employee: "+ name);
        }
        if( department != null ){
            System.out.println("Department of the employee: "+ department);
        }
        if(title != null){
            System.out.println("Title of the employee: "+ title);
        }
        if( yearsOfExperience != 0 ){
            System.out.println("Years of experience: " + yearsOfExperience);
        }
    }





      public static void main(String[] args) {
          Employee emp1 = new Employee("Dave","IT", 4);
          System.out.println(emp1.name);
          Employee emp2 = new Employee("Mauro","Finance");
          System.out.println("Department name of employee 2 is " + emp2.department);
          System.out.println("Name of the employee 1 is "+ emp1.name);
          Employee emp3 = new Employee("Alma","IT",1,"Jr. Dev");

          emp1.displayInfo();
          emp2.displayInfo();
          emp3.displayInfo();


      }


}
