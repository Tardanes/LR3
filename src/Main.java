import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.isDigit('X'));
        System.out.println(Character.isAlphabetic(';'));
        System.out.println(Character.isLetter('S'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isSpaceChar('0'));
        System.out.println(Character.isUpperCase('5'));
        System.out.println(new Character('A').hashCode());
        System.out.println(Character.isUpperCase(100));
        System.out.println(Character.valueOf('Y'));
        String s="Some text";
        System.out.println(s.toUpperCase());
        s=""+Character.toString('A');
        s += 'B';
        System.out.println(s);
        s="Some ";
        System.out.println(s+"text");
        String s1=Integer.toString(150);
        String s2=Character.valueOf('5').toString();
        System.out.println(s1+s2);
        s1="To be or not to be";
        System.out.println(s1.contains("be"));
        s1="ABC";
        s2="Abc";
        System.out.println(s1.compareTo(s2));
        s1="Hello world";
        System.out.println(s1.substring(6,s1.length()));
        s1="Hello world";
        System.out.println(s1.startsWith("abc"));
        s="Hello world";
        System.out.println(s.charAt(3));
        s="Hello world";
        s1=s.replaceAll("o", "_");
        System.out.println(s1);
        StringBuffer sb=new StringBuffer("Hello world");
        sb.delete(0,5);
        System.out.println(sb);
        System.out.println(new StringBuffer("Hello").reverse());
        sb=new StringBuffer("Hello world");
        sb.replace(6,7,"W");
        System.out.println(sb);
        sb=new StringBuffer("Some text");
        sb.insert(5,"short ");
        System.out.println(sb);
        sb=new StringBuffer("Hello world");
        s=sb.toString();
        System.out.println(s);

        // Laboratory work #3

        System.out.println("\uD83D\uDE04");
        System.out.println("\uD83D\uDE0D");
        System.out.println("\uD83D\uDE02");


        String dateString = "Sunday, 12 September 2021";
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.ENGLISH);
        try {
            Date date = dateFormat.parse(dateString);
            Date currentDate = new Date();
            SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
            int currentYear = Integer.parseInt(yearFormat.format(currentDate));
            int dateYear = Integer.parseInt(yearFormat.format(date));
            if (currentYear == dateYear) {
                System.out.println("Дата відноситься до поточного року.");
            } else {
                System.out.println("Дата не відноситься до поточного року.");
            }
        } catch (ParseException e) {
            System.out.println("Помилка при парсингу дати: " + e.getMessage());
        }
    }
}