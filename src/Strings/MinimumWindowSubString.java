package Strings;

import java.util.HashMap;

public class MinimumWindowSubString {
    public static String minimumWindow(String s,String t){
        int left = 0;
        int right =0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;
        int count = 0 ;

        HashMap<Character,Integer> map = new HashMap<>();
        // Initialize map with characters of string t
        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        while(right < s.length()){
            char rightChar = s.charAt(right);

            // If rightChar is in map, decrease its count
            if(map.containsKey(rightChar)){
                map.put(rightChar,map.get(rightChar)-1);

                // If a character count reaches 0, we have a valid match for this character
                if(map.get(rightChar)>=0){
                    count++;
                }
            }
            // Try to shrink the window as much as possible while maintaining a valid window
            while(count == t.length()){
                // Update the minimum length and starting index
                if(right - left + 1 < minLength){
                    minLength = right - left +1;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                // If leftChar is in map, increase its count
                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.getOrDefault(leftChar,0)+1);

                    // If we are no longer valid for this character, reduce the count
                    if(map.get(leftChar) > 0){
                        count --;
                    }
                }
                // Shrink the window from the left
                left++;
            }
            // Expand the window from the right
            right++;
        }
        // If no valid window was found, return an empty string
        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+minLength);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minimumWindow(s,t));
    }
}
