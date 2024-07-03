package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {

        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {

        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso {" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    public Certificado concluirCurso(Dev dev) {
        Certificado certificado = new Certificado(dev.getNome(), this.getTitulo(), this.getCargaHoraria(), LocalDate.now());
        dev.adicionarCertificado(certificado);
        return certificado;
    }
}
