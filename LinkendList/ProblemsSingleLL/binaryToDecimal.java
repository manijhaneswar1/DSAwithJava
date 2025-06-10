package ProblemsSingleLL;

public class binaryToDecimal {
    public static void main(String[] args) {
        NodeDefinition node = new NodeDefinition(1, new NodeDefinition(0, new NodeDefinition(1)));
        System.out.println(getDecimalValue(node));
    }
    public static int getDecimalValue(NodeDefinition head) {
        StringBuilder s = new StringBuilder();
        if( head == null) return 0;
        while( head != null){
            s.append(head.data);
            head = head.next;
        }
        return helper(s.toString());
    }
    public static int helper(String s){
        int res = 0;
        for( int i = 0 ; i < s.length(); i++){
            res = res * 2 + (s.charAt(i) - '0');
        }
        return res ;
    }
}
