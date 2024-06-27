// package GreedyAlgo;
// import java.util.ArrayList;
// import java.util.Collections;

// public class JobSeqn {
//     static class job {
//         int deadline;
//         int profit;
//         int id;// 0 1 2 3
//         public job (int i,int p,int d){
//             this.id=i;
//             this.profit=p;
//             this.deadline=d;
//         }
//     }
//     public static void main(String[] args) {
//         int JobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
//         ArrayList<job>jobs=new ArrayList<>();
//          for(int i=0;i<JobsInfo.length;i++){
//             jobs.add(new job(i,JobsInfo[i][1],JobsInfo[i][0]));
//          }
//          Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);// REMBER FOR SORTING IN DESENDING ORDER
//          ArrayList<Integer>seq=new ArrayList<>();
//          int time=0;
//          for(int i=0;i<jobs.size();i++){
//             job curr=jobs.get(i);
//             if(curr.deadline>time){
//                 seq.add(curr.id);
//                 time++;
//             }
//          }
//          System.out.println("Max jobs can be done="+seq.size());
//          for(int i=0;i<seq.size();i++){
//             System.out.print(seq.get(i)+" ");
//          }
//     } 
// }
