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

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Jonathan";
        String food = "pizza";
        String email = "kassisj4@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hi," + name);
        System.out.println("Your gpa is: " + gpa);
        System.out.println("The year is " + year);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are NOT a student");
        }
    }
}