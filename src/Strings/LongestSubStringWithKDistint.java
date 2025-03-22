package Strings;

import java.util.HashMap;

public class LongestSubStringWithKDistint {
    public static int distinctCharacter(String str,int k){
        int left = 0;
        int right = 0;
        int maxLength = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        while(right < str.length()){
            map.put(str.charAt(right),map.getOrDefault(str.charAt(right),0)+1);

            if(map.size() > k){
                map.put(str.charAt(left),map.get(str.charAt(left))-1);
                if(str.charAt(left)==0){
                    map.remove(str.charAt(left));
                }
                left++;
            }
            maxLength = Math.max(maxLength,right - left +1);
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args){
        String str = "abbbbbbc";
        System.out.println(distinctCharacter(str,2));
    }
}
