package a1;

/* Do not remove any code that is here.
 You may add new code if you wish to
 new data fields or helper methods.
 Also note that this skeleton will not compile as is,
 since the methods that return things do not contain
 return statements... so you need to add them.
*/

public class Summer {
    private int []nums;



    // Any other data fields you decide you need can go here.
private int elems;
    private int sum;

    public Summer(int n) {
      /* In this constructor, first allocate an array that hold n ints and put that in nums.
      Hint: If you add an extra field to store the index of the next open slot in the array,
      you would need to do something with that field here.
      */
        /*Your code here */
        nums= new int[n];
        elems=0;
    }

    public void add(int num) {
        // In this method, take the parameter num and put that value into the Summer.
        //num
    nums[elems]=num;
    elems++;
    }

    public int sum() {
     /* In this method, go through the array and add up all the ints
      that have been stored in it so far.
      Note that the sum of ints is of type int, so return the int sum you get.  */
int sum=0;
        /*Your code here*/
        //have the code iterate and add each number in the array
        for (int i =0; i<elems; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int high() {
     /* Find the largest number stored in the array so far
      and return it. */
        int maxelem = nums[0];
        for (int i = 0; i < elems; i++) {

            if (nums[i] > maxelem) {
                maxelem = nums[i];
            }
        }
        return maxelem;
    }


    public int low() {
     /* Find the smallest number stored in the array so far
      and return it. */

        /*Your code here */
        int minelem = nums[0]; //initiate variable minelem
        for (int i = 0; i < elems; i++) { // iteration should the array for the lowest element

            if (nums[i] < minelem) {  // if it is the lowest then the code should return the lowest element
                minelem = nums[i];
            }
        }
        return minelem;
    }


    public double average() {
     /* Find the average of all the numbers stored in the array
      so far, and return it.
      Note that the average of ints might produce a double, so
      we are returning a double.

      HEADS UP
      This method might get called before there are any
      ints stored in the array, so you need to guard
      against divide by zero.
      We will simply define the average of no numbers
      to be 0.0 so return that if the array has no numbers in it.
       */

        /*Your code here */
int sum=sum();
   //the average is the sum of all numbers divided by the number of elements in the array

        return (double) sum / elems;
    }

    public double avgOver( int thresh ) {

   /* Similar to average() except we want to only average up
      stored numbers that are ABOVE ( > ) the threshold
      parameter "thresh".

      Hint: Look at examples 1 and 2 in the readme make sure you
      understand how to calculate avgOver.

      HEADS UP
      We have the same divide by zero issue here as in average()
      so again if you are trying to take an average on no numbers
      simply return 0.0
   */

    /*Your code here */
        int nCount = 0;
        for (int i = 0; i < elems; i++) {

            if (nums[i] > thresh) {
                sum += nums[i];
                nCount++;
            }
        }
            if (nCount==0)
                return 0.0;
          return  (double) sum / nCount;
        }


    public int count ( ) {
        //Return the number of ints that have been stored in the array.

        /*Your code here */
        int count = 0;
        for (int i = 0; i<elems; i++)
            count++;
        return count;
    }

}
