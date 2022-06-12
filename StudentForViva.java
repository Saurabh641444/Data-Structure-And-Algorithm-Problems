import java.util.*;
import java.io.*;
public class StudentForViva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          ArrayList<Integer> list=new ArrayList<>();
          
          for(int i=0;i<n;i++) {
        	  list.add(sc.nextInt());
          }
          int c=0;
          while(true) {
        	  boolean flag=true;
        	  for(int i=1;i<list.size()-1;i++) {
        		  if(list.get(i)>list.get(i-1)) {
        			  flag=false;
        			  list.remove(i);
        		  }
        	  }
        	  
        	  if(flag) {
        		  break;
        	  }else {c++;}
          }
          
          System.out.println(c);
          
	}

}
