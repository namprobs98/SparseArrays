/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sparsearrays;

import java.util.Scanner;

/**
 *
 * @author Nhat Anh
 */
public class SparseArrays {

    public static int[] countTheNumberOfElements(String[] strList, String[] queries) {
        int[] output = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < strList.length; j++) {
                if (queries[i].equals(strList[j])) {
                    count++;
                }
            }
            output[i] = count;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStringList = sc.nextInt();
        sc.nextLine();
        String[] strList = new String[numOfStringList];
        for (int i = 0; i < numOfStringList; i++) {
            strList[i] = sc.nextLine();
        }
        
        int numOfQueries = sc.nextInt();
        sc.nextLine();
        String[] queries = new String[numOfQueries];
        for (int i = 0; i < numOfQueries; i++) {
            queries[i] = sc.nextLine();
        }

        int[] output = countTheNumberOfElements(strList, queries);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
