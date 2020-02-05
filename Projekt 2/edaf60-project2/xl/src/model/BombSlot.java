package model;

import model.expr.Environment;
import util.XLException;

public class BombSlot implements Slot {

  @Override
  public double slotValue(Environment environment) {
    throw XLException.recursiveError();
  }
}
