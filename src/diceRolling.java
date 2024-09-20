import java.util.Random;

public class diceRolling {
    public static void main(String[] args) {

        rollSixDice();

    }

    private static void rollSixDice() {
        Random rand = new Random();
        System.out.println("6 dices are rolled: ");
        for(int i = 0; i <6; i++){
            int roll = rand.nextInt(6) + 1;
            System.out.println("Roll #" + (i + 1) + ": " + roll + " ");
        }
        System.out.println();
    }
}
