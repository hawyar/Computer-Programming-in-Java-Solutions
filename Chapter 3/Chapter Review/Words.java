/**
 * Write the implementation of each method in the following incomplete
 * class, Words, as described in the comments
 *
 * @author hawyarfarooq
 */

public class Words {

    private String sentence = " ";

    // Constructtor to initialize a sentece for a word object with a string in str
    public Words(String str) {
        this.sentence = str;
    }

    // Returns twice the number of characters in the sentence
    public int luckyNumber() {
        int count = 0;
        String stringWithoutSpaces = this.sentence.replaceAll("\\s+","");

        for (int i = 0; i < stringWithoutSpaces.length(); i++) {
            count++;
        }
        return count * 2;
    }

    // Returns the index of the String in str in the sentece or -1
    public int location(String str) {
        int firsIndex = this.sentence.indexOf(str);

        if (firsIndex != 0) {
            return firsIndex;
        }
        return -1;
    }

    /* Returns a code by taking the first letter from the sentence and the last letter
     * from the string in w assuming the sentence and w are not null
     */
    public String Compose(String w) {

        String compose = " ";

        if (!w.isEmpty() && !this.sentence.isEmpty())  {

            char firstLetter = this.sentence.charAt(0);
            char lastLetter = w.charAt(w.length() - 1);

            String string1 = String.valueOf(firstLetter);
            String string2 = String.valueOf(lastLetter);

            compose = string1.concat(string2);

        } else {
            return "One of the strings are empty, can't process !";
        }

        return compose;
    }

    // The main method to test and dispplay the results
    public static void main(String[] args) {

        /*
        * The following block of code is to test the three methods above.
        * Remove the comments and change the string passed into the Word instance.
        */

//        Words w = new Words("Java is an object-oriented language");
//        System.out.println(w.Compose("It is a powerful language"));
//        System.out.println(w.location("is"));

    }
}
