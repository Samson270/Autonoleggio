package com.autonoleggio.Server;

import org.springframework.stereotype.Service;

@Service
public class ServerService {
    private final long serverStartTime;

    public ServerService() {
        serverStartTime = System.currentTimeMillis(); // Inizia il conteggio dei secondi
    }
    public String getServerStatus() {
        long currentTime = System.currentTimeMillis();
        long uptimeMilliseconds = currentTime - serverStartTime;

        // Calcola il tempo di attività in giorni, ore e minuti
        long uptimeSeconds = uptimeMilliseconds / 1000;
        long uptimeMinutes = uptimeSeconds / 60;
        long uptimeHours = uptimeMinutes / 60;
        long uptimeDays = uptimeHours / 24;

        return String.format("%d giorni, %d ore, %d minuti", uptimeDays, uptimeHours % 24, uptimeMinutes % 60);
    }
}
