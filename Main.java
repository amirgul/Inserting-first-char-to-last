import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        String word = "banana";
        String sub1 = word.substring(1,word.length());
        System.out.println(sub1);
        char first = word.charAt(0);
        String sentence = Character.toString(first);
        String fullSentence = sub1 + sentence;
        System.out.println(fullSentence);

    }
}
