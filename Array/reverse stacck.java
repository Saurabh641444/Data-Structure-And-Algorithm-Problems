void reverse(Stack<Integer> s){
   if(s.size()==1) return;
   
   int temp=s.peek();
   s.pop();
   reverse(s);
   insert(s,temp);
  return;
 
}

void insert(Stack<Integer> s,int ele){

   if(s.size()==0)return ;

   int temp=s.peek();
   s.pop();
   insert(s,ele);
  s.push(temp0;
 return;
}
