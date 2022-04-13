// { Driver Code Starts
import java.util.*;


class Find_All_Possible_Strings
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			ArrayList<String> arr = g.spaceString(str);
			for(String s : arr){
			    System.out.print(s+"$");
			}
            System.out.println();
			t--;
		}
	}
}// } Driver Code Ends


/*You have to complete this function*/
class GfG
{    
    ArrayList<String> ans=new ArrayList<>();
    ArrayList<String> spaceString(String str)
    {
        // Your code here
        solve(str,str,""+str.charAt(0));
        return ans;
    }
    
    public void solve(String str,String ip, String op){
        
        if(ip.length()==str.length()){
            op=""+str.charAt(0);
            ip=str.substring(1);
            solve(str,ip,op);
        }else{
        
        if(ip.length()==0){
            ans.add(op);
            return;
        }
        String op1=op+ip.charAt(0);
        // String op2=op;
        
        String op2=op+" "+ip.charAt(0);
        ip=ip.substring(1);
        solve(str,ip,op1);
        solve(str,ip,op2);
        
        }
    }
}
