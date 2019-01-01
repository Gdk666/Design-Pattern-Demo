package CompositePatternDemo;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<File>();
    }

    @Override
    public void dispaly() {
        for (File file:files){
            file.dispaly();
        }
    }

    public void add(File f){
        files.add(f);
    }

    public void remove(File f){
        files.remove(f);
    }
}
