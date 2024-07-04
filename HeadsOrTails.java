import java.util.Random;
import java.util.Scanner;

public class HeadsOrTailsGame{
    private enum Coin{Heads,Tails}
    public static void main(String[] args){
        Random random=new Random();

        System.out.println("Tossing a coin...");
        int heads=0;
        int tails=0;

        for(int i=1; i<=3; i++){
            Coin result=random.nextBoolean()? Coin.Heads :Coin.Tails;
            System.out.println("Round" + i +":"+result);
            if(result==Coin.Heads){
                heads++;
            }
            else{
                tails++;
            }
        }
        System.out.println("Heads :," + heads +"Tais :"+tails);

        if(heads>tails){
            System.out.println("You win!")
        }
        else{
            System.out.println("You lost!")
        }
    }
}