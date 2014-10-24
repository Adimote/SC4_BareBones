package Interpreter.variables;

/**
 * Sample Variable for extending barebones to have more variables. This one is a string.
 * Created by abs1g14 on 24/10/2014.
 */
public class B_String extends Variable {
    protected String type = "String";
    private String value = "";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
