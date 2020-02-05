package implementation;

import hardware.Address;
import hardware.Instruction;
import hardware.Memory;
import hardware.ProgramCounter;
import hardware.Word;

public abstract class BinOp implements Instruction {
  private Operand left;
  private Operand right;
  private Address addressWord;

  public BinOp(Operand left, Operand right, Address addressWord) {
    this.left = left;
    this.right = right;
    this.addressWord = addressWord;
  }

  protected abstract void op(Word left, Word right, Word addressWord);

  protected abstract String opString();

  public void execute(Memory memory, ProgramCounter programCounter) {
    op(left.getWord(memory), right.getWord(memory), addressWord.getWord(memory));
    programCounter.increment();
  }

  public String toString() {
    return opString()
        + left.toString()
        + " and "
        + right.toString()
        + " into "
        + addressWord.toString();
  }
}
