class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double result=0;
        double count=0;
        double resultant=0;
        
        int amt=arr.length*1/20;
        
        for(int i=amt;i<arr.length-amt;i++){
            result=result+arr[i];
            count++;
        }
        
        resultant=result/count;
        
        return resultant;
        
    }
}