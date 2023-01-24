package simpleTests;

import application.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SimpleTestClass {

  Calculator calc = new Calculator();

  @Test
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    int expectedResult=15;
    Assert.assertEquals(actualResult, expectedResult, "10 + 5 must be 15");
  }
  public void testMultiplyTwoNumbers() {
    int actualResult = calc.multiply(10, 5);
    int expectedResult=50;
    Assert.assertEquals(actualResult, expectedResult, "10 * 5 must be 50");
  }
  public void testDivision() {
    int actualResult = calc.division(10, 5);
    int expectedResult=2;
    Assert.assertEquals(actualResult, expectedResult, "10 / 5 must be 2");
  }
  // TODO (*)
  //add tests for new methods (multiply, division, subtraction, square root, x^2)
  public void testSquareRoot() {
    int actualResult = calc.squareRoot(9);
    int expectedResult=3;
    Assert.assertEquals(actualResult, expectedResult, "square root of 9 must be 3");
  }
  public void testDegreeNumber() {
    int actualResult = calc.degreeNumber(9, 2);
    int expectedResult=81;
    Assert.assertEquals(actualResult, expectedResult,"9^2 must be 81");
  }

}
