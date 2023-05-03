public class SubSetCreation {
    public static void subSet(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        //recursion case
        subSet(str, ans + str.charAt(i),i+1);
        subSet(str, ans, i+1);
    }
    public static void main(String[] args){
        String str= "abc";
        subSet(str, "", 0);
    }
}
