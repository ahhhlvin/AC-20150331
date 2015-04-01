package nyc.c4q.ahhhlvin;

import java.util.HashMap;
import java.util.Scanner;

public class WordTracker {

    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some words: ");
        boolean addMode = true;

        while (true) {
            String enteredWord = input.nextLine();


            if (enteredWord.equalsIgnoreCase("rm")) {
                addMode = false; // does whatever happens when '!addMode' as specified above
                continue;
            } else if (enteredWord.equalsIgnoreCase("add")) {
                addMode = true;  // does whatever happens when 'addMode' as specified above
                continue;
            } else if (enteredWord.equalsIgnoreCase("stop")) {
                    System.out.println("Thanks! You have input " + words.size() + " word(s).");
                    System.out.println(words);


                    if (words.isEmpty()) {
                        System.out.println("The HashMap is EMPTY!!");
                    } else {
                        System.out.println("The HashMap currently has " + words.size() + " words!");
                    }


                    for (String word : words.keySet()) {
                        System.out.println(word + " " + words.get(word));
                    }
                    break;
            } else if (enteredWord.equalsIgnoreCase("clr")) {
                words.clear();
                continue;
            }




            if (!addMode) /* addMode = FALSE */ {
                words.remove(enteredWord);
            } else /* addMode = TRUE */ {
                if (words.containsKey(enteredWord)) {
                    words.put(enteredWord, words.get(enteredWord)+1);
                } else {
                    words.put(enteredWord, 1);
                }

            }



        }
    }
}



