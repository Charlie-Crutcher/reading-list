import java.util.ArrayList;

public class ReadingList {

    public static void main(String[] args){

        int bookNum = 1;
        ArrayList<String> bookList = new ArrayList<String>();

        //Add current and future books here to read:
        bookList.add("THE POWER OF HABIT by Charles Duhigg");
        bookList.add("THE WAR OF ART by Steven Pressfield");
        bookList.add("MEDITATIONS by Marcus Aurelius");
        bookList.add("THE PARASITIC MIND by Gad Saad");
        bookList.add("JAVA: A BEGINNERS GUIDE EIGHTH EDITION by Herbert Schildt ");
        bookList.add("JAVA: LEARN JAVA IN ONE DAY AND LEARN IT WELL by Jamie Chan");

        //A For loop created to print out all of our books and their respective numbers.
        for(int i = 0; i < bookList.size(); i++){
            System.out.println("Book number: "+ bookNum);
            System.out.println(bookList.get(i));
            bookNum++;
        }

    }
}
