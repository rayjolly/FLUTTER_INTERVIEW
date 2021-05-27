public class Repeat   
{
	
   void printRepeat(int arr[], int size)
    {
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }
 
    public static void main(String[] args)
    {
        Repeat repeat = new Repeat();
        int arr[] = {0,1,2,3,4,5,6,7,7,8,9,10};
        int arr_size = arr.length;
        repeat.printRepeat(arr, arr_size);
    }
}
