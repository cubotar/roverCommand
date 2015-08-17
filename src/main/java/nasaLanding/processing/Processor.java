package nasaLanding.processing;

import java.util.ArrayList;

import nasaLanding.exceptions.ExceedPlatformException;
import nasaLanding.exceptions.InvalidDirectiveException;
import nasaLanding.io.RoundInput;
import nasaLanding.models.Rover;

public class Processor {

	public ArrayList<Rover> process(ArrayList<RoundInput> input) throws ExceedPlatformException, InvalidDirectiveException {
		
		ArrayList<Rover> result = new ArrayList<Rover>();
		for(RoundInput in : input){
			for(int i=0 ; i< in.getDirective().length() ; i++){

					in.getRover().move(in.getDirective().charAt(i),RoundInput.getH(), RoundInput.getL());
				
			}
			result.add(in.getRover());
		}
		
		return result;
		
		
	}

}
