package model;

import model.expr.Environment;

public interface Slot {

  double slotValue(Environment environment);

  @Override
  String toString();
}
