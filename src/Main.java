package src;

public class Main {

    public static void main(String[] args) {
        System.out.println("Instanciating SimpleObject...");
        SimpleObject simpleObject = new SimpleObject("Simple Data");
        System.out.println("SimpleObject data: " + simpleObject.getData());

        System.out.println("\nInstanciating ComplexObject...");
        ComplexObject complexObject = new ComplexObject("Complex Name");
        System.out.println("ComplexObject name: " + complexObject.getName());
        System.out.println("Accessing NestedObject...");
        System.out.println(
            "NestedObject info: " + complexObject.getNestedObject().getInfo()
        );

        System.out.println("\nDone.");
    }
}
