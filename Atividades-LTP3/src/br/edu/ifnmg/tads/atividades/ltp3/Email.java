/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.atividades.ltp3;

import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Email {
    
    private String nomeemail;
    
    public Email(){
      nomeemail = "";    
    }

    public String getNomeemail() {
        return nomeemail;
    }

    public void setNomeemail(String nomeemail) {
        this.nomeemail = nomeemail;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nomeemail);
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
        final Email other = (Email) obj;
        if (!Objects.equals(this.nomeemail, other.nomeemail)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Email{" + "nomeemail=" + nomeemail + '}';
    }
    
    
}
