package nasaLanding.io;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import nasaLanding.models.Rover;


public class Writer {

	public Writer(){
		
	}

	public void write(ArrayList<Rover> rovers,OutputStream out) {
		
		for(Rover rover : rovers){
			try {
				out.write(rover.toString().getBytes());
				out.write('\n');
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
