public class ImplementArrayList {
    public static void main(String[] args) {
        CollectionArrayList2<Integer> my_list = new CollectionArrayList2();
        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        System.out.println(my_list.size());         // returns 3
        my_list.remove(1);
        System.out.println(my_list.size());        // returns 2
    }
}
