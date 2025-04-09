import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercises
{

    public boolean validateEmail(String email)
    {
        String regex = "^(?!.*\\.\\.)[a-zA-Z0-9](?:[a-zA-Z0-9._%+-]{0,62}[a-zA-Z0-9])?@(?=.{4,253}$)(?!-)[a-zA-Z0-9]+(?:[-]?[a-zA-Z0-9]+)*(?:\\.[a-zA-Z]{2,})+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public String findDate(String string)
    {
        // dd/mm/yyyy or mm/dd/yyyy
        String pattern1 = "\\b(\\d{2})/(\\d{2})/(\\d{4})\\b";
        // yyyy-mm-dd
        String pattern2 = "\\b(\\d{4})-(\\d{2})-(\\d{2})\\b";
        // yyyy/mm/dd
        String pattern3 = "\\b(\\d{4})/(\\d{2})/(\\d{2})\\b";
        // Pattern 1: dd/mm/yyyy or mm/dd/yyyy
        Matcher m1 = Pattern.compile(pattern1).matcher(string);
        if (m1.find())
        {
            int day = Integer.parseInt(m1.group(1));
            int month = Integer.parseInt(m1.group(2));
            if (day >= 1 && day <= 31 && month >= 1 && month <= 12)
            {
                return m1.group(0);
            }
        }
        // Pattern 2: yyyy-mm-dd
        Matcher m2 = Pattern.compile(pattern2).matcher(string);
        if (m2.find())
        {
            int year = Integer.parseInt(m2.group(1));
            int month = Integer.parseInt(m2.group(2));
            int day = Integer.parseInt(m2.group(3));
            if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
                return m2.group(0);
            }
        }
        // Pattern 3: yyyy/mm/dd
        Matcher m3 = Pattern.compile(pattern3).matcher(string);
        if (m3.find())
        {
            int year = Integer.parseInt(m3.group(1));
            int month = Integer.parseInt(m3.group(2));
            int day = Integer.parseInt(m3.group(3));
            if (month >= 1 && month <= 12 && day >= 1 && day <= 31)
            {
                return m3.group(0);
            }
        }

        return null;
    }

    public int findValidPasswords(String string)
    {
        if (string == null || string.isEmpty())
        {
            return 0;
        }
        String[] tokens = string.split("[\\s\\[\\](){}\"',:;.!?]+");
        int count = 0;
        for (String token : tokens)
        {
            if (token.isEmpty()) continue;
            if (isValidPassword(token))
            {
                count++;
            }
        }

        return count;
    }

    private boolean isValidPassword(String password)
    {
        if (password.length() < 8)
        {
            return false;
        }
        if (!password.matches(".*[a-z].*"))
        {
            return false;
        }
        if (!password.matches(".*[A-Z].*"))
        {
            return false;
        }
        if (!password.matches(".*\\d.*"))
        {
            return false;
        }
        if (!password.matches(".*[!@#$%^&*].*"))
        {
            return false;
        }
        if (password.contains(" "))
        {
            return false;
        }
        return true;
    }





    public List<String> findPalindromes(String string)
    {
        List<String> list = new ArrayList<>();
        if (string == null || string.isEmpty())
        {
            return list;
        }

        Pattern pattern = Pattern.compile("\\b[a-zA-Z]{3,}\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find())
        {
            String word = matcher.group();
            if (isPalindrome(word))
            {
                list.add(word);
            }
        }
        return list;
    }

    private boolean isPalindrome(String word)
    {
        String lower = word.toLowerCase();
        return lower.equals(new StringBuilder(lower).reverse().toString());
    }

    public static void main(String[] args) {
        // test manually here
    }
}
