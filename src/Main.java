import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str;
        try (
            // Reverse string using Scanner to take input and a For Loop for iteration
        Scanner userInput = new Scanner(System.in)) {
            System.out.print("Enter a string character here : ");
            str = userInput.nextLine();
        }
        System.out.println("Reverse a String '" + str +"' is :");
        for(int i = str.length(); i > 0; --i) {
            System.out.print(str.charAt(i-1));
        }


    }
}