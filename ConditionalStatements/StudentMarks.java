public class StudentMarks {
    public static void main(String args[]) {
        int marks = 40;
        //ternery operator
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("Student is "+ result);
    }   
}