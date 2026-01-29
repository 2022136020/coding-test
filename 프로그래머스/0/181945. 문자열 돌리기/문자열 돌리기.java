import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        for(int i = 0; i<a.length();i++){
            if(i==0){
            b = a.substring(i,i+1)+"\n";    
            }else{
                b = b + a.substring(i,i+1)+"\n";
            }
            
        }
        
            System.out.println(b);
    }
}