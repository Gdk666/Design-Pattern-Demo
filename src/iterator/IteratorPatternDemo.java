package iterator;


import java.util.ArrayList;
import java.util.List;
//迭代器模式
public class IteratorPatternDemo {
    public static void main(String[] args)  {
        List list = new ArrayList();
        list.add("");
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
        String name = (String) iterator.next();
        System.out.println(name);
        }

    }

}


