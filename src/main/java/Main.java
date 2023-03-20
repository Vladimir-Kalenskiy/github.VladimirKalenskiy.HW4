import GBLinkedList.impl.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> linkedLists = new GBLinkedList<>(1);
        linkedLists.addFirst(100);
        linkedLists.addLast(200);
        linkedLists.addLast(300);

        System.out.println(linkedLists);
        System.out.println("Size = " + linkedLists.size());
        System.out.println(linkedLists.get(1));
    }
}