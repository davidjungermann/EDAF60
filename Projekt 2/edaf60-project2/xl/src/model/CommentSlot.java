package model;

import model.expr.Environment;

public class CommentSlot implements Slot {

  private String comment;

  public CommentSlot(String comment) {
    this.comment = comment;
  }

  @Override
  public double slotValue(Environment environment) {
    return 0;
  }

  @Override
  public String toString() {
    return comment;
  }
}
