package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    //Time - n! and O(N) ; spce - O(N) and O(N)
    private static void recursion(char[] chars,List<List<Character>> ans, List<Character> ds, boolean[] freq){
        if(ds.size() == chars.length){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<chars.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(chars[i]);
                recursion(chars,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    private static List<List<Character>> permute(char[] chars){
        List<List<Character>> ans = new ArrayList<>();
        List<Character> ds = new ArrayList<>();
        boolean[] freq = new boolean[chars.length];
        recursion(chars,ans,ds,freq);
        return ans;
    }
    public static void main(String[] args){
        char[] chars ={'A','B','C'};
       List<List<Character>> result = permute(chars);
       for(List<Character> op : result){
           System.out.println(op);
       }
    }
}
