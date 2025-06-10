package ProblemsSingleLL;

public class mergeSortedList {
    public static void main(String[] args) {
        NodeDefinition l1 = new NodeDefinition(1,new NodeDefinition(3,new NodeDefinition(5)));
        NodeDefinition l2 = new NodeDefinition(1,new NodeDefinition(2, new NodeDefinition(9,new NodeDefinition(14))));
        System.out.println(merge(l1, l2));
    }
    public static NodeDefinition merge(NodeDefinition list1, NodeDefinition list2){
        NodeDefinition dummy = new NodeDefinition();
        NodeDefinition curr = dummy;

        while(list1 != null && list2 != null ){
            if( list1.data < list2.data ){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = ( list1 != null ) ? list1 : list2;

        return dummy.next;
    }
}
