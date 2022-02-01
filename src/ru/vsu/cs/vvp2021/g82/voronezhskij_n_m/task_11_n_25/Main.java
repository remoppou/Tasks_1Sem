package ru.vsu.cs.vvp2021.g82.voronezhskij_n_m.task_11_n_25;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

//Из текста выбрать (в виде списка) без повторений все email-адреса. За email-адрес будет принимать любой фрагмент
//вида X@X, где X – любая последовательность букв английского алфавита, цифр, а также символов точка,
//'-' и '_' (естественно, первым и последним символом не может быть точка).


public class Main {

    private static boolean simbols(char c) {
//    c > 64 and c < 91 its  @ and all Big letter
        if ((c > 63 && c < 91) || (c > 96 && c < 123) || (c == 95) || (c == 45) || (c == 46) || (c > 47 && c < 58)) {
            return true;
        }
        return false;
    }

    private static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    private static String doRigthMail(String word) {
        StringBuilder mailsb = new StringBuilder();
        int calkLeft = 0;
        int calkRight = 0;
        int dogsIndex = 0;
        int chDogs = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '@') {
                chDogs++;
                if (chDogs > 1) {
                    String nothing = " ";
                    return nothing;
                }
                for (dogsIndex = i; dogsIndex > 0; dogsIndex--) {
                    if (simbols(word.charAt(dogsIndex - 1))) {
                        calkLeft++;
                    } else break;
                }
                if (word.charAt(dogsIndex) == '.') {
                    while (word.charAt(dogsIndex) == '.') {
                        calkLeft--;
                        dogsIndex++;
                    }
                }
                for (dogsIndex = i; dogsIndex < word.length(); dogsIndex++) {
                    if (simbols(word.charAt(dogsIndex))) {
                        calkRight++;
                    } else break;
                }
                if (word.charAt(dogsIndex - 1) == '.') {
                    while (word.charAt(dogsIndex - 1) == '.') {
                        dogsIndex--;
                        calkRight--;
                    }
                }
                if (calkLeft > 0 && calkRight > 1) {
                    for (int z = dogsIndex - calkLeft - calkRight ; z < dogsIndex; z++) {
                        mailsb.append(word.charAt(z));
                    }
                }
            }
        }
        return mailsb.toString();
    }

    private static List<String> mailsCheck(String fileName){
        List<String> words = new ArrayList<>();
        List<String> mails = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        int length = fileName.toCharArray().length;
        int numch = 0;
        int mail = 0;
        String lastWord;
        for (char c : fileName.toCharArray()) {
            word.append(c);
            numch++;
            if (c == '@') {
                mail++;
            }
            if ((c == ' ' || c == ',' || numch == length)) {
                if (mail != 0) {
                    words.add(word.toString());
                    word = new StringBuilder();
                    mail = 0;
                    for (int i = 0; i < words.size(); i++) {
                        lastWord = doRigthMail(words.get(i));
                        if (mails.contains(lastWord)) {
                            continue;
                        } else if (lastWord.length() > 2) {
                            mails.add(lastWord);
                        }
                    }
                } else word = new StringBuilder();
            }
        }
        return mails;
    }

    private static void Output (List<String> mails) {
        if (mails.size() != 0) {
            System.out.print(mails);
        } else System.out.println("В тексте отсутствуют корректно введенные email - адреса!!!!!");
    }

    public static void main(String[] args) throws Exception {
        String data = readFileAsString("Text.txt");
        System.out.println(data);
        Output(mailsCheck(data));
    }
}