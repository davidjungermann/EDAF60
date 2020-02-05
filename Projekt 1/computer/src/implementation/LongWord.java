package implementation;

import hardware.Word;

public class LongWord implements Word {

  private Long word;

  public LongWord(Long word) {
    this.word = word;
  }

  public void add(Word left, Word right) {
    this.word = ((LongWord) left).word + ((LongWord) right).word;
  }

  public void mul(Word left, Word right) {
    this.word = ((LongWord) left).word * ((LongWord) right).word;
  }

  public void set(Word word) {
    this.word = ((LongWord) word).word;
  }

  public String toString() {
    return word.toString();
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Word)) return false;
    else return word == ((LongWord) other).word;
  }
}
