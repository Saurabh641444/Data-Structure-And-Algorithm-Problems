/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
// 		System.out.println("GfG!");

        String str="ab";
        solve(str, " ");
	}
	
	public static void solve(String ip, String op){
	    if(ip.length()==0){
	        System.out.println(op+" ");
	        return;
	    }
	    
	    String op1=op;
	    String op2=op;
	    op2+=ip.charAt(0);
	   String ip1=ip.substring(1);
	    solve(ip1,op1);
	    solve(ip1,op2);
	}
}
