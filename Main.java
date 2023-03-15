import java.util.*;
import java.util.Map.Entry;
import java.util.Collections;


public class Main {

    int singleNumber(int[] nums ) {
        HashMap<Integer, Integer> frequencyMap= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currElem = nums[i];
            if (frequencyMap.containsKey(currElem)) {
                int currFrequency = frequencyMap.get(nums[i]);
                frequencyMap.put(currElem, currFrequency + 1);
            } else {
                frequencyMap.put(currElem, 1);
            }
        }
        for (Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    int  minSplit(int amount){
        int[] coins= {50,20,10,5,1};
        int numCoins=0;
        for( int i=0; i<coins.length; i++){
            while(amount >= coins[i]){
                amount-=coins[i];
                numCoins++;
            }
        }
        return numCoins;
    }

    int notContains(int[] array) {
            boolean[] present = new boolean[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 1 && array[i] <= array.length) {
                    present[array[i]] = true;
                }
            }
            for (int i = 1; i < present.length; i++) {
                if (!present[i]) {
                    return i;
                }
            }
            return present.length;
        }


    public String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
        return result;
    }


    public int countvariantsHelper(int stearsCount, int result){
        if(stearsCount==0){
            return 0;
        }
        else if(stearsCount==1){
            return 1;
        } else if(stearsCount==2){
            return 2;
        } else {
            return countvariantsHelper(stearsCount-1, result+1) + countvariantsHelper(stearsCount-2, result+1);
        }
    }

    public int countVariants(int stearsCount){
        int result= countvariantsHelper(stearsCount,0);
        return result;
    }
}