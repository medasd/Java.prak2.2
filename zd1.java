import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zd1 {
    public static void main (String[]args)
    {
        Scanner scanner = new
        Scanner(System.in);
        
        System.out.println("введите текст: ");
        String input =
        scanner.nextLine();
        
        String[] words =
        input.split("\\s+");
        
        int wordCount = words.length;
        
        System.out.println("кол-во слов: " + wordCount);
        
        
        
        String longestWord = "";
        for (String word : words) {
            if (word.length() >
            longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("dlinoe word: " + longestWord);
        
        Map<Character, Integer>
        charCountMap = new HashMap<>();
        for (char c :
        input.toCharArray()) {
            if
            (charCountMap.containsKey(c)) {
                charCountMap.put(c,
                charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        
        System.out.println("chastota simvolov: ");
        for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + " - " + entry.getValue());
        }
    
        String reversedText = new 
        StringBuilder(input).reverse().toString();
        System.out.println("reverse: " + reversedText);
        
        scanner.close();
}

}