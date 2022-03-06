/*
1. Convert the array into the string
2. Sort the string by using comparartor in the decreassing order
3. Return the zero string if first string in array consist of zero string value
4. Do the string concatination using stringbuilder
5. convert that string builder string into the string
/* Time O(nlogn+n) Space O(n) extra array*/


class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length==0){ return " ";}

        String[] arr=new String[nums.length];
        for(int val=0;val<nums.length;val++){
               arr[val]=Integer.toString(nums[val]);
            }
 
        Arrays.sort(arr,new Comparator<String>(){
                public int compare(String a, String b){
                  String o1=a+b;
                  String o2=b+a;
                  return o2.compareTo(o1);//sort in decreasing order
                   }
                  });

           if(arr[0].equals("0")){ return "0";}
    
          StringBuilder sb=new StringBuilder();
          for(String s:arr){
              sb.append(s);
                }
         return sb.toString();

/* Time O(nlogn) Space O(n)*/
    }
}