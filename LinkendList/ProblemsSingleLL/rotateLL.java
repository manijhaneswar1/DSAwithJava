package ProblemsSingleLL;

public class rotateLL {
    public static void main(String[] args) {
        NodeDefinition ll = new NodeDefinition(1,new NodeDefinition(2,new NodeDefinition(3,new NodeDefinition(4,new NodeDefinition(5)))));
        System.out.println(rotateRight(ll, 2));
    }
    public static NodeDefinition rotateRight(NodeDefinition head, int k) {
        if( k <= 0 || head == null || head.next == null ) return head;

        NodeDefinition last = head;
        int len = 1;
        while( last.next != null ){
            last = last.next;
            len++;
        }
        last.next = head;
        int rotations = k % len;
        int skips = len - rotations;
        NodeDefinition newLast = head;
        for( int i = 0; i < skips - 1; i++){
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
