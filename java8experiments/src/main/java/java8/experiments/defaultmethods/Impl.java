package java8.experiments.defaultmethods;

public class Impl implements FirstInterface, SecondInterface {

    int x;

    public Impl(){
        this.x = 5;
    }

    public void show(){
        FirstInterface.super.show();
        SecondInterface.super.show();
    }

    public int square(){
        return x*x;
    }

    public void squareSecondInterface() {
        System.out.println (2);
    }

    public void squareFirstInterface() {
        System.out.println (1);

    }
}
