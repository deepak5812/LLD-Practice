package Patterns.Immutable;

import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass {


    private final String name;
    private final List<String> nameList;

    public MyImmutableClass(String name, List<String> nameList) {
        this.name = name;
        this.nameList = nameList;
    }

    public String getName() {
        return name;
    }

    public List<String> getNameList() {
        return new ArrayList<>(nameList);
    }
}
