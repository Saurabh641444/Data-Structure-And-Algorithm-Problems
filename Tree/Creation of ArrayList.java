class solution{
public static void main(string[] args){
ArrayList<Integer> list=new ArrayList<>();
System.out.println(list+"->"+list.size());

list.add(10);
list.add(20);
System.out.println(list+"->"+list.size());

int val=list.get(1);
System.out.println(val);

list.set(1,2000);
System.out.println(list+"->"+list.size());

}

}
