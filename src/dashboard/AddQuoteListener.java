package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddQuoteListener implements ActionListener {
 private ArrayList<Quote> quotes;
 private JFrame frame;

 @Override
  public void actionPerformed(ActionEvent e) {
  JTextField quote = new JTextField();
  JTextField authorFirstName = new JTextField();
  JTextField authorLastName = new JTextField();

  Object[] message = {
   "Quote:", quote,
   "Author's First Name:", authorFirstName,
   "Author's Last Name:", authorLastName
  }

 private void addQuote(JTextField quote, JTextField authorFirstName, JTextField authorLastName, Object[] message) {
  int option = JOptionPane.showConfirmDialog(frame, message, "Add Quote", JOptionPane.OK_CANCEL_OPTION);
  if (option == JOptionPane.OK_OPTION) {
   quotes.add(new Quote(quote.getText(), authorFirstName.getText(), authorLastName.getText()));
  }
 }

 // Define a constructor for the Quote class that accepts three string parameters
 public class Quote {
  private String quote;
  private String authorFirstName;
  private String authorLastName;

  public Quote(String quote, String authorFirstName, String authorLastName) {
   this.quote = quote;
   this.authorFirstName = authorFirstName;
   this.authorLastName = authorLastName;
  }
 }

 public void setQuotes(ArrayList<Quote> quotes) {
  this.quotes = quotes;
 }

 public void setFrame(JFrame frame) {
  this.frame = frame;
 }
}
