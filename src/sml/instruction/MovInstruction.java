package sml.instruction;

import sml.Instruction;
import sml.Machine;
import sml.RegisterName;

public class MovInstruction extends Instruction{
    private final RegisterName result;
    private final int x;

    public static final String OP_CODE = "mov";

    public MovInstruction(String label, RegisterName result, int x) {
        super(label, OP_CODE);
        this.result = result;
        this.x = x;
    }

    @Override
    public int execute(Machine m) {
        int value = x;
        m.getRegisters().set(result, value);
        return NORMAL_PROGRAM_COUNTER_UPDATE;
    }

    @Override
    public String toString() {
        return getLabelString() + getOpcode() + " " + result + " " + x;
    }
}
