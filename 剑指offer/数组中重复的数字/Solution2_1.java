public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || length <= 0){
            return false;
        }
        int start = 1;
        int end = length - 1;
        while (end >= start){
            int middle = ((end - start) >> 1) + start;
            int count = countRange(numbers, length, start, middle);
            if (end == start){
                if (count > 1){
                    duplication[0] = start;
                    return true;
                } else {
                    break;
                }
            }
            if (count > (middle -start + 1)){
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return false;
    }
    
    private int countRange(int numbers[], int length, int start, int end){
        if (numbers == null)
            return 0;
        int count = 0;
        for (int i = 0; i < length; i++){
            if (numbers[i] >= start && numbers[i] <= end){
                ++count;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] numbers = {2,3,5,4,3,2,6,7};
        Solution s = new Solution();
        int[] duplication = new int[1];
        boolean flag = s.duplicate(numbers, numbers.length, duplication);
        System.out.println(flag + "["+ duplication[0] + "]");
    }
}