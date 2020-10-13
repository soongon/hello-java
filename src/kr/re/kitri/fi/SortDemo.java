package kr.re.kitri.fi;

import java.util.Arrays;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {

        List<String> favoriteColors = Arrays.asList("red", "yellow", "blue", "orange", "pink");

        favoriteColors.sort((o1, o2) -> o1.length() - o2.length());

        System.out.println(favoriteColors);
    }

//    static class MyComparator implements Comparator<String> {
//
//        @Override
//        public int compare(String o1, String o2) {
//            return o1.length() - o2.length();
//        }
//    }
}
