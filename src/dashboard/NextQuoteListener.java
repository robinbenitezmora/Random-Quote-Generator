package dashboard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class NextQuoteListener implements ActionListener {

 private JLabel textLabel;
 private JFrame frame;
 private static int quoteIndex = 0;
 private ArrayList<Quote> quotesList;

 @Override
 public void actionPerformed(java.awt.event.ActionEvent e) {
  JPanel nextQuotPanel = new JPanel();
  nextQuotPanel.setBackground(Color.BLACK);
  if (quotesList.size() != 0) {
   displayQuote();
   nextQuotPanel.add(textLabel, BorderLayout.LINE_START);

   reactionButtons(nextQuotPanel);
   displayPanel(nextQuotPanel);
  }
 }

 private void displayQuote() {
  displayRegularQuote();
  quoteIndex++;
  if (quoteIndex > quotesList.size() - 1) {
   quoteIndex = 0;
  }
 }

 private void displayPanel(JPanel nextQuotePanel) {
  frame.getContentPane().add(nextQuotePanel, BorderLayout.CENTER);
  frame.setContentPane(nextQuotePanel);
  frame.pack();
  nextQuotePanel.setVisible(true);
 }

 private void reactionButtons(JPanel nextQuotPanel) {
  JButton like = new JButton("Like");
  JButton dislike = new JButton("Dislike");
  buttonStyles(like, dislike);

  nextQuotPanel.add(like, BorderLayout.LINE_END);
  nextQuotPanel.add(dislike, BorderLayout.LINE_END);

  DislikeListener dislikeClicked = dislikeAction(dislike);
  LikeListener likeClicked = likeActions(like);

  dislike.addActionListener(dislikeClicked);
  like.addActionListener((ActionListener) likeClicked);
 }

 private void displayRegularQuote() {
  textLabel = new JLabel("<html>" + quotesList.get(quoteIndex).toString() + "</html>", SwingConstants.CENTER);
  textLabel.setForeground(Color.WHITE);
  textLabel.setFont(new Font("Magneto Bold", Font.BOLD, 20));
  textLabel.setPreferredSize(new Dimension(1000, 100));
 }

 private LikeListener likeActions(JButton like) {
  LikeListener likeClicked = new LikeListener();
  likeClicked.setquoteIndex(quoteIndex);
  likeClicked.setQuotes(quotesList);
  return likeClicked;
 }

 private void buttonStyles(JButton like, JButton dislike) {
  like.setBackground(Color.CYAN);
  like.setBounds(500, 400, 100, 40);
  dislike.setBackground(Color.CYAN);
  dislike.setBounds(500, 400, 100, 40);
  return;
 }

 private DislikeListener dislikeAction(JButton dislike) {
  DislikeListener dislikeClicked = new DislikeListener();
  dislikeClicked.setQuoteIndex(quoteIndex);
  dislikeClicked.setQuotes(quotesList);
  dislikeClicked.setButton(dislike);
  return dislikeClicked;
 }

 public void setQuotes(ArrayList<Quote> quotes) {
  quotesList = quotes;
 }

 public void setFrame(JFrame frame) {
  this.frame = frame;
 }

 public void setTextLabel(JLabel textLabel) {
  this.textLabel = textLabel;
 }

 public JLabel getTextLabel() {
  return textLabel;
 }

 public static void setQuoteIndex(int q) {
  quoteIndex = q;
 }

}
