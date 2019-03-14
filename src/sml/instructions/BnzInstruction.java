package sml.instructions;

import sml.Instruction;
import sml.Machine;

public final class BnzInstruction extends Instruction {


    private int op1;
    private String op2;

    /**
     * @param label of the instruction
     * @param op    the operands
     */
    public BnzInstruction(String label, String op) { super(label, op); }

    /**
     * @param label     of the instruction
     * @param label2    of the computation
     * @param operator1 the first operand
     */
    public BnzInstruction(String label, int operator1, String label2) {
        this(label, "bnz");
        this.op1 = operator1;
        this.op2 = label2;

    }

    /**
     * Execute the instruction, probably modifying the registers.
     *
     * @param m the machine under which the instruction executes
     */

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int branchInstruction = m.getLabels().indexOf(op2);
        if (value1 != 0) {
            m.setPc(branchInstruction);
        }
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
