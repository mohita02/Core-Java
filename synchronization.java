class Q{
    boolean b=false;
    int num;
    public synchronized int get()
    {
        if(!b)
        {
            try{
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
            System.out.println("got : "+num);

            b=false;
            notify();
            return num;
        }
        public synchronized void put(int num)
        {
            if(b)
            {
                try{
                    wait();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            this.num=num;
            b=true;
            System.out.println("put : " + num);
            notify();
        }
}
class Producer implements Runnable{
    Q q;
    public Producer(Q q)
    {
        this.q=q;
        new Thread(this,"Producer").start();
    }
    public void run()
    {
        int i=0;
        while(i<11)
        {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Q q;
    public Consumer(Q q)
    {
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    public void run()
    {
        while(true)
        {
            q.get();
        }
    }
}
public class synchronization{
    public static void main(String args[])
    {
        Q m=new Q();
        new Producer(m);
        new Consumer(m);
    }
}
