package dashboard;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Window extends JFrame {
 private static final long serialVersionUID = 1L;

 public Window(ArrayList<Quote> quotes) {
  super("Quotes");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public void createAndDisplayWindow(ArrayList<Quote> quotes) {
  JFrame frame = setUpFrame();
  JMenuBar menuBar = new JMenuBar(); // Fix: Change JButton to JMenuBar

  JButton nextQuote = new JButton("Next Quote");
  JButton displayQuote = new JButton("Display All Quotes");
  JButton addQuote = new JButton("Add Quote");
  setUpMenu(menuBar, nextQuote, displayQuote, addQuote);

  addQuotebuttonActions(quotes, frame, addQuote);
  displayQuoteButtonActions(quotes, frame, displayQuote);
  nextQuoteButtonActions(quotes, frame, nextQuote);

  displayFrame(frame, menuBar);
 }

 private void displayFrame(JFrame frame, JMenuBar menuBar) {
  frame.setJMenuBar(menuBar);
  frame.pack();
  frame.setVisible(true);
 }

 private void nextQuoteButtonActions(ArrayList<Quote> quotes, JFrame frame, JButton nextQuote) {
  NextQuoteListener nextQuoteListener = new NextQuoteListener();
  nextQuoteListener.setQuotes(quotes);
  nextQuoteListener.setFrame(frame);
  nextQuote.addActionListener(nextQuoteListener);
  frame.add(nextQuote);
 }

 private void displayQuoteButtonActions(ArrayList<Quote> quotes, JFrame frame, JButton displayQuote) {
  DisplayQuotesListener displayQuotesListener = new DisplayQuotesListener();
  displayQuotesListener.setQuotes(quotes);
  displayQuotesListener.setFrame(frame);
  displayQuote.addActionListener(displayQuotesListener);
  frame.add(displayQuote);
 }

 private void addQuotebuttonActions(ArrayList<Quote> quotes, JFrame frame, JButton addQuote) {
  AddQuoteListener addQuoteListener = new AddQuoteListener();
  addQuoteListener.setQuotes(quotes);
  addQuoteListener.setFrame(frame);
  addQuote.addActionListener(addQuoteListener);
  frame.add(addQuote);
 }

 private void setUpMenu(JMenuBar menuBar, JButton nextQuote, JButton displayQuote, JButton addQuote) {
  menuBar.add(nextQuote);
  menuBar.add(displayQuote);
  menuBar.add(addQuote);
 }

 private JFrame setUpFrame() {
  JFrame frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  return frame;
 }
}
