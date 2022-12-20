package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task06 {
    public static void main(String[] args) {
        String emails = "user@example.com, root@localhost.dot myhost@@@com.ru, @my.ru";
        String regexp = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}";
        //�([A-Za-z0-9]{1,}[\\-]{0,1}[A-Za-z0-9]{1,}[\\.]{0,1}[A-Za-z0-9]{1,})+@([A-Za-z0-9]{1,}[\\-]{0,1}[A-Za-z0-9]{1,}[\\.]{0,1}[A-Za-z0-9]{1,})+[\\.]{1}[a-z]{2,4}�
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(emails);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }

}
//
//    �������� ���������� ���������, ������������ �������� �� ������
//        ������� ���������� (����������) �-mail ������� �������� RFC ��� �������
//        2822.
//        a) ������ ���������� ���������: user@example.com, root@localhost.dot
//        b) ������ ������������ ���������: myhost@@@com.ru, @my.ru,