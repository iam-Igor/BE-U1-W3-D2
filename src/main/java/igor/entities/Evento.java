package igor.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gestione_eventi")
public class Evento {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "titolo")
    private String title;

    @Column(name = "data_evento")
    private String dataEvento;

    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @Column(name = "max_partecipanti")
    private double maxParticipants;

    public Evento(String title, String dataEvento, EventType eventType, double maxParticipants) {
        this.title = title;
        this.dataEvento = dataEvento;
        this.eventType = eventType;
        this.maxParticipants = maxParticipants;
    }

    public Evento() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = String.valueOf(dataEvento);
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public double getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(double maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "title='" + title + '\'' +
                ", dataEvento=" + dataEvento +
                ", eventType=" + eventType +
                ", maxParticipants=" + maxParticipants +
                '}';
    }
}
