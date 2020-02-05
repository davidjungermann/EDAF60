package implementation;

import hardware.WordFactory;

public class LongWordFactory implements WordFactory {

  @Override
  public LongWord word(String string) {
    return new LongWord(Long.parseLong(string));
  }
}
