package com.csc;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {

  Zipper zipper;

  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }

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

  /**@Test 
  public void testHashMap() {
    List<String> strList = List.of("White", "Purple", "Blue");
    List<Integer> intList = List.of(1, 2);
    assertEquals("Lists must be same size!", zipper.hashmapify(strList, intList));
  }*/

  @Test 
  public void testHashMapWorks() {
    List<String> strList = List.of("White", "Purple");
    List<Integer> intList = List.of(1, 2);
    HashMap<String, Integer> map = new HashMap<>();
    map.put("White", 1);
    map.put("Purple", 2);

    assertEquals(map, zipper.hashmapify(strList, intList));
  }

  @Test 
  public void testHashMapDifferentType() {
    List<String> strList = List.of("White", "Purple");
    List<Double> dubList = List.of(1.3, 2.3);
    HashMap<String, Double> map = new HashMap<>();
    map.put("White", 1.3);
    map.put("Purple", 2.3);

    assertEquals(map, zipper.hashmapify(strList, dubList));
  }

  @Test 
  public void testHashMapStringType() {
    List<String> strList = List.of("White", "Purple");
    List<String> strList2 = List.of("Blue", "Gold");
    HashMap<String, String> map = new HashMap<>();
    map.put("White", "Blue");
    map.put("Purple", "Gold");

    assertEquals(map, zipper.hashmapify(strList, strList2));
  }

}
