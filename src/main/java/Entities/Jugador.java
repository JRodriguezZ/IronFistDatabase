package Entities;

import Entities.usuarios.Usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jugador extends Usuario {
    @Id
    private String nickname;
    private String name, apellidos;
    private int puntuacion;

    @Column(name = "pj_name1")
    private Personaje personaje1;

    @Column(name = "pj_name2")
    private Personaje personaje2;

    @Column(name = "org_name")
    private Organizacion organizacion;

    public Jugador(String nickname, int puntuacion, String name, String apellidos, Personaje personaje1, Personaje personaje2, Organizacion organizacion) {
        this.nickname = nickname;
        this.puntuacion = puntuacion;
        this.name = name;
        this.apellidos = apellidos;
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
        this.organizacion = organizacion;
    }

    public Jugador() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public Personaje getPersonaje2() {
        return personaje2;
    }

    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

}
