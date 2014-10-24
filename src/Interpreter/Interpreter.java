package Interpreter;

import Interpreter.variables.B_Integer;
import Interpreter.variables.Variable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Interpreter Class
 * Created by abs1g14 on 24/10/2014.
 */
public class Interpreter {
    private HashMap<String,Variable> variables;

    public void InterpretLine(String line) {

    }

    private void addInteger(String name, int value) {
        B_Integer variable = new B_Integer();
        variables.put(name, variable);
    }

    public Iterator<Map.Entry<String,Variable>> getVariables() {
        return variables.entrySet().iterator();
        //// The following is Sample code for using this function
        /*
        Iterator<Map.Entry<String,Variable>> it = InterpreterInstance.getVariables();
        while (it.hasNext()) {
            Map.Entry<String,Variable> variable = (Map.Entry)it.next();
            String var_name = variable.getKey();
            Variable var = variable.getValue();
            // Second .getValue() is to get the value of the variable)
            System.out.println("Variable Name: " + var_name + ", Value: " + var.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
        */
    }
}
