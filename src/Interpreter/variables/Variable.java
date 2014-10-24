package Interpreter.variables;

/**
 * Created by abs1g14 on 24/10/2014.
 */
public class Variable {
    protected String type = "Variable";
    public void incr() throws VariableException {
        throw new VariableException(String.format("Variable type: %s does not have a 'incr' function",this.type));
    }

    public void decr() throws VariableException {
        throw new VariableException(String.format("Variable type: %s does not have a 'decr' function",this.type));
    }

    public void clear() throws VariableException {
        throw new VariableException(String.format("Variable type: %s does not have a 'clear' function",this.type));
    }

    public String toString() {
        return "Null";
    }
}