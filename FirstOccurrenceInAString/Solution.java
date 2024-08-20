package FirstOccurrenceInAString;

class Solution {
    public int strStr(String haystack, String needle) {

        char[] bigOne = haystack.toCharArray();
        char[] smallOne = needle.toCharArray();

        int l = 0;
        int r = 0;

        while (l < bigOne.length && r < smallOne.length){

            if(bigOne[l] == smallOne[r]){

                int lStore = l;

                while (l < bigOne.length && r < smallOne.length && bigOne[l] == smallOne[r]){

                    if(r == smallOne.length - 1) return l - smallOne.length + 1;
                    l++;
                    r++;

                }

                r = 0;
                l = lStore + 1;

            }

            else{
                l++;
            }

        }

        return -1;
    }
}
