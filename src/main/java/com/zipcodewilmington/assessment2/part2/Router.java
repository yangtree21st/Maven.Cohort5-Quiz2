package com.zipcodewilmington.assessment2.part2;

import java.util.TreeMap;

public class Router {

    TreeMap<String, String> router = new TreeMap<>();

    public void add(String path, String controller) {
            router.put(path,controller);
    }

    public Integer size() {
        return router.size();
    }

    public String getController(String path) {
        return router.get(path);
    }

    public void update(String path, String studentController) {
        router.put(path)
    }

    public void remove(String path) {
    }
}
