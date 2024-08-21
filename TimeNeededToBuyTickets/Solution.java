package TimeNeededToBuyTickets;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int res = 0;

        while(tickets[k] != 0){
            for (int i = 0; i < tickets.length; i++) {
                if(tickets[i] >= 1){
                    tickets[i] = tickets[i] - 1;
                    res++;
                }
                if(tickets[k] == 0) return res;
            }
        }

        return res;

    }
}