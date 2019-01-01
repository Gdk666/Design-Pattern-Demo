package SingletonDemo;

//枚举 单例模式
public enum MyObject {
    INSTANCE;
    MyObject() {
        System.out.print("先调用我");
    }
    public void hello(){
        System.out.print("123");
    }
}
