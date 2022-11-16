/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
//         for(int i=1;i<n;i++){
//             if(guess(i)==0) return i;
//         }
        
//         return n;
        
        int low=1;
        int high=n;
        
        while(low<=high){
//             int mid=low+(high-low)/2;
//             int res=guess(mid);
//             if(res==0){
//                 return mid;
//             }else if(res<0){
                
//                 high=mid-1;
//             }else{
//                high= mid+1;
//             }
            
            int mid1=low+(high-low)/3;
            int mid2=high-(high-low)/3;
            
            int res1=guess(mid1);
            int res2=guess(mid2);
            
            if(res1==0){
                return mid1;
            }else if(res2==0){
                return mid2;
            }else if(res1<0){
                high=mid1-1;
            }else if(res2>0){
                low=mid2+1;
            }else{
                low=mid1+1;
                high=mid2-1;
            }
    }
        return -1;
    }
}