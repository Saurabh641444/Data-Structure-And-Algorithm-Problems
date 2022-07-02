import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
           int n=scn.nextInt();
           String s=scn.next();
           ArrayList<Character> list1=new ArrayList<>();
           ArrayList<Character> list2=new ArrayList<>();
           
        for(int i=0;i<s.length();i++){
               char ch=s.charAt(i);
               
                if(isPrime((int)ch)){
                    list1.add(ch);
                    }else{
                    list2.add(ch);
                   }
            }
            Collections.sort(list1);
            Collections.sort(list2);
            for(int j=0;j<list1.size();j++){
               System.out.print(list1.get(j));
               }

            for(int j=list2.size()-1;j>=0;j--){
               System.out.print(list2.get(j));
               }
    }
     private static boolean isPrime(int val){
         
                if(val%3==0 || val%2==0) return false;
                for(int i=5;i*i<=val;i=i+6){
                      if(val%i==0 || val%(i+2)==0){ return false;}
                   }
               return true;
            }
}
