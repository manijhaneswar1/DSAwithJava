public class remove_string {
    public static void main(String[] args) {
        remove_string("Developers never shut down their computers","","their");
    }
    static void remove_string(String str, String ans,String removableStr){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        if(str.startsWith(removableStr)){
           str = str.substring(removableStr.length());
        }else{
            ans += str.substring(0,1);
            str = str.substring(1);
        }
         remove_string(str,ans,removableStr);
    }
}
