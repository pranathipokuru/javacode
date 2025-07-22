package ab56_inheritance;//Program to find min and max element in array

public class PvsLogic 
{
	
	    public static void main(String[] args)
	    {
	        int[] arr = {12, 13, 1, 10, 34, 10};

	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Minimum element: " + min);
	        System.out.println("Maximum element: " + max);
	    }
	}


