package com.example.lambdataste;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in the thread" + this.toString());
            }
        });
        th.run();
        System.out.println( "Hello World! - main thread" );

        Collection<Integer> coll = Arrays.asList(1,2,3,4,5,6) ;
        collectionLambda collmda = new collectionLambda();
        collmda.iterateOverCollection((List<Integer>) coll);
    }
}
