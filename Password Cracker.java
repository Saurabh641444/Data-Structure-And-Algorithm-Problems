import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'passwordCracker' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY passwords
     *  2. STRING loginAttempt
     */

   public static String passwordCracker(List<String> passwords, String loginAttempt) {
    // Write your code here
      HashMap<String,Integer> hm=new HashMap<>();
      
      List<List<String>> result=new ArrayList<>();
      
      solve(passwords, loginAttempt,new ArrayList<>(),result,new HashMap());
      
      String res="";

      if(result.size()==0){
          return "WRONG PASSWORD";
         }

       for(int i=0;i<result.get(0).size();i++){
             if(i==result.get(0).size()-1){
                   res+=result.get(0).get(i);
               }else{
                  res+=result.get(0).get(i)+" ";
                  }
        }
       return res;
    }

   private static void solve(List<String> candidates,String target,List<String> comb,List<List<String>> result,HashMap<String,List<String>> memo){
   
   if(memo.containsKey(target)){ 
      comb=memo.get(target);
      return;
    }  

   if(target=="" || target.length()<=0) {
     result.add(new ArrayList<>(comb));
     return;
    }
   
   for(int i=0;i<candidates.size();i++){
       String password=candidates.get(i);
       int idx=target.indexOf(password);

       if(idx!=0) continue;

       comb.add(candidates.get(i));

       String tgt=target.substring(idx+password.length(),target.length());
       solve(candidates,tgt,comb,result,memo);

        comb.remove(comb.size()-1);
        memo.put(target,comb);
      }


   } 

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> passwords = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .collect(toList());

                String loginAttempt = bufferedReader.readLine();

                String result = Result.passwordCracker(passwords, loginAttempt);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
