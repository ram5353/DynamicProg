package com.java.Recursion;


public class PathsForNxMMatrix {

    public static void main(String[] args) {
        FindPaths obj = new FindPaths();
        System.out.println(obj.findPathsForMatrix(4,4));
        System.out.println(obj.findSum(5));
        System.out.println(obj.findPower(3,4));
    }
}

class FindPaths {

    public int findPathsForMatrix(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return findPathsForMatrix(n, m-1) + findPathsForMatrix(n-1, m);

    }

    public int findSum(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + findSum(number - 1);
        }
    }

    public int findPower(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * findPower(a,b-1);
        }
    }
}
