/*File: Practice.java
 * Author: VaryAble
 * Date: 9-3-19
 * About: GUI to learn how to type
 * */

import javax.swing.*;
import java.util.Random;

public class Practice extends JTextField {

    public static void main(String[] args) {

        //region Building Blocks
        boolean loop = true;
        String words = "";
        Random rand = new Random();
        String[] sentences = new String[8];
        //endregion

        //region Sentences
        sentences[0] = "The Quick Brown Fox Jumps Over The Lazy Dog";
        sentences[1] = "Sphinx of black quartz, judge my vow";
        sentences[2] = "Pack my box with five dozen liquor jugs";
        sentences[3] = "The quick onyx goblin jumps over the lazy dwarf";
        sentences[4] = "How razorback-jumping frogs can level six piqued gymnasts!";
        sentences[5] = "Cozy lummox gives smart squid who asks for job pen";
        sentences[6] = "Watch \"Jeopardy!\", Alex Trebek’s fun TV quiz game";
        sentences[7] = "The five boxing wizards jump quickly.";
        //endregion

        do {

            int pick = rand.nextInt(7);

            String sentence = sentences[pick];

            String str = JOptionPane.showInputDialog(null, sentence, "Type:",
                    JOptionPane.INFORMATION_MESSAGE);
            if (str == null){ // Cancel button pressed
                words = "Practice often";
                loop = false;
            }
            else if (str.isEmpty()) {
                int quit = JOptionPane.showConfirmDialog(null,
                        "Would you like to exit?", "Quit?", JOptionPane.YES_NO_OPTION);
                if (quit == JOptionPane.YES_OPTION) {
                    words = "Practice Often";
                    loop = false; // End loop
                }
                else if (quit == JOptionPane.NO_OPTION) {
                    words = "Practice makes perfect.";
                }
            }
            else if (sentence.equals(str)) {
                words = "Good Job!";
            }
            else {
                words = "Try Again";
            }

            // Message
            JOptionPane.showMessageDialog(null, words);

        } while (loop);

        System.exit(0); // Quit
    }
}// Thanks for looking
