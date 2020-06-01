package newcoder;

import newcoder.entity.ArrayQueue;
import newcoder.entity.ListNode;
import newcoder.entity.MyLinkedList;

public class Main {

    public static void main(String[] args) {

        //  4,3,[1,2,3,4],[2,2,4]
        //System.out.println(water.solve(4, 3, new int[]{1, 2, 3, 4}, new int[]{2, 2, 4}));

        /**
         * 单链表排序
         */
//        MyLinkedList linkedList = new MyLinkedList();
//        linkedList.appent(8);
//        linkedList.appent(2);
//        linkedList.appent(5);
//        linkedList.appent(81);
//        linkedList.appent(18);
//        linkedList.appent(52);
//        linkedList.appent(33);
//        linkedList.appent(24);
//        linkedList.appent(66);
//        ListNode resNode = SingleListNodeSort.sortList(linkedList.getHead());
//
//        while (resNode != null) {
//            System.out.println(resNode.getVal());
//            resNode = resNode.getNext();
//        }




    }

/**
 * stack 测试
 */
//    public static void main(String[] args) {
//        String tmp;
//        ArrayStack<String> astack = new ArrayStack<String>(String.class);
//
//        // 将10, 20, 30 依次推入栈中
//        astack.push("10");
//        astack.push("20");
//        astack.push("30");
//
//        // 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
//        tmp = astack.pop();
//        System.out.println("tmp=" + tmp);
//
//        // 只将“栈顶”赋值给tmp，不删除该元素.
//        tmp = astack.peek();
//        System.out.println("tmp=" + tmp);
//
//        astack.push("40");
//        astack.PrintArrayStack();    // 打印栈
//    }


/**
 * queue 测试
 */
//public static void main(String[] args) {
//    int tmp = 0;
//    ArrayQueue astack = new ArrayQueue(12);
//
//    // 将10, 20, 30 依次推入栈中
//    astack.add(10);
//    astack.add(20);
//    astack.add(30);
//
//    // 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
//    tmp = astack.pop();
//    System.out.printf("tmp=%d\n", tmp);
//
//    // 只将“栈顶”赋值给tmp，不删除该元素.
//    tmp = astack.front();
//    System.out.printf("tmp=%d\n", tmp);
//
//    astack.add(40);
//
//    System.out.printf("isEmpty()=%b\n", astack.isEmpty());
//    System.out.printf("size()=%d\n", astack.size());
//    while (!astack.isEmpty()) {
//        System.out.printf("size()=%d\n", astack.pop());
//    }
//}
}
