package ProblemsSingleLL;

import org.w3c.dom.Node;

public class findCycle {
    public static void main(String[] args) {
        NodeDefinition ll = new NodeDefinition(1, new NodeDefinition(2,new NodeDefinition(4, new NodeDefinition(9,new NodeDefinition(10,new NodeDefinition(4))))));
        System.out.println(hasCycle(ll));
        System.out.println(lenOfCycle(ll));
    }

    public static boolean hasCycle(NodeDefinition head){
        NodeDefinition slow = head;
        NodeDefinition fast = head;

        while( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }

    // Find Length of cycle
    public static int lenOfCycle(NodeDefinition head){
        NodeDefinition slow = head;
        NodeDefinition fast = head;

        while( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                NodeDefinition temp = slow;
                int len = 0;
                while( temp != fast ){
                    temp = temp.next;
                    len++;
                }
                return len;
            };
        }
        return -1;
    }

    // Detect the Cycle and return the node where the cycle begins

}
