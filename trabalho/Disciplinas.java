/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.para.sexta;

/**
 *
 * @author me
 */
class Disciplinas {
private int idDisciplinas;
    private String nome;
    private int horas;

    public Disciplinas(int idDisciplinas, String nome, int horas) {
        this.idDisciplinas = idDisciplinas;
        this.nome = nome;
        this.horas = horas;
    }

    public Disciplinas() {
this.idDisciplinas = idDisciplinas;
        this.nome = nome;
        this.horas = horas;   
    }


    public int setIdDisciplinas() {
        return idDisciplinas;
    }

    public void setIdDisciplinas(int idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "cursos{" + "idCurso=" + idDisciplinas + ", nome=" + nome + ", horas=" + horas + '}';
    }

   

}

