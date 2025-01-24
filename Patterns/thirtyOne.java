public class thirtyOne {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i < 2*n; i++) {
            for (int j = 1; j < 2*n ; j++) {
                int num=Math.min(Math.min(i,j),Math.min(n*2-i,n*2-j));
                System.out.print(num);
            }
            System.out.println();
        }
    }
}

/*
     4 4 4 4 4 4 4
     4 3 3 3 3 3 4
     4 3 2 2 2 3 4
     4 3 2 1 2 3 4
     4 3 2 2 2 3 4
     4 3 3 3 3 3 4
     4 4 4 4 4 4 4
 */
