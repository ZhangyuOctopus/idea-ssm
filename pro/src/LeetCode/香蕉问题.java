package LeetCode;
import java.util.Scanner;
public class 香蕉问题 {
    //875:https://leetcode-cn.com/problems/koko-eating-bananas/
    static  int n,  high;
    public static void main(String[] args) {
        int[] piles = new int[10000];
        int k, h;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        h = scanner.nextInt();
        high = (int)Math.pow(10, 9);
        for (int i = 0; i < n; ++i){
            piles[i] = scanner.nextInt();
        }
        int res = minEatingSpeed(piles, h);
        System.out.println(res);
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int mid;
        while (low < high){
            mid = (low + high) / 2;
            if (!solve(piles, mid, h)){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return  low;
    }

    public  static  boolean  solve(int[] piles, int k, int h){
        int times = 0;
        for (int i = 0; i < n; ++i) {
            times += (piles[i] - 1) / k + 1;
        }
        return times <= h;
    }
}