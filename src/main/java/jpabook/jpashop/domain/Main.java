package jpabook.jpashop.domain;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alphabetSung = {"A", "B", "C", "Z", "E", "T", "Q"};
        String[] blackList = new String[5];

        for (int i = 0; i < blackList.length; i++) {
            blackList[i] = String.valueOf(scanner.next().charAt(0));
        }

        for (int i = 0; i < blackList.length; i++) {
            String result = (Arrays.asList(alphabetSung).contains(blackList[i]) == true) ? "마을사람" : "외부사람";
            System.out.println(blackList[i] + "=" + result);
        }

        scanner.close();
    }
}