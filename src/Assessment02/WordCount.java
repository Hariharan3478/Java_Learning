package Assessment02;

//Coding 1: Count each word in a sentence, ignoring case and punctuation.


import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static  void main(String[] args){
        String Sentence="This is my assessment assessment";
        String[] words= Sentence.split("\\s+");


        Map<String,Integer> map=new LinkedHashMap<>();

        for(String word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(String word: map.keySet()){
            System.out.println(word+":"+map.get(word));
        }
    }
}
