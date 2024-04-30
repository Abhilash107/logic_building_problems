import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wordContainingCharacter {
    public static void main(String[] args) {
        String[] s = {"leet","code"};
        List<Integer> list = findWordsContaining(s, 'e');
        System.out.println(list);

        
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))){
                list.add(i);
            }   
        }
        if(list.size() != 0 ){
            return list;
        }

        return Arrays.asList();

    
    }

}
