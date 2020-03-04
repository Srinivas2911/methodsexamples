public class MethodsExample2 {          // class declared

    // Methods with no return type but with parameters

    public static void main(String[] args) {        // main method - static

        MethodsExample2 obj = new MethodsExample2();      // object creation for instance method
        obj.myHouseNo(21, "Rosewood");          // instance method in static main method
        myDivide(100, 20);                           // static method called directly
    }

    //instance method with no return type but with parameters int and string
    public void myHouseNo(int add, String name) {   // parameters int ad string
//        add = 21;
//        name = "Rosewood";
        System.out.println("House address is : " + add + ", " + name);
    }

    // static method with no return but with parameters int a and int b;
    public static void myDivide(int a, int b) {
        int result = a / b;
        System.out.println("Division result is : " + result);
    }
}
