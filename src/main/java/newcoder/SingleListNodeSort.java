package newcoder;

import newcoder.entity.ListNode;


//题目描述
//     在O(n log n)的时间内使用常数级空间复杂度对链表进行排序。
//     Sort a linked list in O(n log n) time using constant space complexity.
//示例1
//    输入
//      {3,2,4}
//    输出
//      {2,3,4}


/**
 * 描述：
 *
 * @Author wangjun
 * @Date 2020/5/29
 */
public class SingleListNodeSort {

    /**
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode sortList(ListNode head) {
        // write code here

        //快慢指针，获取中间节点
        ListNode man = head;
        ListNode quai = head;
        while (quai != null && quai.getNext() != null) {
            quai = quai.getNext().getNext();

        }

        return head;
    }

}
