package greedy_algo.lemonade_change;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0;
        int b=0;
        int c=0;
        for (int i=0;i<bills.length;i++){
            if(bills[i]==5){
                a++;
            }
            else if(bills[i]==10){
                if(a>0){
                    a--;
                    b++;
                }
                else{
                    return false;
                }
            }
            else{
                if(b>0 && a>0){
                    b--;
                    a--;
                    c++;
                }
                else if(a>=3){
                    a-=3;
                    c++;
                }
                else{
                    return false;
                }
            }

        }
        return true;
    }
}