package frc.team4050;

import frc.team4050.network.Network;
import frc.team4050.vision.Vision;

public class Main {

	private static Main m = new Main();
	private Vision v = new Vision();
	private Network n = new Network();

	public static void main(String args[]) {
		if(args.length > 0){
			if(args[0].equals("-guimode")) {
				m.print("GUI Mode Activated");
				m.createGUI();
			}

			if(args[0].equals("-debugMode")) {
				m.print("Debug Mode Activated (with GUI)");
				m.debugMode();
			}

			else {
				m.print("No \"real\" command detected, skipping");
			}
		} else {
			m.print("No command-line arguments detected, skipping");
		}
		m.loopController();
	}

	void loopController() {
		v.loop();
	}

	void createGUI() {
		//GUI is created in Vision.java for now
	}

	void debugMode() {
		createGUI();
	}

	public void print(String message) {
		System.out.println(message);
	}
}
