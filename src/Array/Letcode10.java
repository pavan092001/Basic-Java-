package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letcode10 {
    public static void main(String[] args) {
        /* You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

    ruleKey == "type" and ruleValue == typei.
    ruleKey == "color" and ruleValue == colori.
    ruleKey == "name" and ruleValue == namei.

Return the number of items that match the given rule.*/

//        String[][] s = {
//                {"phone","blue","pixel"},
//                {"computer","silver","lenovo"},
//                {"phone","gold","iphone"}};

        String rulekey="type";
        String ruleValue ="phone";

//        switch (rulekey){
//            case "type"->{
//                for (int i = 0; i <s.length; i++) {
//                    if (s[i][0].equals(rulevalue)){
//                        System.out.println(Arrays.toString(s[i]));
//
//                        break;
//                    }
//
//                }
//            }
//            case"color" ->{
//                for (int i = 0; i <s.length; i++) {
//                    if (s[i][1].equals(rulevalue)){
//                        System.out.println(Arrays.toString(s[i]));
//                        break;
//                    }
//
//                }
//            }
//            case "names" ->{
//                for (int i = 0; i <s.length; i++) {
//                    if (s[i][2].equals(rulevalue)){
//                        System.out.println(Arrays.toString(s[i]));
//                        break;
//                    }
//
//                }
//
//            }
//
//
//        }


        int match=0;
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","phone"));
        items.add(Arrays.asList("phone","gold","iphone"));

//        switch(rulekey){
//            case "type"->{
//                for(int i =0;i<items.size();i++){
//                    if((items.get(i).get(0)).equals(ruleValue))
//                        match++;
//                }
//            }
//            case "color" ->{
//                for(int i =0;i<items.size();i++){
//                    if((items.get(i).get(1)).equals(ruleValue))
//                        match++;
//                }
//            }
//            case "name" ->{
//                for(int i =0;i<items.size();i++){
//                    if((items.get(i).get(2)).equals(ruleValue))
//                        match++;
//                }
//                System.out.println(match);
//            }
//        }

        String[] p ={"type","color","name"};
        for (int i = 0; i < p.length ; i++) {
            if (rulekey.equals(p[i])){
                for(int j =0;j<items.size();j++){
                    if((items.get(j).get(i)).equals(ruleValue))
                        match++;
                }

            }

        }

        System.out.println(match);





    }

}
