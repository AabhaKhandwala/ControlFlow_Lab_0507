import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        char ans;

        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);
        do {
            // prompt and read a string
            System.out.print("Enter your name: ");
            String username = scanner.next();

            // prompt and read an int
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println(String.format("Hello %s, your age is %d", username, age));

            // scanner.nextLine();

            System.out.println("Do you want to answer the questions again? 'y'for yes 'n'for no");
            ans = scanner.next().charAt(0);

        } while (ans != 'n');

        scanner.close();

    }

}