package dashboard;

import java.util.ArrayList;

import javax.swing.JFrame;
cd
public class Main {
  public static void main(String[] args) {
    ArrayList<Quote> quotes = new ArrayList<Quote>();
    quotes.add(new Quote("After a storm comes the peace"));
    quotes.add(new Quote("The best is yet to come"));
    quotes.add(new Quote("The best way out is always through"));
    quotes.add(new Quote("The best way to predict the future is to create it"));
    quotes.add(new Quote("The best way to get started is to quit talking and begin doing"));
    quotes.add(new Quote("The best revenge is massive success"));
    quotes.add(new Quote("The best preparation for tomorrow is doing your best today"));

    Dashboard dashboard = new Dashboard(quotes);
    dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Add this line
    dashboard.setVisible(true);

    Thread thread = new Thread((Runnable) dashboard);
    thread.start();

    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Dashboard closed");

    System.exit(0);
  }
}
