package lab14;


public class task02 {
    public static void main(String[] args) {
        String str = new String("abcdefghijklmnopqrstuv18340");
        System.out.println(str.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(str.matches("abcdefghijklmnoasdfasdpqrstuv18340"));
    }
}
/*
    Написать регулярное выражение, определяющее является ли данная
        строка строкой "abcdefghijklmnopqrstuv18340" или нет.
        a) пример правильных выражений: abcdefghijklmnopqrstuv18340
        b) пример неправильных выражений:
        abcdefghijklmnoasdfasdpqrstuv18340*/
