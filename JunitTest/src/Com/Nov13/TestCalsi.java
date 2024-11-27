package Com.Nov13;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCalsi {

	@Test
	public void test1() {
		Assert.assertEquals(30, Calculator.addtwo(10, 20));
	}

	@Test
	public void test2() {
		Assert.assertEquals(20, Calculator.subtwo(30, 10));
	}
	
	
}
