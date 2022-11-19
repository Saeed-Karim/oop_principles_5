package mutable_immutable;

public class Exercise01 {

    /*
    Create a method that takes a String and returns a String
    if the given String have an even length and length is at least 2, then insert * in the middle of the string

    aa --> a*a
    java  --> ja*va
    yoanna  --> yoa*nna

    if the given String have an odd length and length is at least 2, then insert * before and after the middle char

    aaa --> a*a*a
    olena --> ol*e*na

    if the String is Empty  or length of 1, then return string itself
    */

    public static String insertStar(String str){
        if (str.length() <= 1) return str;

        if (str.length() % 2 == 0){ //a*a bb*bb
            return new StringBuilder(str).insert(str.length() / 2, "*").toString();
        }
        else { //b*b*b cc*c*cc 3/2 --> 1 5/2 --> 2  length() / 2  4/2 --> 2 +1  6/2 --> 3+1  length() / 2 +1
            return new StringBuilder(str).insert(str.length()/2, "*").insert(str.length()/2+2, "*").toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(insertStar(""));
        System.out.println(insertStar("a"));
        System.out.println(insertStar("aa"));
        System.out.println(insertStar("aaa"));
        System.out.println(insertStar("aaaa"));
        System.out.println(insertStar("aaaaa"));
        System.out.println(insertStar("aaaaaa"));
    }










}
