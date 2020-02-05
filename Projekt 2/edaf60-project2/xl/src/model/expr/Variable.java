package model.expr;

class Variable extends Expr {
  private String name;

  Variable(String name) {
    this.name = name;
  }

  @Override
  public String toString(int prec) {
    return name.toString();
  }

  @Override
  public double value(Environment env) {
    return env.value(name);
  }
}
