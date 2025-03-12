package day0310.admin;

import java.util.Base64;

public class HttpBasicAuthHelper {
    private static String username = "schulung";
    private static String passwort = "wuV7_mV2VUL";
    private static String authHeader;

    public static String getHttpBasicAuthString() {
        if(authHeader == null) {
            authHeader = "Basic " + Base64.getEncoder().encodeToString((username + ":" + passwort).getBytes());
        }
        return authHeader;
    }
}
