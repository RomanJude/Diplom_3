import org.json.JSONObject;

import java.util.Random;

public class Helper {

    public static String getRandomEmail() {
        Random random = new Random();
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;

        String randomString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return randomString + "@gmail.com";
    }

}
