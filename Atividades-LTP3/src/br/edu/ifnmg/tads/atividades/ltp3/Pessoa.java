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

public class Pessoa{
	
	private int id;	
	private String nome;
	private Date nascimento;

	public pessoa(){
	       id=0;
	       nome="";
	       nascimento=NewDate();
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
	public void setNome(String pnome){
	  if(pnome.length()>3 && pnome.length()<250){
		this.nome=pnome;
	  }
	  throw new Exception("Nao podem haver nomes com menos de 3 letras e mais do que 250 letras");
	}
}

