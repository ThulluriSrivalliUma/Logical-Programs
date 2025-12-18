import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i=0;i<n;i++) {
            words[i]=sc.nextLine();
        }
        insertionSort(words);
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void insertionSort(String[] arr) {
        for (int i=1;i<arr.length;i++) {
            String element=arr[i];
            int j =i-1;
            while (j>=0 && arr[j].compareTo(element)>0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
        }
    }
}