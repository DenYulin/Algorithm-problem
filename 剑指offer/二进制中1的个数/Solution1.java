public class Solution {
    public int NumberOf1(int number)
    {
        int count = 0;
        while(number != 0) {
            if ((number & 1) == 1) {
                ++count;
            }
            number = number >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().NumberOf1(-5));
    }

}