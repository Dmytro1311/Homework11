package net.dmytro.homework11;

public class Arrays {
    public static int[] returnedNewArrayAfterFour(int[]array) {
        int index = -1;

        for (int i = array.length -1 ; i >= 0; i--) {
            if (array[i] == 4) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new RuntimeException("Array without any 4");
        }
        int[] newArray = new int[array.length - index-1];
        System.arraycopy(array, index+1, newArray, 0, (array.length - index-1));
        return newArray ;

    }

    public static boolean checkArray(int[]array){
        boolean numberOneIsHere =false;
        boolean numberFourIsHere = false;

        for (int i =0; i<array.length;i++){
            if (array[i] == 1){
                numberOneIsHere = true;
            }else if (array[i] == 4){
                numberFourIsHere = true;
            }else {
                return false;
            }
        }
        return numberFourIsHere && numberOneIsHere;
    }
}
