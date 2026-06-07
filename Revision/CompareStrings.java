package Revision;

public class CompareStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";

        // Using == operator
        if (a == b) {
            System.out.println("Using '==': a and b are the same reference.");
        } else {
            System.out.println("Using '==': a and b are different references.");
        }
        // Using equals() method
        if (a.equals(b)) {
            System.out.println("Using 'equals()': a and b have the same content.");
        } else {
            System.out.println("Using 'equals()': a and b have different content.");
        } 
    }
}
