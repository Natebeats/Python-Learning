/**
 * 
 */
package day2702.restcheck;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

import com.google.gson.Gson;

/**
 * @author fred
 *
 */
public class UserManagerREST {
//    private final String baseUrl = "http://localhost:8080/users";
    private final String baseUrl = "https://schulung.fdjey.de/users";
    private final String username = "schulung";
    private final String passwort = "wuV7_mV2VUL"; 
    private final String authHeader;
    private final HttpClient httpClient;
    private final Gson gson;

    /**
     * Erstellt eine Instanz von UserManager mit einem HTTP-Client und Gson.
     */
    public UserManagerREST() {
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson();
        this.authHeader = "Basic " + Base64.getEncoder().encodeToString((username + ":" + passwort).getBytes());
    }
    
    
    /**
     * Ruft einen Benutzer anhand der E-Mail ab.
     * @param email Die E-Mail des Benutzers.
     * @return Das Benutzerobjekt oder null, falls nicht gefunden.
     * @throws Exception Falls die HTTP-Anfrage fehlschlägt.
     */
    public User getUser(String email) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/" + email))
                .header("Authorization", authHeader)
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode() == 200 ? gson.fromJson(response.body(), User.class) : null;
    }
    
    /**
     * Erstellt einen neuen Benutzer über die REST-API.
     * @param user Das Benutzerobjekt, das gespeichert werden soll.
     * @throws Exception Falls die HTTP-Anfrage fehlschlägt.
     */
    public void createUser(User user) throws Exception {
        String requestBody = gson.toJson(user);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl))
                .header("Authorization", authHeader)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }
    
    /**
     * Aktualisiert einen Benutzer.
     * @param email Die E-Mail des Benutzers.
     * @param user Das aktualisierte Benutzerobjekt.
     * @throws Exception Falls die HTTP-Anfrage fehlschlägt.
     */
    public void updateUser(String email, User user) throws Exception {
        String requestBody = gson.toJson(user);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/" + email))
                .header("Authorization", authHeader)
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Löscht einen Benutzer anhand der E-Mail-Adresse.
     * @param email Die E-Mail des Benutzers.
     * @throws Exception Falls die HTTP-Anfrage fehlschlägt.
     */
    public void deleteUser(String email) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/" + email))
                .header("Authorization", authHeader)
                .DELETE()
                .build();
        httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
