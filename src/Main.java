import gb_collections.Gblist;
import gb_collections.lists.GbLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gblist<Integer> list = new GbLinkedList<>();
        list.add(1);
        list.add(22);
        list.add(23);
        list.removeByIndex(2);
        System.out.println(list);
    }
}