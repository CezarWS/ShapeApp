package arrayList;

public class TestArrayList {
    public static void main(String args[]){
        MyList myList1 = new ArrayListImpl() ;
        myList1.put(0,5);
        myList1.put(101,10);


        myList1.get(20);
        myList1.get(500);

    }
}
