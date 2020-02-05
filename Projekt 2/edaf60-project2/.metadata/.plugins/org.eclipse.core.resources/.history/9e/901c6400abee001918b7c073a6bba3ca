package model;

import model.expr.ExprParser;
import util.XLException;

public class SlotFactory {

  public static Slot slot(String value) {
    if (value.length() == 0) {
      return null;
    } else if (value.startsWith("#")) {
      return new CommentSlot(value);
    }

    try {
      return new ExprSlot(new ExprParser().build(value));
    } catch (Exception e) {
      throw XLException.buildError();
    }
  }
}
