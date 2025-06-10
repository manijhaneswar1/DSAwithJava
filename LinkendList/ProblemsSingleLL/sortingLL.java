package ProblemsSingleLL;


import static java.util.Collections.swap;

public class sortingLL {
    public static void main(String[] args) {
        NodeDefinition ll = new NodeDefinition(4, new NodeDefinition(2,new NodeDefinition(1,new NodeDefinition(3))));
        System.out.println(sort(ll));
    }
    // using bubble sort
    public static NodeDefinition sort(NodeDefinition head) {
        if (head == null || head.next == null) return head;

        NodeDefinition current;
        boolean swapped;
        do {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        return head;
    }

}
