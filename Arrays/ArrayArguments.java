public class ArrayArguments {

    public static void update(int marks[]) {
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
// This example tells us that if we define arrays in main function and update it in another user defined function
// it also changes for main function which does not happen in int or float, etc.