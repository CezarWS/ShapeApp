package arrayList;

public interface MyList {
    int get(int index);

    void put(int index, int value);

    int length();

    boolean contains(int value);

    void addAll(MyList other);
}
