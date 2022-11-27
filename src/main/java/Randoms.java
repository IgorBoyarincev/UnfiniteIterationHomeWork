import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{
    private int min;
    private int max;
    public Randoms(int min,int max){
        this.min=min;
        this.max=max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
            Random random=new Random();
            @Override
            public boolean hasNext() {
                return max>min;
            }

            @Override
            public Integer next() {
                return min+random.nextInt(max-min);
            }
        };
    }
}
