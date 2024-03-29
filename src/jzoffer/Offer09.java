package jzoffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description
 * @Author lww
 * @Date 2022/6/1 12:03
 */
public class Offer09 {
}

class CQueue {

    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else if (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else {
            return -1;
        }
    }
}

