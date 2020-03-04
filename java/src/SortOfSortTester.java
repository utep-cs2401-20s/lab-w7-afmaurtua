import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {
    @Test
    public void TestSort1(){
        int A [] = {8,7,6,4,3};
        int B []= {6,4,3,7,8};

        SortOfSort x = new SortOfSort();
        x.SortOfSort(A);

        for(int i =0; i< A.length; i++){
            System.out.print(A[i]);
        }
        for(int i =0; i< A.length; i++){
            assertEquals(B[i], A[i]);
        }


    }
    @Test
    public void TestSort2(){
        int C [] = {10,22,56,34,11,2};
        int D [] = {22,10,2,11,34,56};

        SortOfSort x = new SortOfSort();
        x.SortOfSort(C);

        for(int i =0; i< C.length; i++){
            System.out.print(C[i]);
        }
        for(int i =0; i< C.length; i++){
            assertEquals(D[i], C[i]);
        }

    }

}
