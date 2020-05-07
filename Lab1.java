import java.util.Scanner;

class Lab1 {
    public static void main(String[] args) {

        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);

        // prompt and read a string
        System.out.print("Enter your name: ");
        String username = scanner.next();

        // prompt and read an int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user to enter 'E', 'U', or 'S' for employment status -
        // employed,unemployed, or student.
        System.out.print("'E', 'U', or 'S' for employment status");
        char empStatus = scanner.next().charAt(0);

        // Do you have a car, truck,suv, or do not own a vehicle?
        // (make up your own one letter responses for this).

        System.out.print("'c', 't', or 's' for employment status");
        char vehicle = scanner.next().charAt(0);

        System.out.println(
                String.format("Hello %s, your age is %d, you are %c and have %c", username, age, empStatus, vehicle));

        scanner.close();

        if (age > 16) {
            System.out.println("You are old enough to drive");
            if (age > 18) {
                System.out.println("You are old enough to vote");
                if (age > 21) {
                    System.out.println("You are old enough to drink");
                    if (age > 35) {
                        System.out.println("You are old enough to be President");
                        if (age > 55) {
                            System.out.println("You can join AARP");
                            if (age > 67) {
                                System.out.println("You can starting drawing Social Security");
                            } else {
                                System.out.println("Sorry,You are old enough!!");
                            }
                        } else {
                            System.out.println("You can not join AARP");
                        }
                    } else {
                        System.out.println("You are not enough to be president");
                    }
                } else {
                    System.out.println("You are not old enough to drink!!");
                }
            } else {
                System.out.println("You are not old enough to vote!!");
            }
        } else {
            System.out.println("You are small to drive, wait till 16!!");
        }

        switch (empStatus) {
            case 'e':
            case 'E':
                System.out.println("You are Emplpyed..");
                break;
            case 'u':
            case 'U':
                System.out.println("You are Unemplpyed..");
                break;
            case 's':
            case 'S':
                System.out.println("You are Student..");
                break;
            default:
                System.out.println("plz enter correct character!!");
                break;
        }

        switch (vehicle) {
            case 'c':
            case 'C':
                System.out.println("You own car!!");
                break;
            case 't':
            case 'T':
                System.out.println("You own Truck!!");
                break;
            case 's':
            case 'S':
                System.out.println("You own SUV!!");
                break;
            default:
                System.out.println("plz enter correct character!!");
                break;
        }
    }

}
