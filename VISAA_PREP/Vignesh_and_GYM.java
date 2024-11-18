import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        if(p+q <=r) {
            System.out.println("2");
        }
        else if(p<=r) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
