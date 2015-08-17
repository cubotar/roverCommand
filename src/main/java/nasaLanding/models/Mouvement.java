package nasaLanding.models;

import nasaLanding.exceptions.ExceedPlatformException;
import nasaLanding.exceptions.InvalidDirectiveException;

public interface Mouvement {
	
	public void turn(char t, int H , int L) throws InvalidDirectiveException;
	public void step (int H, int L) throws ExceedPlatformException;
	public void move(char t , int H , int L) throws InvalidDirectiveException, ExceedPlatformException;

}
