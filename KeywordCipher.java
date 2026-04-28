import java.util.ArrayList;

public class KeywordCipher {

    public static String encodeWord(String word, ArrayList<String> codebook) {
        int i = 0;
        while (i < codebook.size()) {
            String start = codebook.get(i);
            String[] replace = start.split(",");
            if (word.equals(replace[0])) {
                word = replace[1];
            }
            i++;
        }
        return word;
    }

    public static String encodeSentence(String sentence, ArrayList<String> codebook) {
        String[] list = sentence.split(" ");
        int p = 0;
        String base = "";
        while (p < list.length) {
            String replace = list[p];
            replace = encodeWord(replace, codebook);
            base = base + replace + " ";
            p++;
        }

        return base;
    }

    public static String decodeSentence(String sentence, ArrayList<String> codebook) {
        String[] each=sentence.split(" ");
        int i=0;
        int p=0;
        String base="";
        while(i<each.length){
            String spec=each[i];

            while (p < codebook.size()) {
            String start = codebook.get(p);
            String[] replace = start.split(",");
            if (spec.equals(replace[1])) {
                spec=replace[0];
            }
            p++;
        }
        p=0;
        base=base+spec+" ";
        i++;
        }
        
        
        return base;
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
        System.out.println(encodeWord("dog", codebook)); // expected: bravo
        System.out.println(encodeWord("cat", codebook)); // expected: alpha
        System.out.println(encodeWord("hello", codebook)); // expected: hello

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
