import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < 5; i++) {
            queue.offer(i + 10);
        }
        System.out.println("Size -> " + queue.size() + " Top -> " + queue.peek());
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
