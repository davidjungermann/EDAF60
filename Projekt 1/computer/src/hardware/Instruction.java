package hardware;

public interface Instruction {

  void execute(Memory memory, ProgramCounter programCounter);

  String toString();
}
