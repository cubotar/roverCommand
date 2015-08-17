package roverCommand.roverCommand;

import nasaLanding.common.Direction;
import nasaLanding.exceptions.ExceedPlatformException;
import nasaLanding.exceptions.InvalidDirectiveException;
import nasaLanding.models.Rover;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StepTest {
	
	private Rover rover;
	
	@Before
	public void initTest(){
		rover = new Rover();
	}
	@Test
	public void test1() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(2);
		this.rover.setY(2);
		this.rover.setDirection(Direction.NORTH);
		rover.move('M', 5, 5);
		Assert.assertEquals(new Rover(2,3,'N'), this.rover);
	}
	@Test
	public void test2() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(2);
		this.rover.setY(2);
		this.rover.setDirection(Direction.SOUTH);
		rover.move('M', 5, 5);
		Assert.assertEquals(new Rover(2,1,'S'), this.rover);
	}
	
	@Test
	public void test3() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(2);
		this.rover.setY(2);
		this.rover.setDirection(Direction.WEST);
		rover.move('M', 5, 5);
		Assert.assertEquals(new Rover(1,2,'W'), this.rover);
	}
	
	@Test
	public void test4() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(2);
		this.rover.setY(2);
		this.rover.setDirection(Direction.EAST);
		rover.move('M', 5, 5);
		Assert.assertEquals(new Rover(3,2,'E'), this.rover);
	}
	
	// TESTING EXCEPTIONS
	
	@Test(expected=InvalidDirectiveException.class)
	public void test5() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(4);
		this.rover.setY(4);
		this.rover.setDirection(Direction.NORTH);
		this.rover.move('G', 5, 5);
	}
	@Test(expected=ExceedPlatformException.class)
	public void test6() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(5);
		this.rover.setY(5);
		this.rover.setDirection(Direction.NORTH);
		this.rover.move('M', 5, 5);
	}
	
	@Test(expected=ExceedPlatformException.class)
	public void test7() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(0);
		this.rover.setY(0);
		this.rover.setDirection(Direction.WEST);
		this.rover.move('M', 5, 5);
	}
	@Test(expected=ExceedPlatformException.class)
	public void test8() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(0);
		this.rover.setY(0);
		this.rover.setDirection(Direction.SOUTH);
		this.rover.move('M', 5, 5);
	}
	
	@Test(expected=ExceedPlatformException.class)
	public void test9() throws InvalidDirectiveException, ExceedPlatformException {
		this.rover.setX(5);
		this.rover.setY(5);
		this.rover.setDirection(Direction.EAST);
		this.rover.move('M', 5, 5);
	}
	

}
