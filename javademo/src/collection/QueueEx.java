package collection;
import java.util.PriorityQueue;


public class QueueEx {

	public static void main(String[] args) {
		
		// 100,200,300,400,500
				PriorityQueue<Integer> obj1=new PriorityQueue<>();
				obj1.add(10);
				obj1.add(12);
				obj1.add(56);
				obj1.add(98);
				obj1.add(12);
				
				System.out.println(obj1);
				
				
				obj1.remove();
				obj1.remove();
				System.out.println(obj1);
			

	}

}



	