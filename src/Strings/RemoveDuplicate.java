package Strings;

public class RemoveDuplicate {
    public static String remove(String str){
        String ans = "";
        for(int i=0;i<str.length();i++){
            int j=0;
            for(j=0;j<str.length();j++){
                if(str.charAt(j) == str.charAt(i)){
                    break;
                }
            }
            if(i ==j){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String str = "MADAM";
        String result = remove(str);
        System.out.println(result);
    }
}
