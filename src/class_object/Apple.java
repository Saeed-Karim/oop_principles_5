package class_object;

public class Apple {

    //default constructor is provided by java to create zero arg object
    public Apple(){
        //Each time you created a new object, this block will be executed
    }

   // Overloading constructor with 3 args
   public Apple(String color, double price, String taste) {
      this.color = color;
      this.price = price;
      this.taste = taste;
   }

    // instance variables - fields - states - attributes (features)
    public String color; // null
    public double price; // 0.0
    public String taste; // null


    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}




