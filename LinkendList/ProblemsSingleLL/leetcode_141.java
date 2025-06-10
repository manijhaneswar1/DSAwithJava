package ProblemsSingleLL;

import java.util.HashSet;
import java.util.Set;

public class leetcode_141 {
    public static void main(String[] args) {
        NodeDefinition node = new NodeDefinition(3,new NodeDefinition(2, new NodeDefinition(0,new NodeDefinition(-4))));
        hasCycle(node);
        System.out.println(hasCycle(node));
    }
    public static boolean hasCycle(NodeDefinition head) {
        Set<NodeDefinition> map = new HashSet<>();
        while( head != null ) {
            if( map.contains(head)) return true;
            map.add(head);
            head = head.next;
        }
        return false;
    }
}
