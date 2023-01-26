import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("test", "tes", "TEST", "test", "teS", "TESt"));
        task4(List.of("test", "tes", "TEST", "test", "teS", "TESt"));
    }


    private static void task1(List<Integer> numbers) {
        System.out.println("Task 1");
        for (Integer num : numbers) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> numbers) {
        System.out.println("Task 2");
        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words) {
        System.out.println("Task 3");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    }

    private static void task4(List<String> words) {
        System.out.println("Task 4");
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word + " встречается " + Collections.frequency(words, word) + " раз ");
        }
        System.out.println();
    }
}