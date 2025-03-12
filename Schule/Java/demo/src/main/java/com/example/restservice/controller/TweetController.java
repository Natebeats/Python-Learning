/**
 * 
 */
package com.example.restservice.controller;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author fred
 *
 */


@RestController
@RequestMapping("/api")
public class TweetController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/tweet/{id}")
    public String getTweet(@PathVariable String id) {
        return "Tweet #" + id;
    }

    @PostMapping("/tweet")
    public String createTweet(@RequestBody String content) {
        return "Neuer Tweet mit ID: " + counter.incrementAndGet() + ", Inhalt: " + content;
    }

    @DeleteMapping("/tweet/{id}")
    public String deleteTweet(@PathVariable Long id) {
        return "Tweet #" + id + " gelöscht.";
    }
}
