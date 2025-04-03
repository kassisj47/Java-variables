public class Main {
    public static void main(String[] args) {

        // ❎ variable = A reusable container for a value.
        //                          A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------                      ---------
        //    int                           string
        //    double                    array
        //    char                        object
        //    boolean

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        int age = 24;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.2;
        double temperature = -12.5;

        char grade = 'B';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Jonathan";
        String food = "pizza";
        String email = "kassisj4@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hi, I am Jonathan!");
        System.out.println("Java is my first programming language");
        System.out.println("My gpa is: " + gpa);

        if(isOnline){
            System.out.println("My email is " + email);
        }
        else{
            System.out.println("Offline");
        }
    }
}