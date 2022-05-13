public class Node<E> {
  private E value;
  private Node next;

  public Node (E v, Node n) {
    value=v;
    next=n;
  }

  public E getValue() {return value;}
  public void setValue(E v) {value = v;}
  public Node getNext() {return next;}
  public void setNext(Node n) {next = n;}
}