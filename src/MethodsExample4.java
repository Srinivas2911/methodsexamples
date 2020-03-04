public class MethodsExample4 {      // class declared

    // methods with return type and with parameters

    public static void main(String[] args) {    // main method - static

        // Method calling with sout for instance and static methods
        MethodsExample4 obj = new MethodsExample4();  // object creation for instance method
        System.out.println("Multiply result is " + obj.myMultiply(10, 20));  // instance method with object
        System.out.println("My address is : " + myAddress(42, "Northwood"));    // static method directly
    }

    //method with return type and with parameters
    public int myMultiply(int a, int b) {       // parameters int a and int b
        return a * b;                           // return value

    }

    // static method with return type with parameters
    public static String myAddress(int c, String address) {  // parameters int and string
        return c + " " + address;                           // return value

    }

}
