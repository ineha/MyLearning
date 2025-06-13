package Recursion.Bactracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    static List<String> ans;
    public static void main(String[] args) {
        System.out.println(countMaze(3,3));
        getPath("",3,3);
        System.out.println(getPathDiagonal("",3,3));
    }

    public static int countMaze(int r, int c) {
        if(c==1 || r==1){
            return 1;
        }
        int left = countMaze(r-1, c);
        int middle = countMaze(r-1, c-1);
        int right = countMaze(r, c-1);
        return left + middle + right;
    }
    public static void getPath(String p , int r , int c) {
        if(c==1 && r==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
            getPath(p+"D", r-1, c);
        }
        if(c>1){
            getPath(p+"R", r, c-1);
        }

    }

    public static List<String> getPathDiagonal(String p , int r , int c) {
        if(c==1 && r==1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> path = new ArrayList<>();
        if(r>1){
            path.addAll(getPathDiagonal(p+"V", r-1, c));
        }
        if(r>1 && c>1){
            path.addAll(getPathDiagonal(p+"D", r-1, c-1));
        }
        if(c>1){
            path.addAll(getPathDiagonal(p+"H", r, c-1));
        }
        return path;
    }
}
