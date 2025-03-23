package Strings;

public class SubStringContainingAllThreeCharacter {
    public static int countAllSubString(String str){
        int lastA = -1;
        int lastB = -1;
        int lastC = -1;
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a') lastA = i;
            else if(ch == 'b') lastB = i;
            else if(ch == 'c') lastC = i;

            if(lastA != -1 && lastB != -1 && lastC != -1){
                count += Math.min(lastA,Math.min(lastB,lastC)) + 1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str = "abcabc";
        System.out.println(countAllSubString(str));
    }
}
