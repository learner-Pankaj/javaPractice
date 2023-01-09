public class CmdLineArg {
    public static void main(String[] args) {
        System.out.println("\nSingle argument : "+args[0]+"\n"); // single argument
        
            for(int i=0; i<args.length; i++)    //multiple argument
                System.out.println("Multiple argument : "+args[i]+"\n");
        
    }
}
