import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            char[][] A = new char[N][N];
            for(int i_A=0; i_A<N; i_A++)
            {
            	String[] arr_A = br.readLine().split(" ");
            	for(int j_A=0; j_A<arr_A.length; j_A++)
            	{
            		A[i_A][j_A] = arr_A[j_A].charAt(0);
            	}
            }

            int out_ = solution(A, K);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static int solution(char[][] A, int K){
        // Write your code here
        int n=A.length;
        int m=A[0].length;
         int count=0;

           for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                if(A[i][j]=='P'){
                  int z=0;
                    if(j+K>=n){
                       z=n-1;
                     }else{
                       z=j+K;
                     }
                   for(int k=j;k<=z;k++){
                    if(A[i][k]=='T'){
                       count++;
                       A[i][k]='x';
                       A[i][j]='x';
                       break;
                      }

                          }
                }else if(A[i][j]=='T'){
                    int z=0;
                    if(j+K>=n){
                       z=n-1;
                     }else{
                       z=j+K;
                     }
                   for(int k=j;k<=z;k++){
                    if(A[i][k]=='P'){
                       count++;
                       A[i][k]='x';
                       A[i][j]='x';
                       break;
                      }

                          }
                   }
               
            }
        }

        return count;
    
    }
}
