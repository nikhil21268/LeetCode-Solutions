package HammingDistance;

class Solution {
    public int hammingDistance(int x, int y) {

        int res = 0;

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        int maxFill = Math.max(x, y);
        int trial = 1;
        if(maxFill == x){
            while(Math.pow(2, trial) < x){
                trial++;
            }
            if(Math.pow(2, trial) > x) trial--;
        } else {
            while(Math.pow(2, trial) < y){
                trial++;
            }
            if(Math.pow(2, trial) > y) trial--;
        }

        int numDigits = trial + 1;

        while (x != 0) {

            int remainder = x % 2;
            x = x / 2;
            str1.append(remainder);

        }

        while(str1.length() != numDigits) str1.append(0);

        while (y != 0) {

            int remainder = y % 2;
            y = y / 2;
            str2.append(remainder);

        }

        while(str2.length() != numDigits) str2.append(0);

        System.out.println(str1);
        System.out.println(str2);

        str1.reverse();
        str2.reverse();

        if(str1.length() == Math.min(str1.length(), str2.length())){
            while(str1.length() != str2.length()){
                str1.append(0);
            }
        } else{
            while(str1.length() != str2.length()){
                str2.append(0);
            }
        }

        System.out.println(str1);
        System.out.println(str2);

        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) res++;
        }

        return res;
    }
}
