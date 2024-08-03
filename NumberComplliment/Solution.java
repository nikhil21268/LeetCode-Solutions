package NumberComplliment;

class Solution {
    public int findComplement(int num) {

        StringBuilder str1 = new StringBuilder();

        while(num != 0){
            int rem = num % 2;
            num = num / 2;
            str1.append(rem);
        }

        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == '0'){
                str1.setCharAt(i, '1');
            } else{
                str1.setCharAt(i, '0');
            }
        }

        str1.reverse();

        int res = 0;
        int idx = 0;
        for(int i = str1.length()-1; i >= 0; i--){
            if(str1.charAt(i) == '1'){
                res += Math.pow(2, idx);
            }
            idx++;
        }

        return res;

    }
}
