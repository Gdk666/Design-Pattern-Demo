package CompositePatternDemo;
//组合模式
public class main {
    public static void main(String[] args) {
        Folder f = new Folder("big file");
        TextFile at = new TextFile("at");
        f.add(at);
        ImageFile ai = new ImageFile("ai");
        f.add(ai);
        f.dispaly();
        f.remove(ai);
        f.dispaly();
    }
}
