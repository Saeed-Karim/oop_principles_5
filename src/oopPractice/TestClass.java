package oopPractice;



public class TestClass {
    public static void main(String[] args) {
        System.out.println("\nSword1 is created after this line\n");
        Sword sword1 = new Sword("Iron"); // --  default constructor
        System.out.println("Printing out" + sword1);


        System.out.println("\n--------Sword2 is created after this line-----------\n");
        Sword sword2 = new Sword(3.5, 15.0, "Long Sword", "Iron"); // --> Modified Constructor
        System.out.println("Printing out" + sword2);

        System.out.println("\n--------Sword3 is created after this line-----------\n");
        Sword sword3 = new Sword(10.0, 25.0, "Smalls", "Valerian"); // --> Modified Constructor
        System.out.println("Printing out" + sword3);


        System.out.println("\n----------Working with STATIC values----------\n");

        System.out.println(Sword.hasHandle);
        System.out.println(Sword.isSharp);
        // Final values cannot be changed
        // Sword.hasHandle = false


        System.out.println(Sword.isSharp);

        Sword.slash();

        System.out.println("\n----------Working with NON-STATIC Methods----------\n");
        sword1.harms(); // 0.0
        sword2.harms(); // 3.5 * 15 = 52.5
        sword3.harms(); // 10 * 25 = 250.0

        System.out.println("\n-------Working with STATIC  values----------\n");
        Sword.isSharp = true;  //  Reassigned value to TRUE
        System.out.println("hasHandle = " + Sword.hasHandle);
        Sword.damage();

        Sword.slash();




    }
}
