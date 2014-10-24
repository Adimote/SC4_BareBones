package Interpreter.variables;

/**
 * Variable Exception,
 * Handles an
 * Created by abs1g14 on 24/10/2014.
 */
public class VariableException extends Exception {
    public VariableException() { super(); }
    public VariableException(String message) { super(message); }
    public VariableException(String message, Throwable cause) { super(message, cause); }
    public VariableException(Throwable cause) { super(cause); }
}
