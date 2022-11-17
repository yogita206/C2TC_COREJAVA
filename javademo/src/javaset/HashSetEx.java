package javaset;
import java.util.HashSet;
import java.util.Set;

		public class HashSetEx {

			public static void main(String[] args) {
				
					
				Set<String> obj=new HashSet<>();
			
				obj.add("Yogita");
				obj.add("vaishnavi");
				obj.add("kiran");
				obj.add("Rekha");
				obj.add("Samiksha");
				obj.add(null);
				
				Set<String> obj1=new HashSet<>();
				
				obj1.add("Yogita");
				obj1.add("vaishnavi");
				obj1.add("kiran");
				obj1.add("Rekha");
				
				obj1.add(null);
			
				System.out.println(obj);
				
				System.out.println(obj.size());
				System.out.println(obj.contains("Nayna"));
				System.out.println(obj.getClass());
				System.out.println(obj.isEmpty());
				System.out.println(obj.equals(obj1));


			

			}

		}
		
