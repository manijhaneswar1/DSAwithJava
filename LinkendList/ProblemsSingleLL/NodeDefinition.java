package ProblemsSingleLL;

public class NodeDefinition {
        int data;
        NodeDefinition next;

        public NodeDefinition(int data) {
            this.data = data;
        }

        public NodeDefinition(int data, NodeDefinition next) {
            this.data = data;
            this.next = next;
        }

        public NodeDefinition() {

        }

    @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            NodeDefinition current = this;
            while (current != null) {
                sb.append(current.data);
                if (current.next != null) {
                    sb.append(" -> ");
                }
                current = current.next;
            }
            return sb.toString();
        }
}
