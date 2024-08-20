package ValidWordAbbreviation;

class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        int abrIdx = 0;
        int wordIdx = 0;

        while (abrIdx < abbr.length() && wordIdx < word.length()){

            if(Character.isDigit(abbr.charAt(abrIdx))){

                if (abbr.charAt(abrIdx) == '0') return false;

                StringBuilder sb = new StringBuilder();

                while (abrIdx < abbr.length() && Character.isDigit(abbr.charAt(abrIdx))){
                    sb.append(abbr.charAt(abrIdx));
                    abrIdx++;
                }

                int increaseAmt = Integer.parseInt(sb.toString());

                wordIdx += increaseAmt;

            }

            else{

                if(word.charAt(wordIdx) != abbr.charAt(abrIdx)) {
                    return false;
                }
                else{
                    abrIdx++;
                    wordIdx++;
                }

            }

        }

        return wordIdx == word.length() && abrIdx == abbr.length();

    }
}
