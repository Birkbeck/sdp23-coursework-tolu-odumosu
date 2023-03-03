package sml.instruction;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sml.Instruction;
import sml.Machine;
import sml.Registers;

import static sml.Registers.Register.*;

public class OutInstructionTest {
    private Machine machine;
    private Registers registers;

    @BeforeEach
    void setUp() {
        machine = new Machine(new Registers());
        registers = machine.getRegisters();
        //...
    }

    @AfterEach
    void tearDown() {
        machine = null;
        registers = null;
    }

    @Test
    void executeValid() {
        registers.set(EBX, 6);
        Instruction instruction = new OutInstruction(null, EBX);
        instruction.execute(machine);
        Assertions.assertEquals(machine.getRegisters().get(EAX));
    }

    @Test
    void executeValidTwo() {
        registers.set(EBX, 11);
        Instruction instruction = new OutInstruction(null, EBX);
        instruction.execute(machine);
        Assertions.assertEquals(machine.getRegisters().get(EAX));
    }
}
