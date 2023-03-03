package sml.instruction;

import sml.Instruction;
import sml.Machine;
import sml.RegisterName;

public class JnzInstruction extends Instruction{
    private final RegisterName source;
    private final RegisterName result;
    private final RegisterName Label;

    public static final String OP_CODE = "jnz";

    public JnzInstruction(String label, RegisterName source, RegisterName result, RegisterName Label) {
        super(label, OP_CODE);
        this.source = source;
        this.result = result;
        this.Label = Label;
    }

    @Override
    public int execute(Machine m) {
        int value1 = m.getRegisters().get(source);
        if (value1 != 0) {
            int value2 = m.getRegisters().get(Label);
        }
        m.getRegisters().set(result, value1);
        return NORMAL_PROGRAM_COUNTER_UPDATE;
    }

    @Override
    public String toString() {
        return getLabelString() + getOpcode() + " " + source + " " + Label;
    }
}
