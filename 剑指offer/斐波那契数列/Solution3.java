public class Solution {
    public int JumpFloorII1(int target) {
        if (target <= 0){
            return -1;
        } else {
            return (int)Math.pow(2, target - 1);
        }
        // return 1 << (target - 1);
    }

    public int JumpFloorII2(int target) {
        if (target <= 0){
            return -1;
        } else if (target == 1){
            return 1;
        } else {
            return 2 * JumpFloorII2(target - 1);
        }
    }
}