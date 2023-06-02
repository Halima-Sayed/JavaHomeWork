package Class25HW;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    /*
     Create 3 objects of different card and store them into LinkedList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    private String cardType;
    private double interestRate;

    public Card(String cardType, double interestRate) {
        this.cardType = cardType;
        this.interestRate = interestRate;
    }
    public String getCardType(){
        return cardType;
    }
    public double getInterestRate(){
        return interestRate;
    }
}
class cardTester{
    public static void main(String[] args) {
        Card c1=new Card("Debit Card",1.1);
        Card c2=new Card("Credit Card",2.1);
        Card c3=new Card("Visa Card",3.1);

        LinkedList<Card> a = new LinkedList<>(Arrays.asList(c1, c2, c3));

        for(Card b:a){
            System.out.println("Card type: "+b.getCardType());
            System.out.println("Interest rate on card: "+b.getInterestRate());
        }
        System.out.println("--------------------------");

        for(int i=0; i<a.size(); i++){
            System.out.println("Card type: "+a.get(i).getCardType());
            System.out.println("Interest rate on card: "+a.get(i).getInterestRate());
        }
        System.out.println("--------------------------");

        Iterator<Card> iterator=a.iterator();
        while (iterator.hasNext()){
            Card b=iterator.next();
            System.out.println("Card type: "+b.getCardType());
            System.out.println("Interest rate on card: "+b.getInterestRate());
        }

    }
}