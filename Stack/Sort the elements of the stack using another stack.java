class solution{
 public Stack<Integer> sort(Stack<Integer> s){//s=1 2 3
   	//add code here.
//will create another stack
		java.util.Stack<Integer> tempStack =new java.util.Stack<>();
		while(!s.isEmpty()){ 
		    int temp=s.pop();//pop element from input 1 2 3
      while(!tempStack.isEmpty() && tempStack.peek()>temp){//F F F
          s.push(tempStack.pop());//
       }
		    tempStack.push(temp);//1 2 3
		}

		return tempStack ;// 

}}
