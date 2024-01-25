/*
 * Logan Santamarina
 * 1/22/23
 * DBA written portion that checks the number of words and if certain words are in a list
 */

public class WordTester {
    private String[] myWords;
    private int myNumWords;
    private String myTargetWord;

    public WordTester(String[] words, int numWords, String targetWord) {
        myWords = words;
        myNumWords = numWords;
        myTargetWord = targetWord;
    }
/*
 * The iswithin method checks to see if a word, myTargetWord, exists in the myWords array. If
myTargetWord is found in the myWords array, the method returns true. The method returns
false if myTargetWord is not found in the array. Write the isWithin method.
 */

//checks if a word is in the sentence
    public boolean isWithin() {
        // to be implemented in Part A
        for (String word : myWords) {
            if(word.equals(myTargetWord)){
                return true;
            }
        }
        return false;
    }
/*The sameNumber method checks to see if the number used as the check digit in the
constructor, is the same number of words contained in the myWords array. The method returns
true if the array and phrase have the same number of words and false if they do not. Write the
sameNumber method. */

//checks if the number of words is the same as the number of elements in the list.
    public boolean sameNumber() {
        // to be implemented in Part B
        return myNumWords == myWords.length;
    }
}