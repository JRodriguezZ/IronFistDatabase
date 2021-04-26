package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Partido {
    @Id
    @Column(name = "id_partido")
    private int idPartido;

    private int resultadoLocal;
    private int  resultadoVisitante, puntuacionLocal, puntuacionVisitante;

    @OneToOne
    @JoinColumn(name="nickname")
    private Jugador jugadorLocal;

    @OneToOne
    @JoinColumn(name="nickname")
    private Jugador jugadorVisitante;

    @OneToOne
    @JoinColumn(name="id_organizador")
    private Organizador organizador;

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getResultadoLocal() {
        return resultadoLocal;
    }

    public void setResultadoLocal(int resultadoLocal) {
        this.resultadoLocal = resultadoLocal;
    }

    public int getResultadoVisitante() {
        return resultadoVisitante;
    }

    public void setResultadoVisitante(int resultadoVisitante) {
        this.resultadoVisitante = resultadoVisitante;
    }

    public int getPuntuacionLocal() {
        return puntuacionLocal;
    }

    public void setPuntuacionLocal(int puntuacionLocal) {
        this.puntuacionLocal = puntuacionLocal;
    }

    public int getPuntuacionVisitante() {
        return puntuacionVisitante;
    }

    public void setPuntuacionVisitante(int puntuacionVisitante) {
        this.puntuacionVisitante = puntuacionVisitante;
    }

    public Jugador getJugadorLocal() {
        return jugadorLocal;
    }

    public void setJugadorLocal(Jugador jugadorLocal) {
        this.jugadorLocal = jugadorLocal;
    }

    public Jugador getJugadorVisitante() {
        return jugadorVisitante;
    }

    public void setJugadorVisitante(Jugador jugadorVisitante) {
        this.jugadorVisitante = jugadorVisitante;
    }
}
