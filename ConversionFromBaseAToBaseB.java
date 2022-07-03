import java.util.*;
import java.io.*;
public class ConversionFromBaseAToBaseB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        
        int A=sc.nextInt();
        int B=sc.nextInt();
       System.out.println( solve(ip,A,B));
	}
	
	private static String solve(String ip,int A,int B) {
		int num=todecimal(ip,A);
		
		String ans=fromdecimal(num,B);
		
		return ans;
		
	}
	
	private static int todecimal(String ip,int A) {
		int res=0;
		int power=1;
		for(int i=ip.length()-1;i>=0;i--) {
			char ch=ip.charAt(i);
			if(val(ch)>=A) {
				System.out.println("invalid input");
				return -1;
			}else {
				res+=val(ch)*power;
				power=power*A;
			}
		}
		
		return res;
		
	}
	
	private static int val(char ch) {
		if(ch>='0'&&ch<='9') {
			return (int)ch-'0';
		}else {
			return (int)ch-'A'+10;
		}
	}
	
	private static char reVal(int ch) {
		if(ch>= 0&&ch<=9) {
			return (char)(ch+'0');
		}else {
			return (char)(ch-'A'+10);
		}
	}
	
	private static String fromdecimal(int num,int B) {
		StringBuilder res=new StringBuilder();
		
		while(num>0) {
			res.append(num%B);
			num=num/B;
		}
		
		res.reverse();
		
		return res.toString();
	}

}
