package SingletonPatternExample;

public class Logger {
    private static Logger l;
    private Logger(){

    }
    public static synchronized Logger getInstance(){
        if(l==null){
            l=new Logger();
        }
        return l;
    }
}
