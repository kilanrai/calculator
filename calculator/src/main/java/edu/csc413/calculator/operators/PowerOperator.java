package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator {
    public int priority() {
        return 3;
    }

    public Operand execute(Operand op1, Operand op2 ) {
        return new Operand((int)Math.pow((double)op1.getValue(), (double)op2.getValue()));
    }
}
