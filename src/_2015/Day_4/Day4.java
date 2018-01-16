package _2015.Day_4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Day4 {
    static final String HASH_KEY = "hash";
    static final String ANSWER_KEY = "answer";

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Map<String, String> result = calculateMD5Hash("bgvyzdsv", "00000");
        System.out.println("4-1: " + result.get(ANSWER_KEY));
        //=======PART 2=======
        result = calculateMD5Hash("bgvyzdsv", "000000");
        System.out.println("4-2: " + result.get(ANSWER_KEY));
    }
    static Map<String, String> calculateMD5Hash(String input, String prefix) throws NoSuchAlgorithmException {
        Map<String, String> result = new HashMap<>();
        MessageDigest md = MessageDigest.getInstance("MD5");
        long i = 1;
        StringBuilder sb = new StringBuilder();

        while (true) {
            sb.delete(0, sb.length());
            md.update((input + i).getBytes());
            byte[] digest = md.digest();

            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }

            if (sb.indexOf(prefix) == 0) {
                break;
            }
            i++;
        }
        result.put(HASH_KEY, sb.toString());
        result.put(ANSWER_KEY, String.valueOf(i));
        return result;
    }
}
