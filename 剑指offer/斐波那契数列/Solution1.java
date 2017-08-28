public class Solution {
    /*
    public int Fibonacci(int n) {
		if (n <= 0){
            return 0;
        } else if (n <= 2){
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }*/

    public int Fibonacci(int n) {
        int fn1 = 1;
        int fn2 = 1;
        if(n <= 0 ) {
            return 0;
        }
        if(n==1 || n==2) {
            return 1;
        }
        while(n>2) {
            fn2 += fn1;
            fn1 = fn2-fn1;
            n--;
        }
        return fn2;
    }
}