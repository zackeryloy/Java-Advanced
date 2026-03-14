

public class Fibonacci {
    public static void main(String[] args) {
        
        System.out.println(calcFib(7));
      
    }




    public static int calcFib(int n) {
        if (n<=1) {
            return n;
        }
        else {
            return calcFib(n-2)+calcFib(n-1);
        }
    }
}