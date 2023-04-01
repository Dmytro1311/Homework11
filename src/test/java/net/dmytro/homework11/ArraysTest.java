package net.dmytro.homework11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    @Test
    public void returnedNewArrayAfterFourTest(){
        int [] array = {1,2,3,5,6,4,7,8};
        int[] expected = {7,8};
        Assertions.assertArrayEquals(expected,Arrays.returnedNewArrayAfterFour(array));
    }
    @Test
    public void returnedNewArrayAfterFourTest2(){
        int [] array = {1,2,4,5,4,6,5,9,7,8};
        int[] expected = {6,5,9,7,8};
        Assertions.assertArrayEquals(expected,Arrays.returnedNewArrayAfterFour(array));

    }
    @Test
    public void returnedNewArrayAfterFourTest3(){
        int [] array = {4,2,4,5,6,5,9,4,7,8};
        int[] expected = {7,8};
        Assertions.assertArrayEquals(expected,Arrays.returnedNewArrayAfterFour(array));

    }
    @Test
    public void returnedNewArrayWithOutFourTest(){
        int [] array = {1,2,3,5,6,5,9,9,7,8};
        Assertions.assertThrows(RuntimeException.class,() -> Arrays.returnedNewArrayAfterFour(array));

    }

    @Test
    public void checkArrayTest1(){
        int[]array = {4,4,4,4,4,1,1,1,1,1};
        Assertions.assertTrue(Arrays.checkArray(array));
    }
    @Test
    public void checkArrayTest2(){
        int[]array = {4,4,4,4};
        Assertions.assertFalse(Arrays.checkArray(array));
    }
    @Test
    public void checkArrayTest3(){
        int[]array = {1,1,1,1};
        Assertions.assertFalse(Arrays.checkArray(array));
    }
    @Test
    public void checkArrayTest4(){
        int[]array = {4,1,4,1,4,1};
        Assertions.assertTrue(Arrays.checkArray(array));
    }
}
