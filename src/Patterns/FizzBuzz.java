package Patterns;

public class FizzBuzz {
    public static void fizzBuzz(int n){
        for(int i=1;i<=100;i++){
            if(i%3 == 0 && i%5==0){
                System.out.println("fizzBuzz");
            }else if(i%3 ==0){
                System.out.println("fizz");
            }else if(i%5 ==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        int limit = 100;
        fizzBuzz(limit);
    }
}
