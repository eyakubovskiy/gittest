package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }



    public void testMy() {

        Object var = Optional.ofNullable(null).orElse("Fire");

        System.out.println((String)var);

        //System.out.println("Print all");
        //System.out.println("Hello world!!!");

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i + " guest");
        }

        List.of("1", "2", "3").stream().filter(x -> x.equals("4")).collect(Collectors.toList());

        int b = 1;
    }
}




//
//
//    public static <T> boolean equalsDto(T first, T second) throws NoSuchFieldException, IllegalAccessException {
//        boolean result = true;
//
//        if (first == second) {
//            return true;
//        }
//
//        if (first == null || second == null) {
//            return false;
//        }
//
//        if (first instanceof String || first instanceof LocalDateTime){
//            result = first.equals(second);
//        } else if (first instanceof List) {
//            int len = ((List) first).size();
//            for (int i = 0; i < len; i++) {
//                result = equalsDto(((List) first).get(i), ((List) second).get(i));
//            }
//        } else {
//            Field[] fields = first.getClass().getDeclaredFields();
//            for (Field field : fields) {
//                field.setAccessible(true);
//                var firstValue = field.get(first);
//                var secondValue = field.get(second);
//                result = equalsDto(firstValue, secondValue);
//                if (result == false) {
//                    return false;
//                }
//            }
//        }
//    }

