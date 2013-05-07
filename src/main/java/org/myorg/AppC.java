package org.myorg;


/**
 * Hello world!
 *
 */
public class AppC
{
    public static void main( String[] args )
    {
        App.main(null); // call class from a.jar

        AppB.main(null); // call class from b.jar

        System.out.println( "Hello World C!" );
    }
}
