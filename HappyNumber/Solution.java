package HappyNumber;

import javax.naming.TimeLimitExceededException;
import java.util.HashSet;
import java.util.concurrent.TimeoutException;

class Solution {
    public boolean isHappy(int n) {

        boolean res = true;

        HashSet<Integer> set = new HashSet<>();
        set.add(n);

        if(n == 1) return true;

        while(n != 1){

            int temp = n;
            int sum = 0;

            while(temp != 0){

                int digit = temp % 10;

                temp = temp / 10;

                sum += digit * digit;

            }

            n = sum;

            if(n == 1) return true;

            if(set.contains(n)) return false;
            set.add(n);



        }


        return false;
    }
}