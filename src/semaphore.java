import java.util.*;
import java.util.concurrent.Semaphore;

public class semaphore
{
    private int count = 0;
    public semaphore(int init_val)
    {
        count = init_val;
    }
    public synchronized  void P()
    {
        count = count - 1;
        if ( count < 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized  void v()
    {
        count = count +1;
        if (count <=0 ) notify();
    }
}

