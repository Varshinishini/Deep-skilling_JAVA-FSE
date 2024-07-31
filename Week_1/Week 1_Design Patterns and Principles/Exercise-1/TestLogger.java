package SingletonPatternExample;

public class TestLogger {
    public static void main(String[] args) {
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();
        System.out.println(l1==l2);//true,since l1 and l2 are pointing to one obj.This is because only one object is created.

    }
    
}
