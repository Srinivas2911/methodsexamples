public class MethodsExample3 {

    // Methods with return type and with no parameters

    public static void main(String[] args) {            // main method - static

        MethodsExample3 obj = new MethodsExample3();        // object creation
        System.out.println("My age is : "+obj.myAge());     // sout + instance method thru obj
        System.out.println(myMultiply());                   // sout + static method called directly

    }
    // instance method - return type with no parameters
    public int myAge() {            // no parametere defined
        int age = 56;               // local variable
        return age;                 // return
    }

    // static method with return type and no parameters
    public static int myMultiply() {
        int e = 20;             // local variable
        int f = 10;             // local variable
        return e*f;             // return statement
    }

}
