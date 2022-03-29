/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
      ArrayList<String> list=new ArrayList<>();
      String s="ab";
      String op="";
      solve(s,op,list);
      
      for(int i=0;i<list.size();i++){
          System.out.print(list.get(i)+" ");
      }
	}
	
	public static void solve(String s,String op,ArrayList<String> list){
	    if(s.length()==0) {
	        list.add(op);
	        return;
	    }
	    String newS=s.substring(1,s.length());
	    String dummy=""+s.charAt(0)+"";
	    String op1=op+dummy.toUpperCase();
	    String op2=op+dummy;
	    solve(newS,op1,list);
	    solve(newS,op2,list);
	}
}
