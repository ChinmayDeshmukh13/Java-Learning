package Revision;

public class CountWords {
    public static void main(String[] args) {
        String sentence = "Hello world! Welcome to Java programming.";
        String[] words = sentence.split(" "); 
        System.out.println("Number of words: " + words.length);
    }
}
