package ua.ictloud.lessons.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 20-Apr-18.  Регульярные выражения Pattern и проверка на наличие Matcher
 */
public class MainPattern {
    public static void main(String[] args) {
        Pattern webPat = Pattern.compile(".*(http|https)://.*");
        Matcher webMat = webPat.matcher("Hello my friend? http://porno.ua");
        boolean isWeb = webMat.matches();
        System.out.println(isWeb);


    }
}
