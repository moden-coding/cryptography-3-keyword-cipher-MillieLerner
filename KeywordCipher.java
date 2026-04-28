import java.util.ArrayList;

public class KeywordCipher {

    public static String encodeWord(String word, ArrayList<String> codebook) {
        return "";
    }

    public static String encodeSentence(String sentence, ArrayList<String> codebook) {
        return "";
    }

    public static String decodeSentence(String sentence, ArrayList<String> codebook) {
        return "";
    }

    public static void main(String[] args) {
        

        // Build a sample codebook
        ArrayList<String> codebook = new ArrayList<String>();
        codebook.add("dog,bravo");
        codebook.add("cat,alpha");
        codebook.add("meet,foxtrot");
        codebook.add("tonight,sierra");
        codebook.add("at,tango");
        codebook.add("the,november");
        codebook.add("park,lima");
        codebook.add("run,delta");

        // Test encodeWord
        System.out.println("=== encodeWord ===");
        System.out.println(encodeWord("dog", codebook));       // expected: bravo
        System.out.println(encodeWord("cat", codebook));       // expected: alpha
        System.out.println(encodeWord("hello", codebook));     // expected: hello

        // Test encodeSentence
        System.out.println("\n=== encodeSentence ===");
        System.out.println(encodeSentence("meet the dog at the park", codebook));
        // expected: foxtrot november bravo tango november lima

        // Test decodeSentence
        System.out.println("\n=== decodeSentence ===");
        System.out.println(decodeSentence("foxtrot november bravo tango november lima", codebook));
        // expected: meet the dog at the park
    }
}
