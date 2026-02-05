import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.HashMap;

public class list {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);

        for (int n : nums) {
            System.out.println(n);
        }

        Collection<Integer> nums2 = new LinkedList<>();
        nums2.add(6);
        nums2.add(5);
        nums2.add(4);
        nums2.add(3);

        for (int n : nums2) {
            System.out.println(n);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        for (int n : set) {
            System.out.println(n);
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (int key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
