package oop.asg02;

/**
 *
 * @author Nam
 */
public class BigIntegerDemo {
    private String BigID;
    public BigIntegerDemo(int init) {
        BigID = String.valueOf(init);
    }

    public BigIntegerDemo(String init) {
        int i = 0;
        char temp = init.charAt(i);
        while ((temp == '0')&&(i <init.length() - 1)) {
            i++;
            temp = init.charAt(i);
        }
        BigID = init.substring(i); 
    }

    public String toString() {

        return BigID;
    }

    public boolean equals(Object other) {
        return toString().equals(other.toString());
    }

    public long toLong() {
        return Long.parseLong(BigID);
    }

    public BigIntegerDemo add(BigIntegerDemo other) {
        String str1 = new String();
        String str2 = new String();
        String str3 = new String("0");
        int i, x, mod;
        int carry = 0;
        while (BigID.length()!= other.BigID.length()) {
            if (BigID.length() > other.BigID.length()) {
                other.BigID = str3.concat(other.BigID);
            }
            else BigID = str3.concat(BigID);
        }
        other.BigID = str3.concat(other.BigID);
        BigID = str3.concat(BigID);
        for (i = BigID.length()-1; i>=0; i--) {
            char temp1[] = {BigID.charAt(i)};
            char temp2[] = {other.BigID.charAt(i)};
            String x1 = new String(temp1);
            String x2 = new String(temp2);
            x = Integer.valueOf(x1) + Integer.valueOf(x2) + carry;
            carry = x/10;
            mod = x%10;
            str1 = String.valueOf(mod);
            str2 = str1 + str2;
        }
        BigIntegerDemo b = new BigIntegerDemo(str2);
        return b;
    }

    public BigIntegerDemo subtract(BigIntegerDemo other) {
        String str1 = new String();
        String str2 = new String();
        String str3 = new String("0");
        int i, x;
        int carry = 0;
        while (BigID.length()!= other.BigID.length()) {
            if (BigID.length() > other.BigID.length()) {
                other.BigID = str3.concat(other.BigID);
            }
            else BigID = str3.concat(BigID);
        }
        other.BigID = str3.concat(other.BigID);
        BigID = str3.concat(BigID);
        for (i = BigID.length()-1; i>=0; i--) {
            char temp1[] = {BigID.charAt(i)};
            char temp2[] = {other.BigID.charAt(i)};
            String x1 = new String(temp1);
            String x2 = new String(temp2);
            x = Integer.valueOf(x1) - Integer.valueOf(x2) - carry;
            if (x < 0) {
                carry = 1;
                x += 10;
            }
            else carry = 0;
            str1 = String.valueOf(x);
            str2 = str1 + str2;
        }
        BigIntegerDemo big = new BigIntegerDemo(str2);
        return big;
    }
}
