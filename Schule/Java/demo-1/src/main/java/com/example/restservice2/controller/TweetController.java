package com.example.restservice2.controller;

import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * REST-Controller für die Verwaltung von Tweets.
 */
@RestController
@RequestMapping("/api2")
public class TweetController {

    private final AtomicLong counter = new AtomicLong();

    /**
     * Liefert einen Tweet basierend auf der ID.
     *
     * @param id ID des Tweets
     * @return Tweet als String
     */
    @GetMapping("/tweet/{id}")
    public String getTweet(@PathVariable Long id) {
        return "Hello World - Tweet #" + id;
    }

    /**
     * Erstellt einen neuen Tweet.
     *
     * @param content Inhalt des Tweets
     * @return Nachricht mit neuer Tweet-ID
     */
    @PostMapping("/tweet")
    public String createTweet(@RequestBody String content) {
        return "Neuer Tweet mit ID: " + counter.incrementAndGet() + ", Inhalt: " + content;
    }

    /**
     * Löscht einen Tweet basierend auf der ID.
     *
     * @param id ID des zu löschenden Tweets
     * @return Bestätigung der Löschung
     */
    @DeleteMapping("/tweet/{id}")
    public String deleteTweet(@PathVariable Long id) {
        return "Tweet #" + id + " gelöscht.";
    }
}