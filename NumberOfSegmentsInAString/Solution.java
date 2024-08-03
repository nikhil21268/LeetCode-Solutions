package NumberOfSegmentsInAString;

class Solution {
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        String[] strArr = s.split(" ");
        int res = 0;
        for(String str: strArr){
            System.out.println(str);
            if(str != "") res++;
        } return res;
    }
}
