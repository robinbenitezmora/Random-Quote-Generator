package dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AddQuoteListener implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    new JTextField();
    new JTextField();
    new JTextField();
  }

  public class Quote {
    public String quote;
    public String authorFirstName;
    public String authorLastName;

    public Quote(String quote, String authorFirstName, String authorLastName) {
      this.quote = quote;
      this.authorFirstName = authorFirstName;
      this.authorLastName = authorLastName;
    }
  }

  public void setQuotes(ArrayList<dashboard.Quote> quotes) {
  }

  public void setFrame(JFrame frame) {
  }

  public void setQuotes(ArrayList<dashboard.Quote> quotes) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setQuotes'");
  }
}
