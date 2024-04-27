import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer numbers : nums) {
            if (numbers % 2 == 1) {
                oddNumbers.add(numbers);
            }
        }
        System.out.println(oddNumbers);
        System.out.println("Task2");

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer numbers : nums) {
            if (numbers % 2 == 0 && !evenNumbers.contains(numbers)) {
                evenNumbers.add(numbers);
            }
        }
        System.out.println(evenNumbers);
        System.out.println("Task3");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        Set<String> uniqueWords = new HashSet<>(strings);

        System.out.println(uniqueWords);

        System.out.println("Task4");

        Map<String, Integer> numberOfDuplicates = new HashMap<>();

        strings.forEach(string ->
                numberOfDuplicates.put(string,
                        numberOfDuplicates.getOrDefault(string, 0) + 1));

        System.out.println(numberOfDuplicates);

    }
}