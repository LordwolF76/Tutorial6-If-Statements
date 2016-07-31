/**
 * Created by LordwolF on 7/31/2016.
 */
public class Application {
    public static void main(String[] args) {

        int myInt = 20;

        if(myInt < 10) {
            System.out.println("Yes it's True");

        }
        else if(myInt > 30){
            System.out.println("No that's False");
        }
        else {
            System.out.println("Neither True nor False");
        }

        int loop = 0;

        while (true) {
            System.out.println("Looping: " + loop);

            if (loop == 10) {
                break;
            }
            loop++;

            System.out.println("Running");
        }
    }
}
