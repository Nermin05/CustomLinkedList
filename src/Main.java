
public class Main {
    public static void main(String[] args) {
CustomLinkList<Number> customLinkList=new CustomLinkList<>();
customLinkList.add(1);
customLinkList.add(2);
        customLinkList.add(3);
        customLinkList.add(4);
        customLinkList.add(5);
        customLinkList.print();
        customLinkList.addFirst(6);
        customLinkList.addLast(9);
        customLinkList.print();
        System.out.println(customLinkList.getFirst());
        System.out.println(customLinkList.getLast());
        System.out.println(customLinkList.get(3));
customLinkList.removeLast();
            customLinkList.print();
customLinkList.removeFirst();
        customLinkList.print();
        System.out.println(customLinkList.size());
customLinkList.remove(customLinkList.getNode(3));
        customLinkList.print();

    }
}