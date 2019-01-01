package iterator;

public class NameRepository implements Container {
    public String[] name = {"A","B","C","D"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator{
        private int index;

        @Override
        public boolean hasNext() {
            if (index < name.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return name[index++];
            }
            return null;
        }
    }
}