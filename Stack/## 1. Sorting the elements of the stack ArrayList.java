class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
//Let's just create the arrayList
		java.util.ArrayList<Integer> list =new java.util.ArrayList<>();
		while(!s.isEmpty()){ //check that stack empty or not before putting elements in arraylist
		    list.add(s.pop());// add in arraylist and remove from stack
		    
		}
//use inbuilt collections.sort to sort an elements
		java.util.Collections.sort(list);
		for(int i=0;i<list.size();i++){
		    s.push(list.get(i));// push elements to stack from arraylist
		}
		return s;
	}
}
