package com.bmcampbell.firstproject;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class viewDirectionsTest {

    //New instantiation of the activity class so that the function that's being tested can be accessed
    public viewDirections newViewDirections = new viewDirections();

    @Test
    public void revFunc(){

        //Fill a test array with an input
        ArrayList<String> input = new ArrayList<>();
        input.add("Left");
        input.add("Straight");
        input.add("Right");

        //Fill an expected results array with the result that is expected
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Right");
        expected.add("Straight");
        expected.add("Left");

        //Output == the function being tested with test input being passed in
        ArrayList<String> output = newViewDirections.revFunc(input);

        //Determines if the expected output is equivalent to the actual output
        assertEquals(output, expected);

    }

    @Test
    public void revDirections() {

        //Fill a test array with an input
        ArrayList<String> input = new ArrayList<>();
        input.add("Left");
        input.add("Straight");
        input.add("Right");
        input.add("Right");

        //Fill an expected results array with the result that is expected
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Right");
        expected.add("Straight");
        expected.add("Left");
        expected.add("Left");

        //Output == the function being tested with test input being passed in
        ArrayList<String> output = newViewDirections.revDirections(input);

        //Determines if the expected output is equivalent to the actual output
        assertEquals(output, expected);

    }
}