/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cred_02_30;

/**
 *
 * @author TaniaSanai
 */
public class Cred_02_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medico Ana = new Medico();
        Medico Bea = new Medico();
        Medico Pedro = new Medico();
        
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente();
        Paciente p3 = new Paciente();
        
        Consulta c1 = new Consulta();
        Consulta c2 = new Consulta();
        Consulta c3 = new Consulta();
        Consulta c4 = new Consulta();
        
        Ana.nome= "Ana Cláudia Almeida";
        Ana.especialidade = "Psiquiatra";
        Ana.estCivil="Casada";
        Ana.diaAtend="Segunda a sábado";
        Ana.crm="0903199910";
        Ana.cpf="45998554892";
        
        Bea.nome="Beatriz Gonçalves Ferraz";
        Bea.estCivil="Solteira";
        Bea.diaAtend="Segunda, quarta e sexta";
        Bea.crm="0601199910";
        Bea.cpf="44456732845";
        Bea.especialidade="Ortopedia";
        
        Pedro.cpf="48998765843";
        Pedro.crm="2605200312";
        Pedro.nome="Pedro Almeida";
        Pedro.estCivil="Solteiro";
        Pedro.especialidade="Cardiologia";
        Pedro.diaAtend="Segunda a quinta";
        
        p1.nome="Tania Sanai Shimabukuro";
        p1.etnia="japa";
        p1.cpf="44050804883";
        p1.dataNsac="09/11/1998";
        p1.estadoCivil="Solteira";
        p1.religiao="Não praticante";
        
        p2.nome="Ninna Hirata Silva";
        p2.cpf="55467634532";
        p2.dataNsac="03/02/1999";
        p2.estadoCivil="Casada";
        p2.religiao="Católica";
        p2.etnia="japa";
        
        p3.nome="Fada da Bahia Ferreira";
        p3.cpf="11098045834";
        p3.estadoCivil="Solteira";
        p3.dataNsac="04/09/1999";
        p3.etnia="albina";
        p3.religiao="Não praticante";
        
        
    }
    
}
