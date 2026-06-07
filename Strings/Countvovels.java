package Strings;
import java.util.Scanner;
public class Countvovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s= s.toLowerCase();
        int countVovel = 0;
        int countConsonants = 0;
        for(int i =0; i<s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                countVovel++;
            }
            else {
                countConsonants++;
            }
        }
        System.out.println("Count of Vovels in String : " + countVovel);
        System.out.println("Count of Consonants in String : " + countConsonants);
        sc.close();
    }
}
