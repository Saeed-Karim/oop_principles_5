package class_object;

public class Student {
    public Student(){}

    //Create a constructor that takes 3 args

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        addStudent();
    }


    //Define public instance variables of Student class as below
    //firstName, lastName, Age

    public static int numberOfStudents = 0;

    public static final String program = "Software Engineer Test Program";

    public String firstName;
    public String LastName;
    public int age;

    public void study(){
        System.out.println(this.firstName + " studies");
    }

    public void rests(){
        System.out.println(this.firstName + " " + this.LastName + " " +  "rests");
    }

    public static void addStudent(){
        numberOfStudents++;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
