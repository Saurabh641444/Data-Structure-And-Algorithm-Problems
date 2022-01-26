// { Driver Code Starts
import java.util.Scanner;



class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {
        for(int i=n;i>=1;i--){
            int k=n;
            int count=1;
            for(int j=n*i;j>=1;j--){
                System.out.print(k+" ");
                if(count%i==0){
                    k--;
                }
                count++;
            }
            System.out.print('$');
        } 
    }
}