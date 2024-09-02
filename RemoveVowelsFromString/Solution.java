package RemoveVowelsFromString;

class Solution {
    public String removeVowels(String s) {

        StringBuilder res = new StringBuilder();

        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                i++;
            }
            else{
                res.append(s.charAt(i));
                i++;
            }
        }

        return res.toString();

    }
}