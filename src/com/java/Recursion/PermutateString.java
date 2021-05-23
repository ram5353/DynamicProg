package com.java.Recursion;

import java.util.HashSet;
import java.util.Set;

//All permutations of a given string
public class PermutateString {
    public static void main(String[] args) {
        Permutations obj = new Permutations();
        obj.printStringPermutations("abcc", 0,3);
    }
}

class Permutations {
    static Set<String> set = new HashSet<>();

    public void printStringPermutations(String a, int l, int r) {
        if (l == r) {
            if (set.contains(a)) return;
            set.add(a);
            System.out.println(a);
            return;
        }
        for (int i = l; i <=r; i++) {
            a = interchangeChar(a, l, i);
            printStringPermutations(a, l+1, r);
            a = interchangeChar(a, l, i);
        }
    }

    public String interchangeChar(String s, int l, int i) {
        char[] array = s.toCharArray();
        char tem = array[l];
        array[l] = array[i];
        array[i] = tem;
        return String.valueOf(array);
    }
}
