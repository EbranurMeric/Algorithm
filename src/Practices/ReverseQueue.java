package Practices;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3); // [1, 2, 3]
		Stack<Integer> s = new Stack<Integer>();
		while (!q.isEmpty()) { // Q -> S
			s.push(q.remove());
		}
		while (!s.isEmpty()) { // S -> Q
			q.add(s.pop());
		}
		System.out.println(q);
	}

}
