public class MatchingRule {
    public static void main(String[] args) {
        String[][] list={{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
        System.out.println(countMatches(list,"type","phone"));
    }
    static int countMatches(String[][] list,String ruleKey,String ruleValue){
        int count=0;
        int j =0;
        if(ruleKey.equals("color")){
            j=1;
        }else if(ruleKey.equals("name")){
            j=2;
        }
        for (int i = 0; i < list.length; i++) {
            if(list[i][j].equals(ruleValue)){
             count++;
            }
        }
        return count;
    }
}
