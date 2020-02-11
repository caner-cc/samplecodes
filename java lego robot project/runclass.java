package pack;

import lejos.hardware.Audio;
import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.Sound;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.utility.Delay;


public class runclass {

	public static void main(String[] args) {
		
			//Color reference sheet
			//RED = 0
			//GREEN = 1
			//BLUE = 2
			//YELLOW = 3
			//MAGENTA = 4
			//ORANGE = 5
			//WHITE = 6
			//BLACK = 7
			
			//Start of code.
			//Declaring objects
			EV3 ev3 = (EV3) BrickFinder.getLocal();
			TextLCD lcd = ev3.getTextLCD();
			Keys keys = ev3.getKeys();
			Audio audio = ev3.getAudio();			
			Movement move = new Movement();
			EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3);
			SensorMode color = colorSensor.getColorIDMode();
		
			
			//Color starts off with none.
			int colorId=-1;
			
			//The do while loop will keep checking the color on the sensor until the color is the stopping color.		
			//The code starts at the press of a key.
			System.out.println("Press a key to start");
			keys.waitForAnyPress();
					
			
			//executes block of code until color is the end color
			do 
			{//scans for color
				//scans the distance at the start of the loop. Inside of this method 
				//there is another chunk of code that has a different loop that checks where the bot should turn to.

				new UltrasonicDistance();
				//scan color
				colorSensor.getColorID();
				//gets put into an integer
				colorId = colorSensor.getColorID();
				audio.playNote(Audio.XYLOPHONE, 400, 200);
				//If blue then go forward
				if (colorId == 7) {
					System.out.println("black");
					move.Forward(70, 2000);
					move.Stop();			
				//If red stop and beep (like a stop sign)
				} else if (colorId == 0) {
					System.out.println("red");								
					move.Stop();
					Sound.beepSequenceUp();
					audio.playNote(Audio.PIANO, 300, 1500);
				//if nothing, beep
				} else if (colorId == -1) {
					System.out.println("none");
					audio.playNote(Audio.XYLOPHONE, 100, 2000);
					Delay.msDelay(3000);			
				} 
				//If the sensor is inbetween colors (aka no piece of code written for them in the if statements), move a bit forward
			/*
			 * else if(colorId >= 3) { System.out.println(colorId); move.Forward(65,1000);
			 * move.Stop(); }
			 */
			//end if green
			}while (colorId != 1);
			Sound.beepSequence();
			Delay.msDelay(3000);
			
			//end of program
			System.out.println("End of the program, press any key to quit");
			keys.waitForAnyPress();
			//Sound.beep();
		
			}
	}


