import java.util.Scanner;

import static java.lang.Math.max;

public class PrimeAnagramsAndPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start and end range(0-1000): ");
        int startRange= sc.nextInt();
        int endRange= sc.nextInt();
        System.out.println("The prime numbers that are also palindrome between the range of "+startRange+" and "+endRange+" are:");
        for(int i=startRange;i<=endRange;i++){
            if(primeOrNot(i) && ispalindrome(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("The prime numbers that are also anagrams between the range of "+startRange+" and "+endRange+" are:");
        for(int i=startRange;i<endRange;i++) {
            if (primeOrNot(i)) {
                for (int j=i+1;j<=endRange;j++){
                    if(primeOrNot(j) && isAnagram(i,j)){
                        System.out.print(i+" "+j+" ");
                    }
                }
            }
        }
    }
    public static boolean primeOrNot(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean ispalindrome(int num){
        int n=num;
        int rev=0;
        while(num!=0){
            int rem= num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        return rev==n;
    }
    public static boolean isAnagram(int num1,int num2){
        int[] arr = new int[10];
        while(num1>0){
            arr[num1%10]++;
            num1=num1/10;
        }
        while (num2>0){
            arr[num2%10]--;
            num2=num2/10;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
