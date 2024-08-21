package PassThePillow;

class Solution {
    public int passThePillow(int n, int time) {

        int t = 0;
        int idx = 1;
        int dir = 1;

        while(t != time){

            if(dir == 1) idx++;
            if(dir == -1) idx--;

            if(dir == 1 && idx == n) dir = -1;
            if(dir == -1 && idx == 1) dir = 1;

            t++;

        }

        return idx;

    }
}