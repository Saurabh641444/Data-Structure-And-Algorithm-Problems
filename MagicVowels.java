import java.util.*;

public class MagicalVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] ch= {'a','e','i','o','u'};
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(solve(str,ch));
	}
	private static final int NOT_POSSIBLE=-1000000000;
	private static int solve(String str,char [] ch) {
		
		if(str.length()==0||ch.length==0)return 0;
		
		if(str.length()<ch.length)return NOT_POSSIBLE;
		
		if(str.length()==ch.length) {
			for(int i=0;i<str.length();i++) {
				
				if(str.charAt(i)!=ch[i]) {
					return NOT_POSSIBLE;
				}
			}
			
			return str.length();
		}
		
		if(str.charAt(0)<ch[0]) {
			return solve(str.substring(1),ch);
		}else if(str.charAt(0)==ch[0]){
			return Math.max(Math.max(1+solve(str.substring(1),ch),1+solve(str.substring(1),Arrays.copyOfRange(ch, 1, ch.length)) ), solve(str.substring(1),ch));
		}else {
			return solve(str.substring(1),ch);
		}
	}

}
