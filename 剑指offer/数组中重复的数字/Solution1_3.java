public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || length <= 0){
            return false;
        }
        for (int i = 0; i < length; i++){
            if (numbers[i] < 0 || numbers[i] > length - 1){
                return false;
            }
        }
        for (int i = 0; i < length; i++){
            int m = numbers[i];
            while (numbers[i] != i){
                if (numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                } else {
                    int temp = numbers[i];
                    numbers[i] = numbers[temp];
                    numbers[temp] = temp;
                }
            }
        }
        return false;
    }
}