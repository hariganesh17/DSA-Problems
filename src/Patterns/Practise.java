package Patterns;

public class Practise {
    //        ****
    //        ****
    //        ****
    //        ****
    public static void print1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *

    public static void print2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//            1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5
    public static void print3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
//            1
//            2 2
//            3 3 3
//            4 4 4 4
//            5 5 5 5 5
    public static void print4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    public static void print5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//            1 2 3 4 5
//            1 2 3 4
//            1 2 3
//            1 2
//            1
    public static void print6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
//                *
//               ***
//              *****
//             *******
//            *********
    public static void print7(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
//            *******
//             *****
//              ***
//               *

    public static void print8(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*n-2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
//            *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *
    public static void print9(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i >= n){
                stars = 2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//            1
//            01
//            101
//            0101
//            10101
    public static void print10(int n){
        int start = 0;
        for(int i=1;i<=n;i++){
            if(i % 2 == 0) {
                start = 0;
            } else start = 1;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void print11(int n){
        for(int i=1;i<n;i++){
            //number
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
//            1        1
//            12      21
//            123    321
//            1234  4321
//            1234554321
    public static void print12(int n){
        int space = 2*(n-1);
        for(int i=1;i<=n;i++){
            //Number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //Space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //Number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
//            1
//            2 3
//            4 5 6
//            7 8 9 10
//            11 12 13 14 15
    public static void print13(int n){
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num += 1;
            }
            System.out.println();
        }
    }
//    A
//    A B
//    A B C
//    A B C D
//    A B C D E

    public static void print14(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+i-1;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
//    A B C D E
//    A B C D
//    A B C
//    A B
//    A

    public static void print15(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+(n-i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        print15(n);
    }
}
