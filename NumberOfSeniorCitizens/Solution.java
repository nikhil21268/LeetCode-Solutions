package NumberOfSeniorCitizens;

class Solution {
    public int countSeniors(String[] details) {

        int res = 0;

        for(String s:details){
            if(Integer.parseInt(s.substring(11,13)) > 60) res++;
        }

        return res;

    }
}