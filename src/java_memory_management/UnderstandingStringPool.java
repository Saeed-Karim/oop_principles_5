package java_memory_management;


public class UnderstandingStringPool {
    public static void main(String[] args) {

        String name1 = "John";
        String name2 = "Alex";
        String name3 = "John";
        String name4 = "John";
        String name5 = "JOHN";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        // Create String as a new object
        String name6  = new String("John");

        // name1, name3, name4, and name 6 having value of "John"
        System.out.println(name1  == name3);// true "John" == "John"



    }
}
