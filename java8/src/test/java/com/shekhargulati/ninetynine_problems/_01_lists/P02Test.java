package com.shekhargulati.ninetynine_problems._01_lists;

import org.junit.Test;

import java.util.*;

import static com.shekhargulati.ninetynine_problems._01_lists.CollectionUtils.linkedList;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P02Test {

    @Test
    public void shouldFindSecondLastElementFromAList() throws Exception {
        List<Integer> numbers = asList(1, 2, 11, 4, 5, 8, 10, 6);
        assertThat(P02_MySolution.secondLast(numbers), is(equalTo(10)));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListEmpty() throws Exception {
        P02_MySolution.secondLast(Collections.emptyList());
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListHasSingleElement() throws Exception {
        P02_MySolution.secondLast(Arrays.asList(1));
    }

    @Test
    public void shouldFindSecondLastElementFromALinkedList() throws Exception {
        LinkedList<Integer> numbers = linkedList(1, 2, 11, 4, 5, 8, 10, 6);
        assertThat(P02_MySolution.secondLastRecursion(numbers), is(equalTo(10)));
    }
}