import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
	
	Cykles cykles = new Cykles();
	@Test
	public void test_Factorial_1() {
		
		int actual = cykles.Factorial(5);
		int expected = 120;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test_Factorial_2() {
		int actual = cykles.Factorial(0);
		int expected = 1;
		Assertions.assertEquals(expected, actual);				
	}
	@Test
	public void test_Factorial_3() {
		int actual = cykles.Factorial(-6);
		int expected = 1;
		Assertions.assertEquals(expected, actual);				
	}
}

	