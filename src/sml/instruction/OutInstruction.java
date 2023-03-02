package sml.instruction;

import sml.Instruction;
import sml.Machine;
import sml.RegisterName;

public class OutInstruction extends Instruction{
    private final RegisterName result;
    private final RegisterName source;

    public static final String OP_CODE = "out";

    public OutInstruction(String label, RegisterName result, RegisterName source) {
        super(label, OP_CODE);
        this.result = result;
        this.source = source;
    }

    @Override
    public int execute(Machine m) {
        int value = m.getRegisters().get(source);
        System.out.println(value);
        return NORMAL_PROGRAM_COUNTER_UPDATE;
    }

    @Override
    public String toString() {
        return getLabelString() + getOpcode() + " " + source;
    }
}
