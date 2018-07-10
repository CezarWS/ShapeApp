package singleton;

public class Singleton {
    private  static Singleton instance = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }

static  class Test{
    public static void main(String[] args) {
        Singleton instance =  Singleton.getInstance();
        Singleton instance2 =  Singleton.getInstance();
        System.out.println(instance == instance2);
    }

}
}
