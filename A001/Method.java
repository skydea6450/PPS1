package A011;

import java.util.*;

public class Method {
    Scanner sc = new Scanner(System.in);

    public int[] Input(int[] g){
        System.out.print("Enter number of elements : ");
        int size = 0;
        size = sc.nextInt();
        g = new int[size];
        for(int i = 0; i < size; i++){
            System.out.printf("Enter the number > ");
            g[i] = sc.nextInt();
        }
        return g;
    }
    
    public void print(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;
        int cookieIndex = 0;
        int childIndex = 0;

        while (childIndex < g.length && cookieIndex < s.length) {
            if (s[cookieIndex] >= g[childIndex]) {
                contentChildren++;
                childIndex++;
                cookieIndex++;
            } else {
                cookieIndex++;
            }
        }
        System.out.println(contentChildren);
    }
}
