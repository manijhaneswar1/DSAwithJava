package ProblemsSingleLL;

public class addTwoNumbers {
    public static void main(String[] args){
        NodeDefinition l1 = new NodeDefinition(1,new NodeDefinition(2,new NodeDefinition(3)));
        NodeDefinition l2 = new NodeDefinition(1,new NodeDefinition(2,new NodeDefinition(3)));

        System.out.println(addTwoLists(l1, l2));

    }
    public static NodeDefinition addTwoLists(NodeDefinition l1, NodeDefinition l2) {
        NodeDefinition dummy = new NodeDefinition();
        NodeDefinition ans = dummy;

        int total = 0;
        int carry = 0;

        while( l1 != null || l2 != null || carry != 0){
            total = carry;

            if( l1 != null ){
                total += l1.data;
                l1 = l1.next;
            }
            if( l2 != null ){
                total += l2.data;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;
            dummy.next = new NodeDefinition(num);
            dummy = dummy.next;
        }
        return ans.next;
    }
//    public static NodeDefinition addTwoNumbers(NodeDefinition l1, NodeDefinition l2) {
//        StringBuilder num1 = new StringBuilder();
//        StringBuilder num2 = new StringBuilder();
//
//        StringBuilder ans = new StringBuilder();
//
//        while( l1 != null && l2 != null ){
//            num1.append(l1.val);
//            num2.append(l2.val);
//
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//
//        num1.reverse();
//        num2.reverse();
//        int n1 = Integer.parseInt(num1.toString());
//        int n2 = Integer.parseInt(num2.toString());
//
//        // adding process of two numbers
//        while( n1 > 0 && n2 > 0 ){
//            int rem1 = n1 % 10;
//            int rem2 = n2 % 10;
//            int carry = 0;
//
//            int a = rem1 + rem2;
//
//            if( a > 9 ){
//                a = a % 10;
//                ans.append(a);
//                carry = a / 10;
//            }else{
//                ans.append( a + carry );
//            }
//
//            n1 /= 10;
//            n2 /= 10;
//        }
//
//        NodeDefinition newHead = null;
//        NodeDefinition tail = null;
//
//        for(char val : ans.toString()){
//            if( newHead == null ){
//                newHead = Integer.parseInt(val);
//                newHead.next = tail;
//            }else{
//                tail = Integer.parseInt(val);
//                tail = tail.next;
//            }
//        }
//
//        return newHead;
//    }
}
