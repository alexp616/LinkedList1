public class LinkedList<E> {
  private Node<E> head;
  private int size = 0;
  
 public LinkedList(){head = null;} //optional

  public boolean isEmpty() {return head == null;} 
 
  public void clear() {head = null; size = 0;}

 public void add(E value) {
    size++;
    if(head == null) 
    {
      head = new Node(value, null);
    }
      
    else
    {
      Node target = head;
      while(target.getNext()!=null)
        {
          target = target.getNext();
        }
      target.setNext(new Node(value, null));
    }
  }

  public int size() {return size;}
}
