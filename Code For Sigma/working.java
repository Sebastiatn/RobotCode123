import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Finch bird = new Finch();
        while((bird.getDistance()) > 5) {
        	bird.setMove("F", 10.0, 10.0);
        	System.out.println("Distance to object: " + bird.getDistance());
        	if((bird.isShaking())) {
        		System.out.print("Robot is shaking");
        		bird.setTurn("R", 90, 10);

        	}
        }
    }
}
