package com.harshit.streamsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPracticeClass {


    public void performStreamOperations()
    {

        List<List<String>> listOfList = Arrays.asList(

                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        Set<String> intermediateResult = new HashSet<>();
        List<String> result = listOfList.stream().flatMap(List::stream).filter((ele)->ele.startsWith("S")).
                              map(String::toUpperCase).distinct().sorted().peek((ele)->intermediateResult.add(ele)).
                             collect(Collectors.toList());
        result.stream().forEach(System.out::println);

        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );

        String concatedNames=names.stream().reduce("",(partialString,ele)->partialString+" "+ele);
        System.out.println(concatedNames);

        Optional<String> firstName = names.stream().findFirst();
        firstName.ifPresent(System.out::println);




    }


}
