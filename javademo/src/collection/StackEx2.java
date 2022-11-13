package collection;

import java.util.Stack;

public class StackEx2 {

	public static void main(String[] args) {
		// 100,200,300,400,500
		
		Stack<Integer> obj=new Stack<>();
		//class objname=new class();
		
		
		obj.push(100);
		obj.push(200);
		obj.push(300);
		obj.push(400);
		obj.push(500);
		
		System.out.println(obj);
		
		
	
		System.out.println(obj.peek());
		System.out.println(obj.search(500));
		

	

	}
}
