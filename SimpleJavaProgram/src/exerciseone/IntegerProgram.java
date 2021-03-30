package exerciseone;

import java.util.HashSet;
import java.util.Set;

public class IntegerProgram {

    public static void main(String[] args) {
        int[]integerArray1 = new int[]{1,3,6,4,12};
        int[]integerArray2 = new int[]{5,-1,3};

        int result1 = getTheSmallestNonOccurringInteger(integerArray1);
        int result2 = getTheSmallestNonOccurringInteger(integerArray2);

        System.out.println("Result for Array 1 is " + result1);
        System.out.println("Result for Array 2 is " + result2);
    }

    private static int getTheSmallestNonOccurringInteger(int[] integerArray) {
        Set<Integer> integerSet = new HashSet<>();
        for(int integer : integerArray){
            if(integer > 0){
                integerSet.add(integer);
            }
        }

        for(int integer = 0; integer <= integerArray.length; integer++){
            if(!integerSet.contains(integer)){
                return integer;
            }
        }

        return 0;
    }
}
