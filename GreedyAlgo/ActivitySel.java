package GreedyAlgo;

import java.util.*;

public class ActivitySel {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int  end[]={2,4,6,7,9,9};
        int maxact=0;
        int arr[][]=new int[start.length][3];
        for (int i=0;i<start.length;i++){
            arr[i][0]=i;
            arr[i][1]=start[i];
            arr[i][2]=end[i];
        }
        Arrays.sort(arr, Comparator.comparingDouble(o-> o[2]));
        ArrayList<Integer> Ans=new ArrayList<>();
        maxact=1;
        Ans.add(arr[0][0]);
        int lastime=arr[0][2];
        for(int i=0;i<end.length;i++){
            if(arr[i][1]>lastime){
                maxact++;
                Ans.add(i);
                lastime=arr[i][2];
            }
        }
        System.out.println("Max activity is ="+maxact);
        for(int i=0;i<Ans.size();i++){
            System.out.print("A"+Ans.get(i)+" ");
        }
    }
}
