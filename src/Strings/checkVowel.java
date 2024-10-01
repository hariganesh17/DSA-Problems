package Strings;

public class checkVowel {
    public static boolean check(String str){
        for(char Char : str.toCharArray()){

            if(Char == 'a' || Char == 'e' || Char == 'i'
                    || Char == 'o' || Char == 'u'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str = "Hll";
        Boolean result = check(str);
        System.out.println(result);
    }
}
