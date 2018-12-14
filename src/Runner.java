import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Runner
{
    public static void main(String [] args)
    {
        HiddenWord trial1 = new HiddenWord("APPLE");
        String hint = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the word");
        String guess = input.nextLine();
        hint = trial1.getHint(guess);
        while(!hint.equals("APPLE"))
        {
            System.out.println("Your hint: " + hint);
            System.out.println("What's your guess?");
            guess = input.nextLine();
            hint = trial1.getHint(guess);
        }
        System.out.println("You Won");
    }
}
