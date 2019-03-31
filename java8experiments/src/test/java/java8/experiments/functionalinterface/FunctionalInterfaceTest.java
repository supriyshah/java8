package java8.experiments.functionalinterface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class FunctionalInterfaceTest {

    @Test
    public void SquareTest(){

        MathOperations mathOperations = (x) -> (x*x);
        System.out.println (mathOperations.executeMathOperation(5));

        mathOperations = (x) -> (Math.sqrt(x));
        System.out.println (mathOperations.executeMathOperation(81));
    }
}
