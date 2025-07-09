import java.util.*;
import java.util.stream.*;

public class Ex1 {
    public static void main(String[] args) {
        Random rand = new Random();

        // A: dãy số ngẫu nhiên từ 0 đến 2000
        List<Integer> A = IntStream.range(0, 100000)
                .map(i -> rand.nextInt(2001)) // [0, 2000]
                .boxed()
                .collect(Collectors.toList());

        //a.
        Set<Integer> B = new HashSet<>(A);
        //b.
        Map<Integer,Integer> cp = new HashMap<>();
        for(int num : A){
            cp.put(num, cp.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        int mostFrequent = -1;
        for (Map.Entry<Integer,Integer> entry : cp.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        } 
        System.out.println("So xuat hien nhieu nhat " + mostFrequent + " xuat hien " + maxCount);

        // C: dãy số ngẫu nhiên từ 1000 đến 3000
        List<Integer> C = IntStream.range(0, 10000)
                .map(i -> rand.nextInt(1000,3001)) // [0, 2000]
                .boxed()
                .collect(Collectors.toList());
        int cnt = 0;
        for(int num : C){
            if(B.contains(num)){
                cnt++;
            }
        }
        System.out.println("Co " + cnt + " xuat hien trong C");
    }
}
