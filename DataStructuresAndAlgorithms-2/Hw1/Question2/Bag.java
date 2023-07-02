package Soru2;
import java.util.Iterator;
import java.util.*;

 @SuppressWarnings("unchecked") //??

public class Bag<Item> implements Iterable<Item> {
  

  private static class Node<Item> {
      private Item item;
      private Node<Item> next;
  }
  

  private Node<Item> first; 
  private int n; 

  // constructor
  public Bag() {

      first = null;
      n = 0;
  }

  // is it empty??
  public boolean isEmpty() {
      return first == null;
  }

  public int size() {
      return n;
  }

  // add item.
  public void add(Item item) {
      //new node created.
      Node<Item> oldfirst = first;
      first = new Node<Item>();
      first.item = item;
      first.next = oldfirst;
      n++;
  }

  // iterate over items 
  public Iterator<Item> iterator() {
      return new ListIterator<Item>(first);
  }

  private class ListIterator<Item> implements Iterator<Item> {
      private Node<Item> current;

     
      public ListIterator(Node<Item> first) {
          current = first;
      }

      //  checking that is there a next item 
      public boolean hasNext() {
          return current != null;
      }

   
      public void remove() {
          throw new UnsupportedOperationException();
      }

      //get next item
      public Item next() {
          if (!hasNext()) throw new NoSuchElementException();
          Item item = current.item;
          current = current.next;
          return item;
      }
  }
}