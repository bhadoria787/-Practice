package proteus_technologies;

public class String_to_int 
{
    public static void main(String[] args) {
        String intString = "123";
        int intValue = stringToInt(intString);
        System.out.println("String to Integer: " + intValue);
    }

    public static int stringToInt(String str) {
        int numberformat = 0;
        boolean isNegative = false;
        int i = 0;

        if (str.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }

        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character in number: " + c);
            }
            numberformat = numberformat * 10 + (c - '0');
        }

        if (isNegative) {
            numberformat = -numberformat;
        }

        return numberformat;
    }
}
