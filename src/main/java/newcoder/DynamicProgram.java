package newcoder;

import java.util.Iterator;
import java.util.Set;

//题目描述
//        给定一个字符串s和一组单词dict，判断s是否可以用空格分割成一个单词序列，
//        使得单词序列中所有的单词都是dict中的单词（序列可以包含一个或多个单词）。
//例如:
//        给定s=“leetcode”；
//        dict=["leet", "code"].
//        返回true，因为"leetcode"可以被分割成"leet code".

public class DynamicProgram {

    /**
     * @param s
     * @param dict
     * @return
     */
//    public static boolean wordBreak(String s, Set<String> dict) {
//
//        Iterator<String> iterator = dict.iterator();
//
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            int idx = s.indexOf(str);
//            int len = str.length();
//            while (idx != -1) {
//                //s = s.substring(idx, idx + len);
////                if (idx + len >= s.length()) {
////                    s = s.substring(0, idx);
////                } else if (idx == 0) {
////                    s = s.substring(idx + len, s.length());
////                } else {
////                    s = s.substring(0, idx) + s.substring(idx + len);
////                }
//                s = s.substring(0, idx) + s.substring(idx + len);
//                idx = s.indexOf(str);
//            }
//        }
//
//        return s.length() == 0;
//    }

    /**
     * 动态规划
     * 基本思想是将待求解问题分解成若干个子问题，先求解子问题，然后从这些子问题的解得到原问题的解（类似--分治法）
     * 经分解得到子问题往往不是互相独立的
     * 不管该子问题以后是否被用到，只要它被计算过，就将其结果填入表中。这就是动态规划法的基本思路
     *
     * @param s
     * @param dict
     * @return
     */
    public boolean wordBreak(String s, Set<String> dict) {
        if (s == null || s.length() == 0 || dict == null || dict.size() == 0) {
            return false;
        }
        boolean[] flag = new boolean[s.length() + 1];
        flag[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (flag[j] && dict.contains(s.substring(j, i))) {
                    flag[i] = true;
                    break;
                } else {
                    flag[i] = false;
                }
            }
        }
        return flag[s.length()];
    }

}
