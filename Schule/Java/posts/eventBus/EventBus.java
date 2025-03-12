//package posts.eventBus;
//
//import posts.main.ControllerInterface;
//import posts.messages.BaseMessage;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class EventBus implements InterfaceEventBus {
//
//    private static EventBus eventBus;
//
//    public static EventBus getInstance() {
//        if(eventBus == null) {
//            eventBus = new EventBus();
//        }
//        return eventBus;
//    }
//
//    private EventBus() {}
//
//    private List<InterfaceCallback> callbacks = new ArrayList<>();
//
//    public void sendMessage(BaseMessage message) {
//        for(InterfaceCallback callback : callbacks) {
//            callback.handleMessage(message);
//        }
//    }
//
//    @Override
//    public void registerListener(InterfaceCallback  callback) {
//        this.callbacks.add(callback);
//    }
//
//}


package posts.eventBus;

import posts.messages.BaseMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * EventBus für asynchrone Verarbeitung von Nachrichten.
 * Verwendet einen Thread-Pool zur parallelen Verarbeitung der Listener.
 */
public class EventBus implements InterfaceEventBus {

    private static EventBus eventBus;
    private final ExecutorService executorService;
    private final List<InterfaceCallback> callbacks = new ArrayList<>();

    /**
     * Gibt die Singleton-Instanz des EventBus zurück.
     * @return Instanz des EventBus
     */
    public static EventBus getInstance() {
        if (eventBus == null) {
            eventBus = new EventBus();
        }
        return eventBus;
    }

    /**
     * Privater Konstruktor zur Initialisierung des ExecutorService.
     * Erstellt einen Thread-Pool mit einer festen Anzahl an Threads.
     */
    private EventBus() {
        this.executorService = Executors.newFixedThreadPool(5);
    }

    /**
     * Registriert einen Listener für den EventBus.
     * @param callback Der zu registrierende Listener
     */
    @Override
    public void registerListener(InterfaceCallback callback) {
        this.callbacks.add(callback);
    }

    /**
     * Sendet eine Nachricht an alle registrierten Listener.
     * Die Verarbeitung erfolgt asynchron in separaten Threads.
     * @param message Die zu sendende Nachricht
     */
    public void sendMessage(BaseMessage message) {
//        System.out.println(message);
//        System.out.println(message.getMessageContent());
        for (InterfaceCallback callback : callbacks) {
            executorService.submit(() -> callback.handleMessage(message));
        }
    }

    /**
     * Beendet den ExecutorService, um laufende Threads sauber zu schließen.
     */
    public void shutdown() {
        executorService.shutdown();
    }
}