import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     Queue<Integer> que=new ArrayDeque<>();// Queue is only interface which is implemented by Deque in ArrayInterface class

que.add(10);
System.out.println(que);
que.add(20);
System.out.println(que);
que.add(30);
System.out.println(que);
System.out.println(que.peek());
System.out.println(que.remove());
System.out.println(que);

    }
}
