public class ReverseStr {
    
    public static void main(String[] args) {
        String s = "123";
        String revers = "";
        int l = s.length();
        char ch;
        for(int i=0; i<l; i++){
            ch = s.charAt(i);
            revers = ch+revers;
        }
        System.out.println(revers);
    }
}
