import java.util.ArrayList;

public class ReadingList {

    public static void main(String[] args){

        int bookNum = 1;

        ArrayList<String> bookListRead = new ArrayList<String>();
        ArrayList<String> bookListUnread = new ArrayList<String>();
        ArrayList<String> bookListReading = new ArrayList<String>();

        //Add current books here:
        bookListReading.add("THE PARASITIC MIND by Gad Saad");
        bookListReading.add("THE POWER OF HABIT by Charles Duhigg");
        bookListReading.add("HOW TO TRAIN YOUR MIND by Chris Bailey");

        //Add future books here:
        bookListUnread.add("THE WAR OF ART by Steven Pressfield");
        bookListUnread.add("JAVA: A BEGINNERS GUIDE EIGHTH EDITION by Herbert Schildt ");
        bookListUnread.add("JAVA: LEARN JAVA IN ONE DAY AND LEARN IT WELL by Jamie Chan");

        //Add read books here:
        bookListRead.add("MEDITATIONS by Marcus Aurelius");
        bookListRead.add("HOW TO BE MORE INTENTIONAL WITH TIME by Laura Vanderkam");
        bookListRead.add("GET ORGANIZED: DO MORE IN LESS TIME by Ciara Conlon");
        bookListRead.add("THE ART OF WAR by Sun Tzu");

        System.out.println("List of books I am currently reading:");
        for(int i = 0; i < bookListReading.size(); i++){
            System.out.print("Book number "+ bookNum+": ");
            System.out.println(bookListReading.get(i));
            bookNum++;
        }
        //Reset book counter & line break for ease of reading
        bookNum = 1;
        System.out.println("");

        System.out.println("List of books that are unread:");
        for(int i = 0; i < bookListUnread.size(); i++){
            System.out.print("Book number "+ bookNum+": ");
            System.out.println(bookListUnread.get(i));
            bookNum++;
        }
        //Reset book counter & line break for ease of reading
        bookNum = 1;
        System.out.println("");

        System.out.println("List of books that I have read.");
        for(int i = 0; i < bookListRead.size(); i++){
            System.out.print("Book number "+ bookNum+": ");
            System.out.println(bookListRead.get(i));
            bookNum++;
        }

    }
}
