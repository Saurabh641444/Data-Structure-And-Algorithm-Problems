class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        
        for(int i=0;i<operations.length;i++){
            // if(operations[i].charAt(1)=='+') sum++;
            // else{ sum--;}
            String str=operations[i];
            if(str.equals("X++") || str.equals("++X")){sum++;}
            else{sum--;}
        }
        return sum;
    }
}