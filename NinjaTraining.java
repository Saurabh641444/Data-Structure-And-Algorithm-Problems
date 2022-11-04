// ninja training


/* recursive solution*/

/*
1. Express the problem in term of index
2. do all possible steps
3. max nikalo

but here with index our task value is also changing
*/

int NinjaTraining(int[][] arr,int n){
  return solve(n-1,3,arr);
}

int solve(int day,int last,int[][] arr){


  if(day==0){

    int max=0;

    for(int i=0;i<3;i++){
       if(i!=last){
         max=Math.max(max,arr[0][i]);
         }
       }

     return max;
   }

   int max=0;

   for(int task=0;task<3;task++){

      if(last!=task){

          int point=arr[day][task]+solve(day-1,task,arr);

         max=Math.max(point,max);
         }
    }

   return max;
}


/*Memoization*/
int NinjaTraining(int[][] arr,int n){
int dp[][]=new dp[n][3];
 for(int []a:dp) Arrays.fill(a,-1);
  return solve(n-1,3,arr,dp);
}

int solve(int day,int last,int[][] arr,int[][] dp){


  if(day==0){

    int max=0;

    for(int i=0;i<3;i++){
       if(i!=last){
         max=Math.max(max,arr[0][i]);
         }
       }

     return max;
   }

  if(dp[day][last]!=-1) return dp[day][last];

   int max=0;

   for(int task=0;task<3;task++){

      if(last!=task){

          int point=arr[day][task]+solve(day-1,task,arr);

         max=Math.max(point,max);
         
         }
    }

   return dp[day][last]=max;
}

/*Tabulation.java*/

int ninjaTraining(int[][] arr,int n){
    
  int dp[][]=new int[n+1][4];
  
  dp[0][0]=Math.max(dp[0][1],dp[0][2]);
  dp[0][1]=Math.max(dp[0][0],dp[0][2]);
  dp[0][2]=Math.max(dp[0][1],dp[0][0]);
  dp[0][3]=Math.max(dp[0][0],Math.max(dp[0][1],dp[0][2]));
  
  for(int day=0;day<n;day++){
  
    for(int last=0;last<4;last++){
       dp[day][last]=0;
      
      for(int task=0;task<3;task++){
        
        if(last!=task){
        
           int point=arr[day][task]+dp[day-1][task];
          
          dp[day][task]=Math.max(point,dp[day][task];
        }
         
      }
      
      
    }
  
  }
  
  return dp[n-1][3];
  
}
