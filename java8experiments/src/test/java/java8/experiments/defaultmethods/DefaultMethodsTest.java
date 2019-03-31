package java8.experiments.defaultmethods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class DefaultMethodsTest {

    @Test
    public void TestDefaultMethods(){
        FirstInterface firstInterface = new Impl();
        SecondInterface secondInterface = new Impl();
        Impl impl = new Impl();

        System.out.println ("Printing object of firstInterface");
        firstInterface.show();
        firstInterface.showFirstInterface();
        firstInterface.squareFirstInterface();
        System.out.println ("-------------------------------");
        System.out.println ("Printing object of secondInterface");
        secondInterface.show();
        secondInterface.showSecondInterface();
        secondInterface.squareSecondInterface();
        System.out.println ("-------------------------------");

        System.out.println ("Printing object of Impl");
        impl.show();
        impl.showFirstInterface();
        impl.showSecondInterface();
        impl.squareFirstInterface();
        impl.squareSecondInterface();
        System.out.println ("-------------------------------");
    }
}
