package src;

public class ComplexObject {

    private String name;
    private NestedObject nestedObject;

    public ComplexObject(String name) {
        this.name = name;
        this.nestedObject = new NestedObject("Nested info for " + name);
    }

    public String getName() {
        return name;
    }

    public NestedObject getNestedObject() {
        return nestedObject;
    }
}
