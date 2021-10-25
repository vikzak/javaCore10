import java.util.*;

public class MyArray {
    public static String[] getArray() {
        return new String[] {
                "молоко", "ряженка", "кефир", "йогурт", "майонез",
                "молоко", "ряженка", "кефир", "йогурт", "майонез",
                "молоко", "ряженка", "кефир", "йогурт", "майонез",
                "батон", "хлеб", "квас", "лимонад", "блины"
        };
    }

    public static void printUniqueWords(String[] array) {
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(array));
        System.out.println("Уникальные слова:\n" + uniqueWords);
    }

    public static void printCounterWords(String[] getCountArray){
        Map<String, Integer> counterWordArray = new HashMap<>();
        for (String word : getCountArray) {
            counterWordArray.put(word, counterWordArray.getOrDefault(word, 0) + 1);
        }
        System.out.println("Количество повторяющихся слов:\n" + counterWordArray + "\n");
    }
}
