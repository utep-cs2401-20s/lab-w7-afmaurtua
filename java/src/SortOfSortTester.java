import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {
   /*This was just a genral test to ensure there
   wasn't any wrong in the method and everything ws working fine
    */
    @Test
    public void TestSort1(){
        int C [] = {10,22,56,34,11,2};
        int D [] = {22,11,2,10,34,56};

        SortOfSort x = new SortOfSort();
        x.SortOfSort(C);
        assertArrayEquals(D, C);
    }
    /*The method is suppose to handle positive and
    negative numbers and this test case shows that it can
    handle a negavite number, and recognize that its
    the smallest number
     */

    @Test
    public void TestSort2(){
        int A [] = {8,7,6,-4,3};
        int B []= {6,3,-4,7,8};

        SortOfSort x = new SortOfSort();
        x.SortOfSort(A);
        assertArrayEquals(B, A);

    }
    /*For this test case the expected output
     was to make sure that the method could handle and organize
     all negative values.
     */
    @Test
    public void TestSort3(){
        int A [] = {-10,-3,-5,-32,-1};
        int B [] = {-5,-10,-32,-3,-1};

        SortOfSort x = new SortOfSort();
        x.SortOfSort(A);
        assertArrayEquals(B, A);

    }
    /*Reason for this test case is because was wanting to test
    big values and the output and also to test that is puts a duplicate
    number in the right place and not side by side.
     */

    @Test
    public void TestSort4(){
        int A [] = {55,45,78,68,55,99};
        int B [] = {68,55,45,55,78,99};

        SortOfSort x = new SortOfSort();
        x.SortOfSort(A);
        assertArrayEquals(B, A);

    }
    /*Choose this particular test case becasue
    the input is a small three number array and tested that it could handle
    the small array of three and put them in the right "order."
     */

    @Test
    public void TestSort5(){
        int A [] = {7,11,5};
        int B [] = {5,7,11};

        SortOfSort x = new SortOfSort();
        x.SortOfSort(A);
        assertArrayEquals(B, A);

    }

}
