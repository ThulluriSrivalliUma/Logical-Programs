import java.util.Arrays;
import java.util.Scanner;



public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i=0;i<n;i++) {
            words[i]=sc.nextLine();
        }
        Arrays.sort(words);//sorting in the ascending order
        System.out.println("Enter the word to be searched: ");
        String search= sc.next();
        if(binarySearch(words,search)){
            System.out.println("Element Found.");
        }
        else {
            System.out.println("Element not Found.");
        }
    }
    public static boolean binarySearch(String[] words,String search){
        int low=0;
        int high=words.length-1;
        search=search.toLowerCase();
        while ((low<=high)){
            int mid=(low+high)/2;
            int check= (words[mid].toLowerCase()).compareTo(search);
            if(check==0){
                return true;
            } else if (check>0) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return false;
    }
}
