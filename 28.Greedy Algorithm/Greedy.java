import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Greedy {


    static class Job{
        int id;
        int deadLine;
        int profit;

        public Job(int id, int deadLine, int profit) {
            this.id = id;
            this.deadLine = deadLine;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        ArrayList<Integer> ans = new ArrayList<>(); // stored the index
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time bases sorted
        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum activities: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i) + " ");
        }

        // // end time bases sorted
        // int maxAct=1;
        // ans.add(0);
        // int lastEnd=end[0];
        // for(int i=1;i<end.length;i++){
        // if(start[i]>=lastEnd){
        // maxAct++;
        // ans.add(i);
        // lastEnd=end[i];
        // }
        // }
        // System.out.println("Maximum activities: "+maxAct);
        // for(int i=0; i<ans.size(); i++){
        // System.out.println("A"+ans.get(i) + " ");
        // }

        // 2. Fractional Knapsack Code
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;
        double ratio[][] = new double[val.length][2];
        // oth col is index , 1st col is ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // now sort the ratio array based on 1st col
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }

        }
        System.out.println("Final value we can obtain = " + finalVal);

        // Q. Absolute minimum difference of pairs
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimum difference = " + minDiff);

        // Maximum length chain of pairs.
        int pairs[][] = { { 5, 24 }, { 15, 25 }, { 27, 40 }, { 50, 60 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sort based on 2nd col
        int chain = 1;
        int chainEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chain++;
                chainEnd = pairs[i][1];
            }

        }
        System.out.println("Maximum length of chain = " + chain);





        // Indian coins problem

     Integer Coins[] = { 1, 2, 5, 10, 20, 100, 200, 500, 2000 };
        Arrays.sort(Coins, Comparator.reverseOrder());
        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> Notes = new ArrayList<>();

        for (int i = 0; i < Coins.length; i++) {
            if (Coins[i] <= amount) {
                while (Coins[i] <= amount) {
                    countOfCoins++;
                    Notes.add(Coins[i]);
                    amount -= Coins[i];
                }
            }
        }

        System.out.println("Count of coins;- " + countOfCoins);


        for(int i=0; i<Notes.size(); i++){
            System.out.print(" " + Notes.get(i));
        }






        // Jobs sequence problem
        int jobsInfo[][]= {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs=new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

      Collections.sort(jobs, (obj1,obj2)->obj2.profit-obj1.profit);   //decending order sorting


      int time =0;

       ArrayList<Integer> jobSequence=new ArrayList<>();
       for(int i=0; i<jobs.size(); i++){
           Job currJob=jobs.get(i);
          if(currJob.deadLine>time){
                jobSequence.add(currJob.id);
                time++;
          }
       }

        System.out.println("Job sequence:-");
        for(int i=0; i<jobSequence.size(); i++){
            System.out.print("J"+jobSequence.get(i) + " ");
        }


    }
}