package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Desafio extends Conteudo {

    private String requisitos;
    private String nivelDificuldade;
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 50d;
    }

    public Desafio() {
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nDesafio {" +
                "titulo='" + getTitulo() + '\'' +
                "\nrequisitos='" + requisitos + '\'' +
                ", nivelDificuldade='" + nivelDificuldade + '\'' +
                ", data=" + data +
                '}';
    }
}
