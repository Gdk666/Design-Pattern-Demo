package CompositePatternDemo;

public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void dispaly() {
        System.out.println("图像文件："+super.getName());
    }
}
