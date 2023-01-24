package mediumTests;

import application.Calculator;

import java.util.stream.IntStream;

public class MediumTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - average value
  public void testAverageValue(){
    int actualResult = calc.average(1, 2,3,3);
    int expectedResult=2;
    assertEquals(actualResult, expectedResult, "averageValue must be 2");
  }
  //TODO (**)
  //add tests for new method - even or odd
  public void testEvenOrOdd(){
    int actualResult = calc.evenOrOdd(2);
    int expectedResult=1;
    assertEquals(actualResult, expectedResult, "number is even");
  }

  //TODO (**)
  //add tests for new method - biggest value
  public void testBiggestValue(int a, int b){
  if a>b=
  }
}
