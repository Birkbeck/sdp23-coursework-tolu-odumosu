package sml.instruction;

import sml.Instruction;
import sml.Machine;
import sml.RegisterName;
public class SubtractInstruction extends Instruction {
    private final RegisterName result;
    private final RegisterName source;

    public static final String OP_CODE = "subtract";

    public SubtractInstruction(String label, RegisterName result, RegisterName source) {
        super(label, OP_CODE);
        this.result = result;
        this.source = source;
    }
}

