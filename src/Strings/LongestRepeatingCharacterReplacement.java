package Strings;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String str,int k){
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int maxLength = 0;
        int[] count = new int[26];

        while(right < str.length()){
            count[str.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq,count[str.charAt(right) - 'A']);

            int windowLength = right - left + 1;

            if(windowLength - maxFreq > k){
                count[str.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right - left + 1);

            right++;
        }

        return maxLength;
    }
    public static void main(String[] args){
        String str = "AABABBA";
        System.out.println(characterReplacement(str,1));
    }
}
