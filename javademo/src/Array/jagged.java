package Array;

public class jagged {
	public static void main(String[] args) {
		int arr[][]=new int[4][];//declared jagged array
		arr[0]=new int[3];
		arr[1]=new int[5];
		arr[2]=new int[7];
		arr[3]=new int[7];
		int count=0;
		//initializing array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
				
			}
		}
		//display element in array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
