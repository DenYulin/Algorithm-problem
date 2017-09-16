public class Solution {

    public void reOrderArray(int [] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int begin = 0;
        int end = array.length - 1;

        while (begin < end) {
            // 向后移动begin，直到它指向偶数
            while (begin < end && !isEven(array[begin])) {
                begin++;
            }
            // 向前移动end，直到它指向奇数
            while (begin < end && isEven(array[end])) {
                end--;
            }
            if (begin < end) {
                int temp = array[begin];
                array[begin] = array[end];
                array[end] = temp;
            }
        }
    }

    // 判断逻辑的条件改变，只需要修改这个函数即可
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

}