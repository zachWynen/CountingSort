/**
 *      ZACH WYNEN, ARON LATINJAK       ICS4U       DECEMBER 2, 2016
 *      This program uses several iterative repetitions to sort an array
 *      using the counting sort method, as described in the presentation.
 */

package countingsort;


public class CountingSort {

    
    public static void main(String[] args) {
      //Variable declaration   
      int[] input = {4,2,6,3,5,3,4,7,1,2};
      int[] temp = new int[10];
      int[] output = new int[10];
      int adder = 0;
      
      //Printing out unsorted array
      System.out.println("Unsorted Array: ");
      for(int p = 0; p < input.length; p++)
       System.out.print("  " + input[p]);   
      
      
      
      //First step: Incrementing temporary array based on values of input array
      for(int i = 0; i < input.length; i++)
       temp[input[i]]++;
      
      //Printing out temporary array
      System.out.println("\nTemporary array, first stage: ");
      for(int p = 0; p < input.length; p++)
       System.out.print("  " + temp[p]);   
      
      
      
      //Second step: Adding all previous indices of temporary array to each index
      for(int f = 0; f< input.length; f++)
      {
       temp[f] += adder;   
       adder = temp[f];
      }
      
      //Printing out temporary array
      System.out.println("\nTemporary array, second stage: ");
      for(int p = 0; p < input.length; p++)
       System.out.print("  " + temp[p]);   
      
      
      
      /*Third Step: Decrementing temporary array, and then placing the individual 
       values into the corresponding location in the output array*/
      for(int l = 0; l<input.length; l++)
      {
       temp[input[l]] --;
       output[temp[input[l]]] = input[l];
      }
      
      //Printing out final, sorted product
      System.out.println("\nSorted array: ");
      for(int p = 0; p < input.length; p++)
       System.out.print("  " + output[p]);    
    }
}
