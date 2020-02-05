package gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import model.Sheet;

/* Performs actions directly on model, is that fine?
 * Could have an XL as input instead. */
class ClearAllMenuItem extends JMenuItem implements ActionListener {
  private Sheet sheet;

  public ClearAllMenuItem(Sheet sheet) {
    super("Clear all");
    addActionListener(this);
    this.sheet = sheet;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    sheet.clearAll();
  }
}
