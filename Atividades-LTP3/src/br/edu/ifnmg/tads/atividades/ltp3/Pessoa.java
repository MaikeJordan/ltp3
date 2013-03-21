/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Tecnologia em Analise e Desenvolvimento de Sistemas
 * @author Maike Jordan Rodrigues da Silva
 * Instituto Federal do Norte de Minas Gerais - Campus Januaria
 */

package br.edu.ifnmg.tads.atividades.ltp3;

import java.util.Date;
import java.util.Objects;

public class Pessoa{
	
    private int id;	
    private String nome;
    private Date nascimento;

    public Pessoa(){
      id=0;
      nome="";
      nascimento=new Date();
    }
    public int getId(){
      return id;		
    }
    public void setId(int value){
      if(value>1) {
        this.id=value;
      }		
    }	
    public String getNome(){
      return nome;	
    }
    public void setNome(String pnome) throws Exception{
      if(pnome.length()>3 && pnome.length()<250){
	this.nome=pnome;
      }
      throw new Exception("Nao podem haver nomes com menos de 3 letras e mais do que 250 letras");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.nascimento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + '}';
    }
        
}

