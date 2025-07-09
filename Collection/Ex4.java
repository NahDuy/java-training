import java.util.HashMap;
import java.util.Scanner;

public class Ex4 {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Điều kiện cơ bản: nếu tổng bằng k*0 = 0, thì có thể bắt đầu từ chỉ số -1.
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; 

            if (k != 0) {
                sum %= k;
            }

           
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }

        return false;
    }

   
}
