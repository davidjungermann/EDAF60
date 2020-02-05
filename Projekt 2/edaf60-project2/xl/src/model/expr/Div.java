package model.expr;

import util.XLException;

class Div extends BinaryExpr {
  Div(Expr expr1, Expr expr2) {
    super(expr1, expr2);
    precedence1 = 1;
    precedence2 = 2;
  }

  @Override
  public double op(double op1, double op2) {
    if (op2 != 0) return op1 / op2;
    else throw XLException.divByZeroError();
  }

  @Override
  protected String opString() {
    return "/";
  }
}
