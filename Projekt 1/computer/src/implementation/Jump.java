package implementation;

import hardware.Instruction;
import hardware.Memory;
import hardware.ProgramCounter;

public class Jump implements Instruction {

  private int index;

  public Jump(int index) {
    this.index = index;
  }

  @Override
  public void execute(Memory memory, ProgramCounter programCounter) {
    programCounter.set(index);
  }

  public String toString() {
    return "Jump to " + index;
  }
}
