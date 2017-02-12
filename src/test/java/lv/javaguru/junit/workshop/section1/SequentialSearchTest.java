package lv.javaguru.junit.workshop.section1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xh on 12.02.2017.
 */

public class SequentialSearchTest {

    private  SequentialSearch sequensialSearch;
    @Before
    public void setUp() {
        sequensialSearch = new SequentialSearch();

    }

    @Test
    public void checkIsFindsCorrectIndexInSortedArray() {
        int[] elementArray = {1, 2, 3, 4, 5, 6, 7};
        int key = 3;
        int position = sequensialSearch.search(elementArray, key);
        assertThat(position, is(2));
    }

    @Test
    public void checkIsFindsCorrectIndexInUnsortedArray() {
        int[] elementArray = {13, 2, 3, 5, 5, 6, 9};
        int key = 9;
        int position = sequensialSearch.search(elementArray, key);
        assertThat(position, is(6));
    }

    @Test
    public void checkItFindsFirstElement() {
        int[] elementArray = {1, 1, 1, 5, 5, 6, 9};
        int key = 1;
        int position = sequensialSearch.search(elementArray, key);
        assertThat(position, is(0));
    }

}