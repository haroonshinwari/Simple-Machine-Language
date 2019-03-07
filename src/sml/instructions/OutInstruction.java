package sml.instructions;

import sml.Instruction;
import sml.Machine;

public final class OutInstruction extends Instruction {

    private int op1;

    /**
     * @param label of the instruction
     * @param op    the operands
     */
    public OutInstruction(String label, String op) { super(label, op); }

    /**
     * @param label     of the instruction
     * @param res       of the computation
     * @param operator1 the first operand
     * @param operator2 the second operand
     */
    public OutInstruction(String label, int res, int operator1, int operator2) {
        this(label, "out");
        this.op1 = operator1;
    }

    /**
     * Execute the instruction, probably modifying the registers.
     *
     * @param m the machine under which the instruction executes
     */

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        this.toString();
    }

    /**
     * String representation of the instruction
     *
     * @return representation of the operands and result
     */
    @Override
    public String toString() {
        return super.toString() + " " + op1;
    }


}
