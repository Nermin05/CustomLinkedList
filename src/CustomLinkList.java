import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CustomLinkList<T> {

    public static class CustomNode<T> {
        T data;
        CustomNode<T> previous;
        CustomNode<T> next;

        public CustomNode(T data, CustomNode<T> previous, CustomNode<T> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        public CustomNode() {
        }
    }
    private int size;
    private CustomNode<T>  head;
    private CustomNode<T>  tail;

    public CustomLinkList() {
        this.size = size;
        this.head = head;
        this.tail = tail;
    }
    public int size(){
        return size;
    }
    public void add(T data) {
        addLast(data);
    }
    public void addLast(T data)  {
CustomNode<T> last=tail;
CustomNode<T> newNode=new CustomNode<>(data,last,null);
if(last==null) {
    this.head=newNode;
} else {
    last.next=newNode;
}
this.tail=newNode;

size++;
    }
    public void addFirst(T data)  {
      if(tail==null) {
          head=tail=new CustomNode<>(data,null,null);
      }
      else {
          CustomNode<T> first=head;
          CustomNode<T> newNode=new CustomNode<>(data,null,first);
          newNode.next=head;
          head=newNode;
      }
        size++;
    }
    public T get(int index) {
        if(index<size/2) {
            CustomNode<T> newNode=head;
            for(int i=0;i<index;i++) {
                newNode=newNode.next;
            }
            return newNode.data;

        } else {
            CustomNode<T> newNode=tail;
            for(int i=size-1;i>index;i--) {
                newNode=newNode.previous;
            }
            return newNode.data;

        }
    }
    public T getFirst() {
        CustomNode<T> first=head;
        if(first==null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }
    public T getLast() {
        CustomNode<T> last=tail;
        if(last==null) {
            throw new NoSuchElementException();
        }
        return last.data;
    }
    public CustomNode<T> getNode(int index) {
        if(index<0 || index>=size) {
            throw new IndexOutOfBoundsException();
        }
        CustomNode<T> currentNode=head;
        for(int i=0;i<index;i++) {
            currentNode=currentNode.next;
        }
        return currentNode;
    }
    public T remove(CustomNode<T> node) {
        T data=node.data;
        CustomNode<T> prev=node.previous;
        CustomNode<T> next=node.next;
        if(prev==null) {
            head=next;
        }
        else {
            prev.next=next;
            node.next=null;
        }
        if(next==null){
            tail=prev;
        } else {
            next.previous=prev;
            node.previous=null;
        }
        node.data=null;
        size--;
        return data;
    }
    private boolean isEmpty() {
        return size == 0;
    }
    public void removeFirst() {
if(isEmpty()) {
throw new NoSuchElementException();
}
if(head==tail) {
    head=tail=null;
}
else {
    CustomNode<T> node=head;
    CustomNode<T> next = node.next;
    head=next;
   if(next==null) {
       tail=null;
   }else {
       next.previous=null;
   }
   node.data=null;
   node.next=null;
}
        size--;
    }
    public void removeLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        if(head==tail) {
            head=tail=null;
        }
        else {
            CustomNode<T>  node=tail;
            CustomNode<T> prev=node.previous;
            tail=prev;
            if(prev==null) {
                head=null;
            } else {
                prev.next=null;
            }
            node.data=null;
            node.previous=null;
        }
        size--;
    }
    public void print() {
       CustomNode<T> head=this.head;
       while (head!=null) {
           System.out.print(head.data+" ");
           head=head.next;
       }
        System.out.println();
    }



}

