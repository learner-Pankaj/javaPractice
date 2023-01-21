public class FindVowel {
    public static void main(String[] args) {
        String s = "fdsapAvnzecbuovpwaryOIftalfduiihhgicmvb";
        //boolean b = s.toLowerCase().matches(".*[aeiou].*");   //true
        //System.out.println(b);
        int len = s.length();
        char ch;
        for(int i=0; i<len; i++){
            ch = s.toLowerCase().charAt(i);
            if((ch == 'a') || (ch == 'e') || (ch == 'i') ||(ch == 'o') ||(ch == 'u')){
                System.out.print(ch);
            }
        }
    }
}
