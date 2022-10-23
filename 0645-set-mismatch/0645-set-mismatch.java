class Solution {
    public int[] findErrorNums(int[] nums) {
       /* int ans[]=new int[2];
        Map<Integer,Integer> hm=new HashMap<>();
        
        
        
        
        for(int i=0;i<nums.length;i++){
           hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);    
        }
        
        for(int i=1;i<=nums.length;i++){
           if(hm.containsKey(i)==false){
               ans[1]=i;
           }
            else if(hm.get(i)==2){
                ans[0]=i;
            }
        }
        
        return ans;*/
        
        /*int n=5;
		int nums[]={1,2,4,4,5};*/
		/* 100  ^ 011=111
		 * 001 
		 * 001 & 001 ==001 missing 0^1
		 * 010 & 001 ==000 duplicate 0^010
		 * 100 & 001 ==000 duplicate 000^010^100 
		 * 100 & 001 ==000 duplicate 000^010 ^100 ^100=010
		 * 101 & 001 ==001 missing 001^101=100
		 * 
		 * 001 & 001 ==001 missing 100 ^001
		 * 010 & 001 ==000 duplicate 010 ^010=0
		 * 011 & 001 ==010 missing 100 ^ 001 ^011
		 * 100 & 001 ==000 duplicate 100= 4 in decimal
		 * 101 & 001 ==001 missing 100^001^011^101= 111^011^101=100^101=011= 3 in decimal
		 * */
		int ans[]=new int[2];
        int n=nums.length;
        
		int xor=0;
		
		for(int num:nums){
			xor=xor^num;
		}
		
		for(int i=1;i<=n;i++){
			xor=xor^i;
		}
		
		// System.out.println(xor);
		
		int missing=0;
		int duplicate=0;
		
		int rightMostBit=xor&~(xor-1);
		
		// System.out.println(rightMostBit);
		
		for(int num:nums){
			if((num & rightMostBit)==0){
				duplicate=duplicate^num;
			}else{
				missing=missing^num;
			}
		}
		
		// System.out.println(duplicate);
		// System.out.println(missing);
		
		for(int num=1;num<=n;num++){
			if((num & rightMostBit)==0){
				duplicate=duplicate^num;
			}else{
				missing=missing^num;
			}
		}
		
		// System.out.println(duplicate);
		// System.out.println(missing);
        
        for(int num:nums){
            if(num==missing){
               return new int[]{missing,duplicate}; 
            }
        }
        
        return new int[]{duplicate,missing};
    }
}