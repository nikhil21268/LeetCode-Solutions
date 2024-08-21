package SortedAndRotatedArr;

class Solution {
    public boolean check(int[] nums) {

        if(nums.length == 1) return true;

        int switchCnt = 0;
        int dir = 2;

        for (int i = 1; i < nums.length; i++) {

            int a = nums[i-1];
            int b = nums[i];

            System.out.println(a);
            System.out.println(b);
            System.out.println();

            if(dir == 2){

                if(b > a) dir = 1;
                else if(b < a) dir = -1;
                else dir = 0;
                continue;
            }

            if(dir == 1 && b < a){
                dir = -1;
                switchCnt++;

                if(switchCnt > 1) return false;

            }

            else if(dir == -1 && b > a){
                dir = 1;
                switchCnt++;

                if(switchCnt > 1) return false;

            }

        }

        return true;

    }
}