package implementation;

import hardware.Instruction;
import hardware.Memory;
import hardware.ProgramCounter;

public class Halt implements Instruction {

  public Halt() {}

  @Override
  public void execute(Memory memory, ProgramCounter programCounter) {
    programCounter.set(-1);
  }

  public String toString() {
    return "Halt";
  }
}
