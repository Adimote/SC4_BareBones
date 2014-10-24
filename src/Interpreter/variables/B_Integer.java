package Interpreter.variables;

/**
 * Integer class, stores and contains increments and decrements
 * Created by abs1g14 on 24/10/2014.
 */
public class B_Integer extends Variable {
    protected String type = "Integer";
    private int value = 0;

    public void incr() {
        this.value ++;
    }

    public void decr() {
        this.value --;
    }

    public void clear() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}