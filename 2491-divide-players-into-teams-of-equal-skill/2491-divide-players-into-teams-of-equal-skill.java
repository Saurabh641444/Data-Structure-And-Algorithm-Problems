class Solution {
    public long dividePlayers(int[] skill) {
        long ans=0;
        
        Arrays.sort(skill);
        
        boolean flag=isPossible(skill,skill.length);
        
        if(skill.length==2) flag=true;
        if(flag==false) return -1;
        
        int i=0;
        int j=skill.length-1;
        
        while(i<j){
            ans=ans+skill[j--]*skill[i++];
        }
        
        return ans;
    }
    
    private boolean isPossible(int [] arr,int n){
        
        int i=0;
        int j=n-1;
        
        int sum=arr[i++]+arr[j--];
        
        int count=1;
        
        while(i<j){
            if(sum==arr[j]+arr[i]) count++;
            i++;j--;
        }
        
        return count==n/2;
    }
}