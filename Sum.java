public class Sum {
    public int Add(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        //int a, b;
        Sum s = new Sum();
        int add =  s.Add(3, 4);
        System.out.println(add);
    }
}
