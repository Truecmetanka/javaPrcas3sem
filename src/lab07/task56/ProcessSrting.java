package lab07.task56;

public class ProcessSrting implements StringInterective {
    @Override
    public int countSymbols(String s) {
        char[] ch = s.toCharArray();
        return ch.length;
    }

    @Override
    public String newStringFromExactPositions(String s) {
        char[] ch = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 != 0) {
                stringBuilder.append(ch[i]);
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String invertion(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
