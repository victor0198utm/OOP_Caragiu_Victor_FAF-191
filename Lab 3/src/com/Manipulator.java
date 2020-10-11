package com;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Manipulator {
    public int Sentences(String text){
        String[] res = text.split("[.]", 0);
        return res.length;
    }

    public int Words(String text){
        String[] res = text.split("[ ,.]", 0);
        return res.length;
    }

    public int Letters(String text){
        int letters = 0;
        for (int i=0;i<text.length();i++)
            if (Character.isLetter(text.charAt(i)))
                letters++;
        return letters;
    }

    public int Vowels(String text){
        int letters = 0;
        for (int i=0;i<text.length();i++)
            if ("AEIOUaeiou".indexOf(text.charAt(i)) != -1)
                letters++;
        return letters;
    }

    public int Consonants(String text){
        int letters = 0;
        for (int i=0;i<text.length();i++)
            if ("BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(text.charAt(i)) != -1)
                letters++;
        return letters;
    }

    public void OftenWords(String text){
        HashMap<String, Integer> lengthWords = new HashMap<String, Integer>();

        String[] res = text.split("[ ,.]", 0);
        int maxOccurences = 0;
        for (String re : res) {
            if(!re.equals("")){
                if(lengthWords.get(re) != null){
                    lengthWords.put(re, lengthWords.get(re) + 1);
                    if(lengthWords.get(re) > maxOccurences)
                        maxOccurences = lengthWords.get(re);
                }else
                    lengthWords.put(re, 1);
            }
        }

        LinkedList<String> top5 = new LinkedList<>();
        for(int i=lengthWords.size(); i>=1; i--){
            for (Map.Entry me : lengthWords.entrySet()) {
                if(me.getValue().equals(maxOccurences))
                    top5.push((String) me.getKey());
                if(top5.size() >= 5) break;
            }
            maxOccurences --;
            if(top5.size() >= 5) break;
        }
        System.out.println("Top 5 most frequent words:");
        for (String el: top5) {
            System.out.println(el);
        }
    }

    public String LongestWord(String text){
        String[] res = text.split("[ ,.]", 0);
        int maxLen = 0, idx = 0;
        for (int i=0;i<res.length;i++){
            if(res[i].length() > maxLen){
                maxLen = res[i].length();
                idx = i;
            }
        }
        return res[idx];
    }

}
