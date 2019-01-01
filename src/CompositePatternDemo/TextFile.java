package CompositePatternDemo;

public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void dispaly() {
        System.out.println("文本文件："+super.getName());
    }
}
