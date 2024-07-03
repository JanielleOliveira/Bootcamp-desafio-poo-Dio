package br.com.dio.desafio.dominio;

import java.time.LocalDate;


public class Certificado extends Dev {

    private String nomeDev;
    private String tituloCurso;
    private int cargaHoraria;
    private LocalDate dataConclusao;

    public Certificado(String nomeDev, String tituloCurso, int cargaHoraria, LocalDate dataConclusao) {
        this.nomeDev = nomeDev;
        this.tituloCurso = tituloCurso;
        this.cargaHoraria = cargaHoraria;
        this.dataConclusao = dataConclusao;
    }

    public String getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(String nomeDev) {
        this.nomeDev = nomeDev;
    }

    public String getTituloCurso() {
        return tituloCurso;
    }

    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    @Override
    public String toString() {
        return "Certificado{" +
                "Certificamos que '" + nomeDev + '\'' +
                ", concluiu o curso '" + tituloCurso + '\'' +
                ", com  carga horária de " + cargaHoraria + " horas" +
                ", em " + dataConclusao +
                '}';
    }
}
