package dashboard;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LikeListener implements ActionListener {

 private static ArrayList<Quote> quotes;
 private int quoteIndex;

 @Override
 public void actionPerformed(java.awt.event.ActionEvent e) {
  if (quotes.size() > 1) {
   quotes.add(quotes.get(quoteIndex - 1));
  } else {
   quotes.add(quotes.get(quoteIndex));
  }
 }

 public void setquoteIndex(int quoteIndex) {
  this.quoteIndex = quoteIndex;
 }

 public void setQuotes(ArrayList<Quote> q) {
  quotes = q;
 }
}
