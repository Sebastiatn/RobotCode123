import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Finch bird = new Finch();
        while (true) {
            System.out.println("Options:\n1: Start the Robot\n2: Stop the Robot\n3: System Data\n4: Exit");
            int ops = scanner.nextInt();
            scanner.nextLine();
            
            if (ops == 1) {
                String direction = "";
                int distance = 0;
                int speed = 0;
                while (true) {
                    System.out.println("What direction do you want to go? (F/B): ");
                    direction = scanner.nextLine();
                    if (direction.length() > 0 && (direction.substring(0, 1).equalsIgnoreCase("F") || direction.substring(0, 1).equalsIgnoreCase("B"))) {
                        break;
                    } else {
                        System.out.println("Invalid direction. Try again.");
                    }
                }
                System.out.println("How far do you want it to go?: ");
                distance = scanner.nextInt();
                while (true) {
                    System.out.println("What speed do you want? (1-100): ");
                    speed = scanner.nextInt();
                    if (speed >= 1 && speed <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid speed. Try again.");
                    }
                }

                bird.setMove(direction.substring(0, 1), distance, speed);
            } else if (ops == 2) {
                bird.stop();
            } else if (ops == 3) {
                System.out.println("Distance from object: " + bird.getDistance());
                System.out.println("Compass: " + bird.getCompass());
            } else if (ops == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please select from 1 to 4.");
            }
        }
    }
}
