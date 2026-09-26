import java.util.ArrayList;
import java.util.*;

public class arrayList {
    public static void Swap(ArrayList<Integer> List, int idx1, int idx2){
       int temp = List.get(idx1);
       List.set(idx1, List.get(idx2));
       List.set(idx2,List.get(temp));
    }
    public static void main(String args[]){





        ArrayList<Integer> List = new ArrayList<>();
        
        // opration
        // 1.add  O(1)
        List.add(5);
        List.add(6);
        List.add(3);
        List.add(8);
        List.add(7);
        List.add(15);
        List.add(1,11); //O(n);
        // System.out.println(List);
        
        // // 2.get O(1);
        // System.out.println(List.get(2));
        
        // //3.Delete O(n)
        // List.remove(3);
        // System.out.println(List);
        
        // // 4.Set O(n)
        // List.set(3,10);
        // System.out.println(List);
        
        // //5.contains
        // System.out.println(List.contains(2));    
        // System.out.println(List.contains(10));    
        
        
        // //6.Size
        // System.out.println(List.size());
        // // Print List by using size
        // for(int i=0; i<List.size(); i++){
            //     System.out.print(List.get(i)+" ");
            // }
            //  System.out.println();
            
            // // Print in reversre O(n)
            // for(int i=List.size()-1; i>=0; i--){
                //     System.out.print(List.get(i)+" "  );
                // }
                // System.out.println();
                
                // // Maximum elements in array
                // int max = Integer.MIN_VALUE;
                // for(int i=0; i<List.size(); i++){
                    //     // if(max < List.get(i)){
                        //     //     max = List.get(i);
                        //     // }
                        //     max = Math.max(max, List.get(i));
                        // }
                        // System.out.println(max);
                        
                        // // Swap 
                        // int idx1=2;
                        // int idx2=3;
                        // System.out.println(List);
                        // Swap(List,idx1,idx2);
                        // System.out.println(List);
                        
                        
                        // //    Sortting
                        // Collections.sort(List);
                        // System.out.println(List);
                        // // Reverse
                        // Collections.sort(List, Collections.reverseOrder());
                        // System.out.println(List);
                        
                        

                        // Multidiamentional
                        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); 
                        ArrayList<Integer> List1 = new  ArrayList<>();
                        ArrayList<Integer> List2 = new ArrayList<>();
                        ArrayList<Integer> List3 = new ArrayList<>();
                        
                        // Forr loop for Adding element in each lists
                        for(int i=1; i<=5; i++){
                            List1.add(i*1);
                            List2.add(i*2);
                            List3.add(i*3);
                        }

                        mainList.add(List1);
                        mainList.add(List2);
                        mainList.add(List3);
                        
                        System.out.println(mainList);

                        // Nested loop for each list print
                        for(int i=0; i<mainList.size(); i++){
                            ArrayList<Integer> currList= mainList.get(i);
                            for(int j=0; j<currList.size(); j++){
                                System.out.print(currList.get(j)+" ");
                            }
                            System.out.println();
                        }
                        
                    }
                }
                