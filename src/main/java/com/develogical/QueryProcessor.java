package com.develogical;

import java.util.Locale;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("your name")) {
            return "GoTeam";
        }

        if (query.toLowerCase().contains("leon")) {
            return "leon will get offers from multiple big names";
        }

        if (query.toLowerCase().contains("plus")) {

            String sample = query.toLowerCase();
            char[] chars = sample.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : chars){
                if(Character.isDigit(c)){
                    sb.append(c);
                }
                if(c == 'p'){
                    sb.append(' ');
                }
            }
            String str = sb.toString();
            String[] splited = str.split(" ");
            int a = Integer.valueOf(splited[0]);
            int b = Integer.valueOf(splited[1]);
            int c = a+b;
            String result = Integer.toString(c);

            return result;
        }

        if (query.toLowerCase().contains("minus")) {

            String sample = query.toLowerCase();
            char[] chars = sample.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : chars){
                if(Character.isDigit(c)){
                    sb.append(c);
                }
                if(c == 'm'){
                    sb.append(' ');
                }
            }
            String str = sb.toString();
            String[] splited = str.split(" ");
            int a = Integer.valueOf(splited[0]);
            int b = Integer.valueOf(splited[1]);
            int c = a-b;
            String result = Integer.toString(c);

            return result;
        }

        if (query.toLowerCase().contains("largest")) {

            String sample = query.toLowerCase();
            char[] chars = sample.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : chars){
                if(Character.isDigit(c)){
                    sb.append(c);
                }
                if(c == ','){
                    sb.append(' ');
                }
            }
            String str = sb.toString();
            String[] splited = str.split(" ");
            int max = -1;
            for (String s: splited){
                int temp = Integer.valueOf(s);
                if(max<=temp) max = temp;
            }
            String result = Integer.toString(max);

            return result;
        }

        return "";


    }
}
