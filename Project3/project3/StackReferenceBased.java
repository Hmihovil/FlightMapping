public class StackReferenceBased<E> 
                  implements StackInterface<E> {
  private Node<E> top;

  public StackReferenceBased() {
    top = null; 
  }  // end default constructor
  
  public boolean isEmpty() {
    return top ==  null;
  }  // end isEmpty

  public void push(E newItem) {
    top = new Node<E>(newItem, top);
  }  // end push
  
  public E pop() throws StackException {
    if (!isEmpty()) {
      Node<E> temp = top;
      top = top.getNext();
      return temp.getItem();
    }
    else {
      throw new StackException("StackException on " + "pop: stack empty");
    }  // end if
  }  // end pop
  
  public void popAll() {
    top = null;
  }  // end popAll
  
  public E peek() throws StackException {
    if (!isEmpty()) {
      return top.getItem();
    }
    else {
      throw new StackException("StackException on " + "peek: stack empty");
    }  // end if
  }  // end peek
}  // end StackReferenceBased
