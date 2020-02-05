package implementation;

import hardware.Memory;
import hardware.Word;

public interface Operand {

  Word getWord(Memory memory);

  String toString();
}
