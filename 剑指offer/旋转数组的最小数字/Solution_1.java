public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int temp = array[0];
        for (int i = 1; i < array.length ; i++){
            if (array[i] < temp){
                temp = array[i];
                break;
            }
        }
        return temp;
    }
}