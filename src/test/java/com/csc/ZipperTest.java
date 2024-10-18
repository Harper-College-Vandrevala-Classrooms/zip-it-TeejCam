package com.csc;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {

  Zipper zipper;

  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }

  /**@Test
  void itWorks() {
    assertEquals(true, true);
  }*/

  @Test 
  public void testListSize() {
    List<Integer> list1 = List.of(1, 2, 3, 4);
    List<Integer> list2 = List.of(2, 3, 5, 6);
    assertEquals(4, zipper.listSize(list1, list2));
  }

  @Test
  public void testStringListSize() {
    List<String> list1 = List.of("Green", "Blue");
    List<String> list2 = List.of("Black", "White");
    assertEquals(2, zipper.listSize(list1, list2));
  }

  @Test 
  public void testListOneBigger() {
    List<Integer> list1 = List.of(1, 2, 3, 4);
    List<Integer> list2 = List.of(1, 2, 3);
    assertEquals(3, zipper.listSize(list1, list2));
  }

  @Test
  public void testListTwoBigger() {
    List<Character> list1 = List.of('a', 'b', 'c');
    List<Character> list2 = List.of('a', 'b', 'c', 'd');
    assertEquals(3, zipper.listSize(list1, list2));
  }

}
