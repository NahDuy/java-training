import java.util.*;

public class Ex3 {
    public List<String> topKFrequent(String[] words, int k) {
        // B1: Đếm tần suất
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // B2: Chuyển thành list để sort
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());

        // B3: Sort theo yêu cầu
        list.sort((a, b) -> {
            int cmp = b.getValue().compareTo(a.getValue()); 
            if (cmp == 0) {
                return a.getKey().compareTo(b.getKey()); 
            }
            return cmp;
        });

        // B4: Lấy k phần tử đầu
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        Ex3 sol = new Ex3();

        String[] words1 = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(sol.topKFrequent(words1, 2)); // [i, love]

        String[] words2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(sol.topKFrequent(words2, 4)); // [the, is, sunny, day]
    }
}
