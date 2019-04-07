
package javaapplication4;
public class JavaApplication4
{
    void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    // Same function as in recursion
    int sorting (int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
 
        for (int j = low; j <= high- 1; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                
                swap(arr,i,j); // Caling swap function
            }
        }
        // swap arr[i+1] and arr[high]
        swap(arr,i+1,high);
        return (i + 1);
    }
 
    // Sorting using iterative QuickSort
    void QuickSort(int arr[], int low, int high)
    {
        // creating a stack
        int stack[] = new int[high-low+1];
 
        
        int top = -1; // initializing top of stack

        stack[++top] = low;
        stack[++top] = high;
 
        while (top >= 0)
        {
            high = stack[top--];
            low = stack[top--];
 
            // set pivot element at it's proper position
            int p = sorting(arr, low, high);
 
            if ( p-1 > low )
            {
                stack[ ++top ] = low;
                stack[ ++top ] = p - 1;
            }
 
           
            if ( p+1 < high )
            {
                stack[ ++top ] = p + 1;
                stack[ ++top ] = high;
            }
       }
    }
 
    // To print contents of Array of size 'n'
    void printArr( int arr[], int n )
    {
        int i;
        for ( i = 0; i < n; ++i )
            System.out.print(arr[i]+" ");
    }
 
   
}

