package ProblemsSingleLL;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class isPalindrome {
    public static void main(String[] args) {
        NodeDefinition List = new NodeDefinition(1, new NodeDefinition(2, new NodeDefinition(2, new NodeDefinition(1))));
        NodeDefinition List2 = new NodeDefinition(12,new NodeDefinition(2, new NodeDefinition(4, new NodeDefinition(22))));
        System.out.println("Linked List: " + List);
        System.out.println("Is Palindrome ? " + check(List));
        System.out.println(List2);
        System.out.println(check(List2));
    }

    public static boolean check(NodeDefinition head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.data);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!Objects.equals(list.get(left), list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // need to write the logic based on LinkedList not by using inBuilt List<Integer> to check if the given list is palindrome?


}
