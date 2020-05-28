package ArrayStatistics;


import common.ScannerDemo;

import java.util.List;
import java.util.Scanner;

/**
 * 描述：
 *
 * @Author wangjun
 * @Date 2020/5/28
 */


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //坑1  前后空格去掉
            String s = scanner.nextLine().trim();
            List<int[]> nums = ScannerDemo.getIntArrayList(s);
            long result = countLR(nums.get(0), nums.get(1));
            System.out.println(result);
        }
    }


    /**
     * 计算有多少对符合条件的数对
     *
     * @param a int整型一维数组 数组a
     * @param b int整型一维数组 数组b
     * @return int整型
     */
    public static int countLR(int[] a, int[] b) {
        // write code here
        int count = 0;
        for (int l = 0; l <= a.length - 1; l++) {
            for (int r = l; r <= a.length - 1; r++) {
                long aSum = 0;
                long bSum = (long) b[l] + b[r];
                for (int idx = l; idx <= r; idx++) {
                    aSum += (long) a[idx];
                }
                if (aSum == bSum) {
                    count++;
                }
            }
        }
        return count;
    }


}
