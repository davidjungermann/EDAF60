package implementation;

import hardware.Instruction;
import hardware.Memory;
import hardware.ProgramCounter;

public class Print implements Instruction {

  private Operand input;

  public Print(Operand input) {
    this.input = input;
  }

  @Override
  public void execute(Memory memory, ProgramCounter programCounter) {
    System.out.println(input.getWord(memory));
    programCounter.increment();
  }

  public String toString() {
    return "Print " + input.toString();
  }
}
