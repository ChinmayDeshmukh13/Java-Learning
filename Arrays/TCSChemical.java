// import java.util.Arrays;
import java.util.Scanner;

public class TCSChemical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input as a String with sapces between numbers
        String s = sc.nextLine();
        // split using spaces and store in array
        String chem[] = s.split(" ");
        //System.out.println(Arrays.toString(chem));

        //First element is count of chemicals
        int chemCount = Integer.parseInt(chem[0]);

        // Second element is target variable
        int target = Integer.parseInt(chem[1]);


        // Divide the remaining array in weigth and toxicity which are on alternate positions
        int weigth[] = new int[chemCount];
        int toxicity[] = new int[chemCount];
        int index1 = 0;
        int index2 = 0;

        for(int i = 2; i<chem.length; i++) {
            if(i%2 == 0) {
                weigth[index1] = Integer.parseInt(chem[i]);
                index1++;
            }
            else {
                toxicity[index2] = Integer.parseInt(chem[i]);
                index2++;
            }
        }
        // System.out.println(chemCount);
        // System.out.println(Arrays.toString(weigth));
        //System.out.println(Arrays.toString(toxicity));
        int weight1 = 0;
        int weight2 = 0;
        int maxToxicity = 0;
        for(int i = 0; i<weigth.length; i++) {
            for(int j = i+1; j<weigth.length; j++){
                if(weigth[i] + weigth[j] == target) {
                    weight1 = i;
                    weight2 = j;
                }
                if(toxicity[i] + toxicity[j] > maxToxicity) {
                    maxToxicity = toxicity[i]+toxicity[j];
                }
            }
        }
        System.out.println(weight1+" "+weight2+" "+maxToxicity);
    }
}
