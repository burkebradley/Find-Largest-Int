
public class FindLargest
	{

		public static void main(String[] args)
			{
				int [] myArray = {1,2,3,4,5,6,7,8,9,100};
				int largestNumber = myArray [0];
				for (int i = 0; i < myArray.length; i++)
					if (myArray [i] > largestNumber)
					{
						largestNumber = myArray [i];
					}
				System.out.println(largestNumber);
				System.out.println(Integer.MIN_VALUE);
			}
	}
