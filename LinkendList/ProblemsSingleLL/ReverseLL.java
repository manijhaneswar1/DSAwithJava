package ProblemsSingleLL;

public class ReverseLL {
    public static void main(String[] args) {
        NodeDefinition ll = new NodeDefinition(1,new NodeDefinition(2, new NodeDefinition(3, new NodeDefinition(4, new NodeDefinition(5)))));
        System.out.println("Before Reversal :- ");
        System.out.println(ll);
        System.out.println("After Reversal :- ");
        System.out.println(reversal(ll));
        System.out.println(reversalRec(ll));
    }
    public static NodeDefinition reversal(NodeDefinition head){
        if( head == null ) return null;

        NodeDefinition prev = null;
        NodeDefinition curr = head;

        while( curr != null ){
            NodeDefinition nextNode = curr.next;

            curr.next = prev;
            prev = curr;

            curr = nextNode;
        }
        return prev;
    }
    // recursive
    public static NodeDefinition reversalRec(NodeDefinition head) {
        if (head == null || head.next == null) {
            return head;
        }

        NodeDefinition rest = reversalRec(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }
}
