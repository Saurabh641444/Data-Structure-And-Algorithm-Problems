class Solution {
    /*O(N)+O(NlogN)*/
  /*  public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
        double sum=0;
        int count=0;
        for(int i=1;i<n-1;i++){
            sum+=salary[i];
            count++;
        }
        double result=sum/count;
        return result;
    }*/
    
    /*O(N)*/
    
    public double average(int[] salary) {
       
        double sum=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int s:salary){
            min=Math.min(s,min);
            max=Math.max(s,max);
            sum+=s;
            count++;
            
        }
        double result=(sum-(max+min))/(count-2);
        return result;
    }
}