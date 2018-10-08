import java.util.*;
public class dequefx
{
    public static void main (String args[])
    {
        Deque <String> deque=new LinkedList<String>();
        deque.add("element 1 (tail)");
        deque.addFirst("element 2 (head)");
        deque.addLast("element 3 (tail)");
        deque.push("element 4 (head)");
        deque.offer("element 5 (tail)");
        deque.offerFirst("element 6 (head)");
        deque.offerLast("element 7(tail)");
        System.out.println("deque elements " + deque);
        Iterator itr=deque.descendingIterator();
        System.out.println("reversed iterator");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("peek " + deque.peek());
        System.out.println("new deque " + deque);
        System.out.println("pop" + deque.pop());
        System.out.println("new deque " + deque);
        System.out.println(deque.contains("element 2(head)"));
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}