public class Solution{
    public boolean Find(int target, int [][] array) {
        boolean find = false;
        if(array.length == 0 || array[0].length == 0)
            return false;
        int rows = array.length;
        int columns = array[0].length;
        int i = 0;
        int j = columns - 1;
        while(i < rows && j >=0) {
            if(array[i][j] == target) {
                find = true;
                break;
            }
            else if(array[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return find;
    }
}
