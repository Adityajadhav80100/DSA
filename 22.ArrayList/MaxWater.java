import java.util.ArrayList;

public class MaxWater {

    // Pair sum :- Two pointer approach O(n)

    public static boolean PairSumPointer(ArrayList<Integer> List, int target) {
        int Lp = 0;
        int Rp = List.size() - 1;

        while (Lp < Rp) {
            if (List.get(Lp) + List.get(Rp) == target) {
                return true;
            } else if (List.get(Lp) + List.get(Rp) < target) {
                Lp++;
            } else {
                Rp--;
            }
        }
        return false;
    }

    // Pair sum O(n^2)
    public static int PairSum(ArrayList<Integer> List, int target) {
        for (int i = 0; i < List.size(); i++) {
            for (int j = i + 1; j < List.size(); j++) {
                if (List.get(i) + List.get(j) == target) {
                    return 1;
                }
            }
        }
        return 0;
    }

    // TwoPointer Approuch O(n);
    public static int MaxWaterStoredPointer(ArrayList<Integer> Height) {
        int Maxwater = 0;
        int Lp = 0;
        int Rp = Height.size() - 1;

        // Update Pointer

        while (Lp < Rp) {
            // Calculate area
            int ht = Math.min(Height.get(Lp), Height.get(Rp));
            int Width = Rp - Lp;
            Maxwater = Math.max(ht * Width, Maxwater);
            if (Height.get(Lp) < Height.get(Rp)) {
                Lp++;
            } else {
                Rp--;
            }

        }
        return Maxwater;

    }

    // Bruteforce approuchh

    public static int MaxWaterStored(ArrayList<Integer> Height) {
        int Maxwater = 0;
        // Bruteforce O(n^2)
        for (int i = 0; i < Height.size(); i++) {
            for (int j = i + 1; j < Height.size(); j++) {
                int ht = Math.min(Height.get(i), Height.get(j));
                int Width = j - i;
                Maxwater = Math.max(ht * Width, Maxwater);
            }
        }
        return Maxwater;
    }


    // Pairsume for Rotated array O(n)
  public static boolean PairSumRotated(ArrayList<Integer> List, int target) {
    int BreakingPoint = -1;
    int n = List.size();

    // Finding BreakingPoint (Pivot) where order breaks: List.get(i) > List.get(i+1)
    for (int i = 0; i < n - 1; i++) {
        if (List.get(i) > List.get(i + 1)) {
            BreakingPoint = i;
            break;
        }
    }

    // If array is not rotated (sorted normally)
    if (BreakingPoint == -1) {
        BreakingPoint = n - 1;
    }

    int Lp = (BreakingPoint + 1) % n; // smallest element (uses modulo to avoid IndexOutOfBounds)
    int Rp = BreakingPoint;          // largest element

    // Two-pointer traversal using modular arithmetic
    while (Lp != Rp) {
        int sum = List.get(Lp) + List.get(Rp);

        if (sum == target) {
            return true;
        } else if (sum < target) {
            Lp = (Lp + 1) % n; // move smallest pointer forward
        } else {
            Rp = (n + Rp - 1) % n; // move largest pointer backward
        }
    }

    return false;
}

    public static void main(String args[]) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        System.out.println(MaxWaterStored(Height));
        System.out.println(MaxWaterStoredPointer(Height));

        // Pair sum
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        List.add(7);
        int target = 5;
        System.out.println(PairSum(List, target));
        System.out.println(PairSumPointer(List, target));

        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(11);
        List1.add(15);
        List1.add(6);
        List1.add(7);
        List1.add(8);
        List1.add(9);
        List1.add(10);
        int target1 = 16;
        System.out.println(PairSumRotated(List1, target1));

    }
}