package com.csc;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Zipper {

     public static <T> int listSize(List<T> list1, List<T> list2)
     {
         if(list1.equals(list2) == true) {
             return list1.size();
         } 
         else if(list1.size() > list2.size()) {
             return list2.size();
         }
         else {
             return list1.size();
         }
     }

     public static <T> List<T> zip(List<T> list1, List<T> list2)
     {
         //we modify a new list??
         int size = listSize(list1, list2);
         List<T> mergedList = new ArrayList<>();

         for (int i=0; i < size; i++) {
             mergedList.add(list1.get(i));
             mergedList.add(list2.get(i));
         }

         if(list1.size() > list2.size()){
            for (int i = list2.size(); i < list1.size(); i++) {
                mergedList.add(list1.get(i));
            }
            return mergedList;

         }
         else if (list1.size() < list2.size()) {
            for (int i = list1.size(); i < list2.size(); i++) {
                mergedList.add(list2.get(i));
            }
            return mergedList;

         }
         else {
            return mergedList;
         }
        
     }

    public static <T> HashMap<String, T> hashmapify(List<String> strList, List<T> listT)
    {
        HashMap<String, T> map = new HashMap<>();
        try {
            if(strList.size() != listT.size()){
                throw new IllegalArgumentException();
            }
            else {
                for(int i=0; i<strList.size(); i++) {
                    map.put(strList.get(i), listT.get(i));
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Lists must be same size!");
        }
        return map;

    }


    public static void main (String[] args)
    {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        List<Integer> mergedNumbers = zip(nums1, nums2);
        System.out.println(mergedNumbers); //[1, 2, 3, 4, 5, 6, 7, 8,]

        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
        List<String> mergedWords = zip(colors1, colors2);

        System.out.println(mergedWords); //[Red, White, Green, Black, Blue, Orange, Pink]
        List<String> colors = List.of("White", "Black", "Orange", "Pink");
        List<Integer> nums = List.of(1, 3, 5, 6);

        // This should create {"White" => 1, "Black" => 3, "Orange" => 5, "Pink" => 7}
        HashMap<String, Integer> map = hashmapify(colors, nums);

        List<String> names = List.of("John", "Mike");
        List<Double> doubles = List.of(1.3, 2.3, 3.3);
        HashMap<String, Double> newMap = hashmapify(names, doubles); //should throw exception
    }
}



