package implementation;

import hardware.Address;
import hardware.Instruction;
import hardware.Memory;
import hardware.ProgramCounter;

public class Copy implements Instruction {

  private Operand input;
  private Address address;

  public Copy(Operand input, Address address) {
    this.input = input;
    this.address = address;
  }

  @Override
  public void execute(Memory memory, ProgramCounter programCounter) {
    address.getWord(memory).set(input.getWord(memory));
    programCounter.increment();
  }

  public String toString() {
    return "Copy " + input + " to " + address.toString();
  }
}
