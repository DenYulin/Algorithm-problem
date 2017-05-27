public class Solution {
    public static boolean Find(int target,int [][] array) {
        if(array != null){
            int row=0;
            int col=array[0].length-1;
            while(row<=array.length-1&&col>=0){
                if(target==array[row][col])
                    return true;
                else if(target>array[row][col])
                    row++;
                else
                    col--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] array = {{1,2,8,9,15,22,38},
                {2,5,9,12,16,25,42},
                {4,7,13,15,21,28,46},
                {7,9,16,18,24,32,52}
        };
        System.out.println(Find(99,array));
    }
}