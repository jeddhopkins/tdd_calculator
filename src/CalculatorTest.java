import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Calculator {
	
	public Calculator calc;
	
	@BeforeEach
	public void before() {
		calc = new Calculator();
	}
	
	@Nested
	@DisplayName("adding two numbers")
	class Adding {
		
		@DisplayName("3 + 3 should equal 6")
		@Test
		void threeThree() {
			assertEquals(6, calc.add(3, 3));
		}
		
		@DisplayName("(-4) + 3 should equal -1")
		@Test
		void fourThree() {
			assertEquals(-1, calc.add(-4, 3));
		}
		
		@DisplayName("3 + (-4) should equal -1")
		@Test
		void threeFour() {
			assertEquals(-1, calc.add(3, -4));
		}

//		@DisplayName("2.5 + 2.6 equals 5.1")
//		@Test
//		void decimalDecimal() {
//			assertEquals(5.1, calc.add(2.5, 2.6));
//		}
	}
	
	@Nested
	@DisplayName("subtracting two numbers")
	class Subtracting {
		
		@DisplayName("8 - 4 equals 4")
		@Test
		void eightFour() {
			assertEquals(4, calc.subtract(8, 4));
		}
		
		@DisplayName("10 - (-2) equals 12")
		@Test
		void tenTwo() {
			assertEquals(12, calc.subtract(10, -2));
		}
		
		@DisplayName("-3 - 5 equals -8")
		@Test
		void threeFive() {
			assertEquals(-8, calc.subtract(-3, 5));
		}
	}
	
	@Nested
	@DisplayName("multiplying two numbers")
	class Multiplying {
		
		@DisplayName("5 * 5 equals 25")
		@Test
		void fiveFive() {
			assertEquals(25, calc.multiply(5, 5));
		}
		
		@DisplayName("5 * (-6) equals -30")
		@Test
		void fivesix() {
			assertEquals(-30, calc.multiply(5, -6));
		}
		
		@DisplayName("(-5) * 5 equals -25")
		@Test
		void minusfiveFive() {
			assertEquals(-25, calc.multiply(-5, 5));
		}
	}
	
	@Nested
	@DisplayName("dividing two numbers")
	class Divide {
		
		@DisplayName("10 / 5 equals 2")
		@Test
		void tenTwo() {
			assertEquals(2, calc.divide(10, 5));
		}
		
		@DisplayName("(-10) / 5 equals -2")
		@Test
		void minustenfive() {
			assertEquals(-2, calc.divide(-10, 5));
		}
		
		@DisplayName("10 / (-2) equals -5")
		@Test
		void tenminusTwo() {
			assertEquals(5, calc.divide(10, 2));
		}
		
		@DisplayName("10 / 0 throws an error")
		@Test
		void tenzero() {
			assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
		}
	}
	
	@Nested
	@DisplayName("square of a number")
	class Square {
		
		@DisplayName("6 squared equals 36")
		@Test
		void sixSix() {
			assertEquals(36, calc.square(6));
		}
	}
	
	@Nested
	@DisplayName("square root of a number")
	class SquareRoot {
		
		@DisplayName("square root of 64 equals 8")
		@Test
		void sixtyfour() {
			assertEquals(8, calc.sqroot(64));
		}
	}
	
}