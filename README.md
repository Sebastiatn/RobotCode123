# finch-robot
---
## Development Checklist

| Completion  | Task |
| ------------- | ------------- |
| Completed | - Connecting the finch robot to the computer and making sure it works also downloading the necessary software for the program to run|
| Completed | - learning the finch library and start coding the robot to preform tasks like moving forward and turning |
| Completed | - Start coding the robot to make it do specific I want  |

## Design Cycle
My design cycle is to start by finding out how and what makes the robot do specifics tasks, finding out these abilities allows the process of coding something more advance is key. After learning and understand what I need to make the robot do specific functions, I would code something basic that I have in mind that follows my task but after testing and making sure it functions without any issue I would test out something a bit more advance such as adding in the speed, directions, and stop. With this I could basically code a basic function of the robotos systems. With LED I want to make sure it has functions like If the LED is in a specific way it would do a task, or when the robot make a move or turn it makes the LED turn a way.

## Code to Highlight
```
        while (!bird.isShaking()) {
            System.out.println("Compass Heading: " + bird.getCompass());
	    System.out.println("Distance from object" + bird.getDistance());
            bird.setMove("F", 999, 50);
            bird.pause(10);
	    if((bird.getDistance()) > 10){
		bird.stop();
	    }
        }
        
```
## Questions
### What was your motivation?
My motivation is to make like a basic car that is able to give me the basic details of what its doing, I wanted to do this because it can give me some starter code that I can later build on and make something more interesting and advance. With more and more add ons the code can becoming something that I am proud off and maybe be something that I can present.
### What did you learn?
I learned the basic of what the robot can do such as the moving, turning, direction, distance, speed, and sensors. But I am able to learn more if I play test more of the code and develop it with other features from the BirdBrain library.
### What makes your project stand out?
My robot is able to give you a basic understanding of what its system is like, giving the user data of its directions, speed, and distances. With the 3d printed object I am able to make it so that it can give you or someone else items, or play a game with it like trying to shoot rubber bands into the basket.
