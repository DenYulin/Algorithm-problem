public class Solution {
    public int NumberOf1(int number)
    {
        int count = 0;
        while(number != 0) {
            ++count;
            number = (number - 1) & number;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().NumberOf1(Integer.MIN_VALUE));
    }

}