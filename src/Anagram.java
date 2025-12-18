import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String str1= sc.next();
        System.out.println("Enter the Second word: ");
        String str2= sc.next();
        if(Anagram(str1,str2)){
            System.out.println(str1+" and "+str2+" are anagrams.");
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagrams.");
        }
    }
    public static boolean Anagram(String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }
        int len=str1.length();
        int[] ch=new int[256];
        for(int i=0;i<len;i++){
            ch[str1.charAt(i)]++;
            ch[str2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if (ch[i]!=0) {
                return false;
            }
        }
        return true;
    }
}
