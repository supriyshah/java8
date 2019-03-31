package java8.experiments.defaultmethods;

public interface FirstInterface {

    public int square();

    public void squareFirstInterface();

    default void showFirstInterface(){
        System.out.println ("Default method showFirstInterface in First Interface");
    }

    default void show(){
        System.out.println ("Default method show in First Interface");
    }
}
