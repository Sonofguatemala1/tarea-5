public interface Istack<E> 
{

   public void push(E item);
   public E pop();
   public E peek();    
   public int size();
}