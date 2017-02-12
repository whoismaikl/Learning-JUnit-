package lv.javaguru.junit.workshop.section1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xh on 12.02.2017.
 */
public class NumberOverturnTest {
    @Test
    public void invertNumber() throws Exception {
        int i = 123;
        int j = NumberOverturn.invertNumber(i);
        assertThat(j, is(321));
    }


    @Test
    public void ifOneElementPassedThatElementReturns(){

        int i = 0;
        int j = NumberOverturn.invertNumber(i);
        assertThat(j, is(i));


    }



}