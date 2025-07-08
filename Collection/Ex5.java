public class Ex5 {
    class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] check = new boolean[nums.length];
        for (int n : nums) {
            if (check[n]) {
                return n;
            }
            check[n] = true;
        }
        return -1;
    }
}
}
