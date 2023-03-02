package sml.instruction;

import sml.Instruction;
import sml.Machine;
import sml.RegisterName;

public class MovInstruction extends Instruction{
    private final RegisterName result;
    private final RegisterName integer;

    public static final String OP_CODE = "mov";

    public MovInstruction(String label, RegisterName result, RegisterName source) {
        super(label, OP_CODE);
        this.result = result;
        this.integer = source;
    }

    @Override
    public int execute(Machine m) {
        int value = m.getRegisters().get(integer);
        m.getRegisters().set(result, value);
        return NORMAL_PROGRAM_COUNTER_UPDATE;
    }

    @Override
    public String toString() {
        return getLabelString() + getOpcode() + " " + result + " " + integer;
    }
}
