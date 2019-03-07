package sml.instructions;

import sml.Instruction;
import sml.Machine;

// This class represents the subtract instruction - @HaroonShinwari


public final class SubInstruction extends Instruction {
    private int result;
    private int op1;
    private int op2;

    /**
     * @param label of the instruction
     * @param op    the operands
     */
    public SubInstruction(String label, String op) {
        super(label, op);
    }

    /**
     * @param label     of the instruction
     * @param res       of the computation
     * @param operator1 the first operand
     * @param operator2 the second operand
     */
    public SubInstruction(String label, int res, int operator1, int operator2) {
        this(label, "add");
        this.result = res;
        this.op1 = operator1;
        this.op2 = operator2;
    }



}
