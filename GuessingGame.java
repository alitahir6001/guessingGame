import javax.swing.*;  // import to use the JOptionPane (window pop up)

public class GuessingGame {

    public static void main(String[] args) {
        int rando = (int) (Math.random()*100 + 1);
        int player1 = 0;
        // System.out.println("The correct guess would be " + rando);
        int count = 1;
    


        while (player1 != rando)
        {
            String response = JOptionPane.showInputDialog(null, "guess number between 1 and 100", "WELCOME TO POOPFARTS", 3);
                
                player1 = Integer.parseInt(response); // added Integer to return the response as an int
                // System.out.println(player1.response)
                // System.out.println(parseInt.response)

            // System.out.println(JOptionPane.showMessageDialog("null, "Wuzzup"+ method(player input param, the random number generator, and number of times tried)))

            JOptionPane.showMessageDialog(null, ""+ determineGuess(player1, rando, count));

            // added a "number of attempts" counter.
            count++;
        }  
    }

    // new line in string = \n

    public static String determineGuess(int player1, int rando, int count){
        if (player1 <=0 || player1 >100) {
            return "invalid guess, choose between 1-100";
        }
        else if (player1 == rando ){
            return "Correct!\nTook you " + count + " tries";
        }
        else if (player1 > rando) {
            return "too high! \nTry Number: " + count;
        }
        else if (player1 < rando) {
            return "too low!\nTry Number: " + count;
        }
        else {
            return "your guess is incorrect\nTry Number: " + count;
        }
    }
}


