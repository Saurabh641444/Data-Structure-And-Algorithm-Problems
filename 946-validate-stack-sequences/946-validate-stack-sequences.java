// class Solution {
//     public boolean validateStackSequences(int[] pushed, int[] popped) {
//        Stack<Integer> stack=new Stack<>();
      
//        int j=0;
//        for(int p:pushed){
//                 stack.push(p);
//                 while(!stack.isEmpty() && j<popped.length && stack.peek()==popped[j]){
//                     stack.pop();
//                     j++;
//                     }
//                 }
//           return j==popped.length;// TC O(N), SC O(N)
//     }
// }

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       int i=0;
       int j=0;
       for(int val:pushed){
                pushed[i++]=val;
                while(i>0&&pushed[i-1]==popped[j]){
                    i--;
                    j++;
                    }
                }
          return i==0;//TC O(N) SC O(1)
    }
}