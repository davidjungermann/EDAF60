package model;

import model.expr.Environment;
import model.expr.Expr;

public class ExprSlot implements Slot {
  private boolean empty;
  private Expr expr;

  public ExprSlot(Expr expr) {
    this.expr = expr;
  }

  @Override
  public double slotValue(Environment environment) {
    return expr.value(environment);
  }

  @Override
  public String toString() {
    return expr.toString();
  }
}
