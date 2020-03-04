public class MethodsExample1 {      //class

// Example of Methods with no return and no parameters

    public static void main(String[] args) {        // main method
        // calling all methods into main method

        MethodsExample1 obj = new MethodsExample1();    // object creation
        obj.addition();                                 // addition instance method as object
        myName();                                       // static method called directly
    }

    // instance method - no parameters and no return type
    public void addition() {                // no parameters defined in method
        int a = 20;
        int b = 30;
        System.out.println(a + b);          // print statement
    }

    // static method with no return type no parameters
    public static void myName() {
        String name = "Roger";
        String surname = " McDowell";
        System.out.println(name+" "+surname);   // print statement
    }

}
