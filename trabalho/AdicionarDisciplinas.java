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
class AdicionarDisciplinas {
    private int idDisciplina;
    private int idCurso;
    
    public AdicionarDisciplinas() {
        
    }
    
    public AdicionarDisciplinas(int idDisciplina, int idCurso) {
        this.idDisciplina =idDisciplina;
        this.idCurso = idCurso;       
    }
    public int getIdDisciplina(){
        return idDisciplina;
    }
    public void setIdDisciplina(int idDisciplina){
        this.idDisciplina = idDisciplina;
    }
    
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso){
        this.idCurso = idCurso;
    }

    @Override
    public String toString() {
       return "Adicionar Disciplina:" + "idDisciplina=" + idDisciplina + ", IdCurso=" + idCurso;
    }
    
    

}
