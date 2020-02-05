package gui;

import java.awt.Color;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class CurrentSlot extends Observable {

  private SlotLabel slotLabel;

  public CurrentSlot() {}

  public void colorHandler() {
    if (slotLabel.getBackground() == Color.WHITE) {
      slotLabel.setBackground(Color.YELLOW);
    } else {
      slotLabel.setBackground(Color.WHITE);
    }
  }

  public String getAddress() {
    return slotLabel.getAddress();
  }

  public void setCurrent(SlotLabel newSlotLabel) {
    this.slotLabel = newSlotLabel;
    setChanged();
    notifyObservers();
  }
}
