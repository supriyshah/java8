package java8.experiments.defaultmethods;

public interface SecondInterface {

    public int square();

    public void squareSecondInterface();

    default void showSecondInterface(){
        System.out.println ("Default method showSecondInterface in Second Interface");
    }

    default void show(){
        System.out.println ("Default method show in Second Interface");
    }
}
