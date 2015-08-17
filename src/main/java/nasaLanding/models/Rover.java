package nasaLanding.models;

import nasaLanding.common.Direction;
import nasaLanding.exceptions.ExceedPlatformException;
import nasaLanding.exceptions.InvalidDirectiveException;

public class Rover implements Mouvement {
	
	private int x;
	private int y;
	private Direction d;
	
	public Rover(){
		
	}
	
	public Rover(int x, int y, Direction d){
		this.x = x;
		this.y = y;
		this.d = d;
	}
	
	public Rover(int x, int y, char d){
		this.x = x;
		this.y = y;
		switch(d){
			case 'N':
				this.d = Direction.NORTH;
			break;
			
			case 'S':
				this.d = Direction.SOUTH;
			break;
			
			case 'W':
				this.d = Direction.WEST;
			break;
			
			case 'E':
				this.d = Direction.EAST;
			break;
			
		}
	}
	
	public String toString(){
		switch(d){	
			
		case NORTH:
			return this.x+" "+this.y+" N";
		case SOUTH:
			return this.x+" "+this.y+" S";
		case WEST:
			return this.x+" "+this.y+" W";
		case EAST:
			return this.x+" "+this.y+" E";
		default :
			return "ERROR";
		}
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		Rover other = (Rover) obj;
		return (this.x == other.x) && (this.y == other.y) && (this.d == other.d); 
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Direction getDirection() {
		return d;
	}
	public void setDirection(Direction direction) {
		this.d = direction;
	}

	public void turn(char t, int H, int L) throws InvalidDirectiveException {
		// TODO Auto-generated method stub
		// System.out.println("---------------");
		// System.out.println("Turning "+this.toString()+" to "+t);
		if(t=='L'){
			switch(this.d){
				case NORTH :
					this.d = Direction.WEST;
				break;
				
				case SOUTH:
					this.d = Direction.EAST;
				break;
				
				case EAST:
					this.d = Direction.NORTH;
				break;
				
				case WEST:
					this.d = Direction.SOUTH;
				break;
				
			}
		}
		else if(t=='R'){
			switch(this.d){
			case NORTH :
				this.d = Direction.EAST;
			break;
			
			case SOUTH:
				this.d = Direction.WEST;
			break;
			
			case EAST:
				this.d = Direction.SOUTH;
			break;
			
			case WEST:
				this.d = Direction.NORTH;
			break;
			
		}
			
		}
		else{ // Invalid input 
			throw new InvalidDirectiveException("");
		}
		
		//System.out.println("Turning end of "+this.toString());
	}

	
	public void step(int H, int L) throws ExceedPlatformException {
		//System.out.println("---------------");
		// System.out.println("Moving "+this.toString());
		
		switch(this.d){
			case NORTH:
				this.y++;
			break;
			
			case SOUTH:
				this.y--;
			break;
				
			case EAST:
				this.x++;
			break;
				
			case WEST:
				this.x--;
			break;
		}
		
		// System.out.println("End Moving "+this.toString());
		
		if(this.x > L || this.y > H || this.x < 0|| this.y <0 ){
			throw new ExceedPlatformException("Rover hors de la plateforme");
		}
			
		
	}

	
	public void move(char t, int H, int L) throws InvalidDirectiveException, ExceedPlatformException {
		if(t=='L' || t=='R')
			this.turn(t, H, L);
		else if(t=='M')
			this.step( H, L);
		else
			throw new InvalidDirectiveException("Directive invalide :"+t);
	}
	
	
}
