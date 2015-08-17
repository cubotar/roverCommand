package nasaLanding.io;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import nasaLanding.models.Rover;

public class Reader {
	
	private Scanner input;

	public Reader(){
		
	}

	public ArrayList<RoundInput> read(InputStream in) {
		
		
		RoundInput round = null;
		Rover rover=null;
		ArrayList<RoundInput> result =new ArrayList<RoundInput>();
		try {
			
			input = new Scanner(in);
			RoundInput.setH(input.nextInt());
			RoundInput.setL(input.nextInt());
			
			while(input.hasNext()){
				rover = new Rover(input.nextInt(),input.nextInt(),input.next().charAt(0));
				round = new RoundInput();
				
				
				round.setRover(rover);
				round.setDirective(input.next());
				
				result.add(round);
				
			}
			
				
			
		} catch (Exception e) {
			
		} finally{
			try {
				in.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		return result;
		
		
	}

}
