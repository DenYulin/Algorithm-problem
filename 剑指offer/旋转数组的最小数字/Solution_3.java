public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int middle = 0;
        while(array[left] >= array[right]){
            if (right - left == 1){
                middle = right;
                break;
            }
            middle = (right + left) / 2;

            if (array[left] == array[right] && array[middle] == array[left]) {
                return minInOrder(array, left, right);
            }

            if (array[middle] >= array[left]){
                left = middle;
            } else if (array[middle] <= array[right]){
                right = middle;
            }
        }
        return array[middle];
    }

    public int minInOrder(int[] array, int left, int right) {
        int temp = array[left];
        for (int i = left + 1; i <= right; ++i) {
            if (temp > array[i]) {
                temp = array[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array = {1,0,1,2,3};
        Solution s = new Solution();
        System.out.println(s.minNumberInRotateArray(array));
    }
}