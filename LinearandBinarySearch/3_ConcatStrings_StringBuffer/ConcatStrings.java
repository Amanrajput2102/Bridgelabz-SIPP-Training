public class ConcatStrings {
    public static String concat(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] input = {"Hello", " ", "World", "!"};
        System.out.println(concat(input)); // Output: Hello World!
    }
}