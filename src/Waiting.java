import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Waiting {
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("P1: Hello");
        pause();
        System.out.println("P2: hi");
        pause();
        System.out.println("P1: How are you?");
        pause();
        System.out.println("P2: good");
        pause(-500);
        System.out.println("P2: u?");
        pause();
        System.out.println("P1: Good!");
    }
    public static void pause() throws InterruptedException
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(3000)+1000;
        TimeUnit.MILLISECONDS.sleep(randomNum);
        
    }
    public static void pause(int extraTime) throws InterruptedException
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(3000)+500+extraTime;
        TimeUnit.MILLISECONDS.sleep(randomNum);
        
    }
}
