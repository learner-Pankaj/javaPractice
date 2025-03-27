public class StringExample {
    public static void main(String[] args) {
        String a = "Pankaj";
        String b = "yadav";

        String c = a+b;
        System.out.println(c);
        if(c.equals("Pankajyadav")){        //this == will always give you false instead use equals method which will give you exact result in case of string
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
