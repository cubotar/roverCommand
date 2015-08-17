package roverCommand.roverCommand;

import nasaLanding.common.Direction;
import nasaLanding.exceptions.ExceedPlatformException;
import nasaLanding.exceptions.InvalidDirectiveException;
import nasaLanding.models.Rover;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeftTurningTest {
	
	private Rover rover;
	
	@Before
	public void initTest(){
		rover = new Rover();
	}
	@Test
	public void test1() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(0);
		this.rover.setY(0);
		this.rover.setDirection(Direction.NORTH);
		rover.move('L', 5, 5);
		Assert.assertEquals(new Rover(0,0,'W'), this.rover);
	}
	@Test
	public void test2() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(0);
		this.rover.setY(0);
		this.rover.setDirection(Direction.EAST);
		rover.move('L', 5, 5);
		Assert.assertEquals(new Rover(0,0,'N'), this.rover);
	}
	
	@Test
	public void test3() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(0);
		this.rover.setY(0);
		this.rover.setDirection(Direction.SOUTH);
		rover.move('L', 5, 5);
		Assert.assertEquals(new Rover(0,0,'E'), this.rover);
	}
	
	@Test
	public void test4() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(0);
		this.rover.setY(0);
		this.rover.setDirection(Direction.WEST);
		rover.move('L', 5, 5);
		Assert.assertEquals(new Rover(0,0,'S'), this.rover);
	}

}
