package dashboard;

import java.util.ArrayList;
import dashboard.Quote;

public class Main {
  public static void main(String[] args) {
   ArrayList<Quote> quotes = new ArrayList<>();
   Person author1 = new Person("Julian", "Salinas");
   Person author2 = new Person("", "Anonymous");
   Person author3 = new Person("Mihaly", "Csikescentmihalyi");
   Person author4 = new Person("Albert", "Einstein");
   Person author5 = new Person("Princess", "Diana");

   Main mainInstance = new Main(); // Create an instance of the Main class

   Quote quote1 = mainInstance.new Quote("My style is unique and random. But I think it is important that it still makes sense. ", author1);
   Quote quote2 = mainInstance.new Quote("Your limitation - it is only your imagination. ", author2);
   Quote quote3 = mainInstance.new Quote("The best moments in our lives are not the passive, receptive, relaxing times... The best moments usually occur if a person's body or mind is stretched to its limits in a voluntary effort to accomplish something difficult and worthwhile. ", author3);
   Quote quote4 = mainInstance.new Quote("The true sign of intelligence is not knowledge but imagination. ", author4);
   Quote quote5 = mainInstance.new Quote("Carry out a random act of kindness, with no expectation of reward, safe in the knowledge that one day someone might do the same for you. ", author5);
 }

 quotes.add(quote1);
 quotes.add(quote2);
 quotes.add(quote3);
 quotes.add(quote4);
 quotes.add(quote5);

 Window w = new Window(quotes);
 w.createAndDisplayWindow(quotes);
}
