package com.mtd.santanu;

import java.util.ArrayList;

public class Test {
    static String smallest(String s) {
        int length = s.length();
        String result = "";
        for (int i = 0; i < length-1; i++) {

            if (s.charAt(i) > s.charAt(i + 1)) {
                for (int j = 0; j < length; j++) {
                    if (i != j) {
                        result += s.charAt(j);
                    }
                }
                return result;
            }
        }
        result = s.substring(0, length - 1);
        return result;
    }
    public static void main(String[] args) {
        String s = "hot";
        System.out.println(smallest("sdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlbsdfdfsdfsefsefesfesfiuhaiufhasihfihfisifisndsrgvrfbrdbrdbdrbdjjkhkjhkhjghjghughugfulfufgfgufvuhjvhjbvhjbhjbhjbvhjvblhbvlbvlb"));
    }
}
