package finch;

public class Main {
	public static void main(String[] args) {
		String up = "f";
		int[] led = {0,0,0,0,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0};
		Finch bird = new Finch();
		bird.setDisplay(led);
		while(!(up.equals("f"))) {
			System.out.print("Distance to obstacle: " + bird.getDistance());
			bird.setMove("F",999,50);
			if((bird.isShaking()) == true) {
				bird.pause(1.5);
				bird.getSound();
			}else {
				bird.setMove("F", 10, 100);
			}
		}		
	}
	public void setDisplay(int[] led, int set, int value) {
		int count = 0;
		int setValue = set;
		for(int i = 0; i < led.length; i++) {
			count++;
			if(count == setValue) {
				led[i] = value;
			}
		}
	}
}
