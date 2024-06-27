package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class prop {
    public static void main(String[] args) {
        Integer curr[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(curr,Comparator.reverseOrder());
        int countOfcoins=0;
        int amount=1059;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<curr.length;i++){
            if(curr[i]<=amount){
                while(curr[i]<=amount){
                    countOfcoins++;
                    ans.add(curr[i]);
                    amount-=curr[i];
                }
            }
        }
        System.out.println("Min coin user="+countOfcoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
