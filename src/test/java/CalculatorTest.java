/**
 * Created by Администратор on 08.08.16.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest{

    public Calculator calc;

    @Before
    public void setCalc(){
        calc = new Calculator();
    }

    @Test
    public void evaluateCalculationsAdd(){
        calc.calculate(1,7,'+');
        assertEquals(8, calc.getResult());
    }

    @Test
    public void evaluateCalculationsSub(){
        calc.calculate(1,7,'-');
        assertEquals(-6, calc.getResult());
    }

    @Test
    public void evaluateCalculationsMult(){
        calc.calculate(1,7,'*');
        assertEquals(7, calc.getResult());
    }

    @Test
    public void evaluateCalculationsDiv(){
        calc.calculate(8,2,'/');
        assertEquals(4, calc.getResult());
    }

    @Test
    public void evaluateCalculationsZero(){
        assertEquals(0, calc.getResult());
    }

}