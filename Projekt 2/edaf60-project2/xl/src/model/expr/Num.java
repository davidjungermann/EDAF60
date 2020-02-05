package model.expr;

import util.NumberAdjustment;

class Num extends Expr {
  private static NumberAdjustment adjustment = new NumberAdjustment(0, 2);
  private double value;

  Num(double value) {
    this.value = value;
  }

  @Override
  public String toString(int prec) {
    return adjustment.right(value);
  }

  @Override
  public double value(Environment env) {
    return value;
  }
}
