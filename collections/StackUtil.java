package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class StackUtil
{
	// Iterate through Stack in Java
	public static void main (String[] args)
	{
		// if we use Stack, output will be [1, 2, 3]
	//	Stack<Integer> stack = new Stack<>();

		// if we use Deque, output will be [3, 2, 1]
		 Deque<Integer> stack = new ArrayDeque<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
System.out.println(stack);
	}
}