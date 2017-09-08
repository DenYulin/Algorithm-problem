public class Solution {
    public int NumberOf1(int number)
    {
        int count = 0;
        int flag = 1;
        while(flag != 0) {
            if ((number & flag) != 0) {
                ++count;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().NumberOf1(Integer.MIN_VALUE));
    }

}