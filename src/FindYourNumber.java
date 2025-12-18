import java.util.Scanner;

public class FindYourNumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        System.out.println("Think of a number between 0 and " +(n-1));
        int result=guessNumber(0,n-1,sc);
        System.out.println("Your number is: "+result);
    }
    private static int guessNumber(int low,int high,Scanner sc){
        if (low==high){
            return low;
        }
        int mid=(low+high)/2;
        System.out.println("Is your number between "+low+" and "+mid+" ? (true/false)");
        boolean answer=sc.nextBoolean();
        if (answer){
            return guessNumber(low,mid,sc);
        }
        else {
            return guessNumber(mid+1,high,sc);
        }
    }
}