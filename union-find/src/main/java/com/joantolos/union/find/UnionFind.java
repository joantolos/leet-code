package com.joantolos.union.find;

import java.util.*;
import java.util.stream.Collectors;

public class UnionFind {
    private final int[] id;

    // Initialize union-find data structure with N objects (0 to N-1)
    public UnionFind(Integer n) {
        this.id = new int[n];
        for (int i = 0; i < n; i++){
            this.id[i] = i;
        }
    }

    // add connection between p and q
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    // are p and q in the same component?
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    // number of components
    public int count() {
        return Arrays.stream(id).boxed().collect(Collectors.toSet()).size();
    }
}
