package com.tr.sifreUretici;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class passwordGenerator {

    private static final int MIN_CODE = 33, MAX_CODE = 126;
    private static String allowedCharacters;




    public static String process(int length, Boolean capitalLetter, Boolean lowercaseLetter, Boolean numbers, Boolean symbols) {
        allowedCharacters = "";
        if (capitalLetter) {allowedCharacters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";}
        if (lowercaseLetter) {allowedCharacters += "abcdefghijklmnopqrstuvwxyz";}
        if (numbers) {allowedCharacters += "0123456789";}
        if (symbols) {allowedCharacters += "!@#$%^&*()_-+=<>?/{}~|";}

        final Random random=new Random();
        final StringBuilder sb=new StringBuilder(length);

        for(int i=0;i<length;++i){
            sb.append(allowedCharacters.charAt(random.nextInt(allowedCharacters.length())));

        }
        return sb.toString();
    }
}
