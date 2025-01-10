public class IpAddress {
    public static void main(String[] args) {
    String address="1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
        //return address.replace(".","[.]");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                ans.append("[.]");
            }else{
                ans.append(address.charAt(i));
            }
        }
        return ans.toString();
    }
}
