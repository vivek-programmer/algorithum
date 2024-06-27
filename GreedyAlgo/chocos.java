// package GreedyAlgo;

// import java.util.Arrays;
// import java.util.Collections;

// public class chocos {
//     public static void main(String[] args) {
//         int n=4,m=6;
//         Integer costVer[]={2,1,3,1,4};
//         Integer costHor[]={4,1,2};
         
//         Arrays.sort(costHor,Collections.reverseOrder());
//         Arrays.sort(costVer,Collections.reverseOrder());

//         int v=0;
//         int h=0;
//         int hp=1;
//         int vp=1;
//         int cost=0;

//         while(h<costHor.length&&v<costVer.length){
//             if(costHor[h]>=costVer[v]){
//                 cost+=(costHor[h]*vp);
//                 hp++;
//                 h++;
//             }else {
//                 cost+=(costVer[v]*hp);
//                 vp++;
//                 v++;
//             }
//         }
//         while(h<costHor.length){
//             cost+=(costHor[h]*vp);
//             hp++;
//             h++;
//         }
//         while(v<costVer.length){
//             cost+=(costVer[v]*hp);
//             vp++;
//             v++;
//         }
//         System.out.println("Min cost of cuts ="+cost);
//     }
// }
