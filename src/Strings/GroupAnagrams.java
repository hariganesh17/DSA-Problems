package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> group(String[] str){
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : str){
            char[] chars = s.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(key,newList);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        group(input);
        System.out.println( group(input));
    }
}
