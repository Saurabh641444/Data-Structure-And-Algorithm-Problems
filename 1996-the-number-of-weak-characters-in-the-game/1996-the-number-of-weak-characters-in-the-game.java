class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int n=properties.length;
        
        int count=0;
        
        Arrays.sort(properties,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
    
        
        int pre_defence=properties[n-1][1];
        
        for(int i=n-2;i>=0;i--){
            int curr_attack=properties[i][0];
            int curr_defence=properties[i][1];
            
            
            System.out.println(pre_defence+"<"+curr_defence);
            
            if( pre_defence>curr_defence){
                count++;
            }
            
            else{
            pre_defence=curr_defence;
            }
        }
        
        return count;
    }
}