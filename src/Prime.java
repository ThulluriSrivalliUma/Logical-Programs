import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start and end range(0-1000): ");
        int startRange= sc.nextInt();
        int endRange= sc.nextInt();
        System.out.println("The prime numbers between the range of "+startRange+"and "+endRange+" are:");
        for(int i=startRange;i<=endRange;i++){
            if(primeOrNot(i)){
                System.out.print(i+" ");
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
}