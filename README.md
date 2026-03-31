# 📚 Gestione Biblioteca - Spring Boot MVC

Applicazione web sviluppata con Spring Boot per la gestione di una biblioteca universitaria, progettata seguendo il pattern architetturale Model-View-Controller (MVC).

Il sistema consente di gestire in modo completo il catalogo libri, gli autori, gli utenti e i prestiti, simulando un contesto reale. Ogni libro è associato a un autore e può appartenere a più categorie, mentre gli utenti possono effettuare prestiti con gestione dello stato e restituzione. Le relazioni tra le entità sono modellate tramite JPA, includendo associazioni uno-a-molti, uno-a-uno e molti-a-molti.

L’applicazione è strutturata in livelli separati: i controller gestiscono le richieste web, i service contengono la logica applicativa e i repository si occupano dell’accesso ai dati tramite Spring Data JPA. Le viste sono realizzate con Thymeleaf, permettendo la generazione dinamica delle pagine HTML.

È inoltre presente un sistema di inizializzazione automatica dei dati per facilitare il testing delle funzionalità principali.

