package nasaLanding.io;

import nasaLanding.models.Rover;

public class RoundInput {
	
	
	private static int H;
	private static int L;
	private Rover rover;
	private String directive;
	
	public static int getH() {
		return H;
	}
	public static void setH(int h) {
		H = h;
	}
	public static int getL() {
		return L;
	}
	public static void setL(int l) {
		L = l;
	}
	
	public Rover getRover() {
		return rover;
	}
	public void setRover(Rover rover) {
		this.rover = rover;
	}
	public String getDirective() {
		return directive;
	}
	public void setDirective(String directive) {
		this.directive = directive;
	}

}
