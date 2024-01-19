package dashboard;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;

public class DisplayQuotesListener implements ActionListener {
 private JPanel panel;
 private JFrame frame;
 private ArrayList<Quote> quotes;

 @Override
 public void actionPerformed(java.awt.event.ActionEvent e) {
  JTextArea text = new JTextArea();
  for (Quote q : quotes) {
   text.append(q + System.getProperty("line.separator"));
  }
  displayAllQuotes(text);
 }

 private void displayAllQuotes(JTextArea text) {
  panel = new JPanel();
  panel.add(text, BorderLayout.LINE_START);
  frame.setContentPane(panel);
  frame.pack();
 }

 public void setQuotes(ArrayList<Quote> quotes) {
  this.quotes = quotes;
 }

 public void setFrame(JFrame frame) {
  this.frame = frame;
 }
}
