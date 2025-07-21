import java.io.*;

public class CountWord {
    public static void main(String[] args) {
        String word = "Java";
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\s+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Occurrences of word '" + word + "': " + count);
    }
}