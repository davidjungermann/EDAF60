package gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import gui.CurrentSlot;
import model.Sheet;

class ClearMenuItem extends JMenuItem implements ActionListener {
  private CurrentSlot currentSlot;
  private Sheet sheet;

  public ClearMenuItem(Sheet sheet, CurrentSlot currentSlot) {
    super("Clear");
    addActionListener(this);
    this.sheet = sheet;
    this.currentSlot = currentSlot;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    sheet.clearSlot(currentSlot.getAddress());
  }
}
