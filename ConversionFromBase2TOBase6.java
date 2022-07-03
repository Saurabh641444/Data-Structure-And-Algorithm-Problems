import java.util.*;
import java.io.*;
public class Base2ToBase10Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn=new Scanner(System.in);
       String ip=scn.nextLine();
       String ans=solve(ip);
       
       System.out.println(ans);
	}
	
	private static String solve(String ip) {
		int decimal=0;//1101
		int j=ip.length()-1;
		for(int i=0;i<ip.length();i++) {
			if(ip.charAt(i)=='1') {
			decimal=decimal+(int)Math.pow(2,j);
			}
			j--;
		}
		
		int ans=0;
		StringBuilder sb=new StringBuilder();
		while(decimal>0) {
			int rem=decimal%6;
			sb.append(Integer.toString(rem));
			decimal=decimal/6;
		}
		return sb.toString();
	}

}
