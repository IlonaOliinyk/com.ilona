package Calculator;

/**
 * Created by ilona.oliinyk_tac on 08.06.2017.
 */

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
public class CalculatorTest {
    CalcSingletone CalcSingletoneObject = new CalcSingletone();

    Map<Integer, Integer> testMap;

    @BeforeClass
    public void setup(){

    }

    @Test
    public void MyAddTestMethod(){
        assertEquals(CalcSingletoneObject.add(2,3),5);
    }
    @Test
    @Parameters({"a", "b"})
    public void MySubtractTestMethod(){
        assertEquals(CalcSingletoneObject.subtraction(9,3),6);
    }

    @Test
    public void MyMultiplyTestMethod(){
        assertEquals(CalcSingletoneObject.multiply(9,3),27);
    }

    @Test
    public void MyDivideTestMethod(){
        assertEquals(CalcSingletoneObject.div(9,3),3);
    }


}