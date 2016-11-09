package com.company;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.testng.Assert.fail;

/**
 * Created by arteman on 07.11.16.
 */
public class CarsTest {

    ArrayList<Integer> arr = new ArrayList<>();;

    @BeforeClass
    public static void globalSetUp(){
        System.out.println("Creating database connection");
    }

    @Before
    public void setUp(){
        System.out.println("Setting up the environment");
        //arr = new ArrayList<>();
        //fail("failed");
    }
    @After
    public void close(){
        System.out.println("Wrapping up everything");
    }

    @Test
    public void test1() {
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        Cars car1 = new Cars("Mazda",2012,38);
        Cars car2 = new Cars("BMW",2014,60);
        System.out.println(car1);
        System.out.println(car2);
        if (car2.getPrice() > 70)
            fail("too high price");
        //assertEquals("ABC","ABCD");
    }
    @Test
    public void test2() {
       // ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        Cars car1 = new Cars("Mazda",2012,38);
        Cars car2 = new Cars("BMW",2014,60);
        System.out.println(car1);
        System.out.println(car2);
        if (car2.getPrice() > 70)
            fail("too high price");
        assertEquals("ABC","ABC");
        assertFalse("This test failed","ABC"=="ABCD");
    }

    @Test(expected = NullPointerException.class)
    public void test3() {
        String [] carModel = {};
       // try {
            Arrays.sort(carModel);
       // } catch (NullPointerException e) {
       //     System.out.println("everything is ok, expected error");
        //}
    }

}