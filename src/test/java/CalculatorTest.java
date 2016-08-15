
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)

public class CalculatorTest{

    private Calculator calc;

    @Parameterized.Parameters
    public static Iterable<Object> data(){
        return Arrays.asList(new Object[][]{
                {1, 7, '+', 8},
                {1, 7, '-', -6},
                {1, 7, '*', 7},
                {8, 2, '/', 4}
        });
    }

    private Integer firstArg, secondArg, result;
    private Character operation;

    public CalculatorTest(Integer firstArg, Integer secondArg, Character operation, Integer result){
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.operation = operation;
        this.result = result;
    }

    @Before
    public void setCalc(){
        calc = new Calculator();
    }

    @Test
    public void test(){
        calc.calculate(firstArg,secondArg, operation);
        assertEquals(result, (Integer) calc.getResult());
    }
/*

    @Test
    public void evaluateCalculationsAdd(){
        calc.calculate(1,7,'+');
        assertEquals(8, calc.getResult());
    }

    @Test
    public void evaluateCalculationsSubtract(){
        calc.calculate(1,7,'-');
        assertEquals(-6, calc.getResult());
    }

    @Test
    public void evaluateCalculationsMultiply(){
        calc.calculate(1,7,'*');
        assertEquals(7, calc.getResult());
    }

    @Test
    public void evaluateCalculationsDivide(){
        calc.calculate(8,2,'/');
        assertEquals(4, calc.getResult());
    }
*/

/*
    @Test
    public void evaluateCalculationsZero(){
        assertEquals(0, calc.getResult());
    }
*/

}