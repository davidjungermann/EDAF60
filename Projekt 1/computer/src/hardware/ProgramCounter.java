package hardware;

public class ProgramCounter {

  private int index;

  public ProgramCounter() {
    this.index = 0;
  }

  public int get() {
    return index;
  }

  public void set(int newIndex) {
    index = newIndex;
  }

  public void increment() {
    index++;
  }
}
