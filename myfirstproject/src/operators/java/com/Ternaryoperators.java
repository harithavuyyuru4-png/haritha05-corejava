package operators.java.com;
public class Ternaryoperators {
    public static void main(String[] args) {
        int marks = 83;

        String pf = (marks >= 90) ? "A" :
                    (marks >= 75) ? "B" :
                    (marks >= 60) ? "C" :
                    (marks >= 40) ? "D" : "Fail";

        System.out.println("The Result: " + pf);
    }
}