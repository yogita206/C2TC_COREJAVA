package collection;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// 100,200,300,400,500
		
		Stack<Integer> obj=new Stack<>();
		obj.push(100);
		obj.push(200);
		obj.push(300);
		obj.push(400);
		obj.push(500);
		System.out.println(obj);
		
		obj.pop();
		System.out.println(obj);
	

	}

}
