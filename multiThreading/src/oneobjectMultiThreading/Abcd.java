package oneobjectMultiThreading;

public class Abcd {

static int count;

public synchronized static void add() {
count=count+1;	
}


}
