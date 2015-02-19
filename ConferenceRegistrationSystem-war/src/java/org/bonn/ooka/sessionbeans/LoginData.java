/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bonn.ooka.sessionbeans;

import java.io.Serializable;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.bonn.ooka.conference.dtos.Gutachter;
import org.bonn.ooka.conference.dtos.Teilnehmer;
import org.bonn.ooka.conference.dtos.Veranstalter;

/**
 *
 * @author Fabian
 */
@Named("loginData")
@SessionScoped
public class LoginData implements Serializable{

    private Veranstalter veranstalter = new Veranstalter();
    
    private Teilnehmer teilnehmer = new Teilnehmer();
    
    private Gutachter gutachter = new Gutachter();
   
    /*private boolean veranstalterLoggedIn = false;
   
    private boolean teilnehmerLoggedIn = false;
   
    private boolean gutachterLoggedIn = false;

    public boolean isVeranstalterLoggedIn() {
        return veranstalterLoggedIn;
    }

    public void setVeranstalterLoggedIn(boolean veranstalterLoggedIn) {
        this.veranstalterLoggedIn = veranstalterLoggedIn;
    }

    public boolean isTeilnehmerLoggedIn() {
        return teilnehmerLoggedIn;
    }

    public void setTeilnehmerLoggedIn(boolean teilnehmerLoggedIn) {
        this.teilnehmerLoggedIn = teilnehmerLoggedIn;
    }

    public boolean isGutachterLoggedIn() {
        return gutachterLoggedIn;
    }

    public void setGutachterLoggedIn(boolean gutachterLoggedIn) {
        this.gutachterLoggedIn = gutachterLoggedIn;
    }*/

    public boolean isLoggedIn() {
        return teilnehmer.isLoggedIn()||veranstalter.isLoggedIn()||veranstalter.isLoggedIn();
    }
    
    public Teilnehmer getTeilnehmer(){
        return teilnehmer;
    }
    
    public void setTeilnehmer(Teilnehmer teilnehmer){
        teilnehmer.setLoggedIn(true);
        this.teilnehmer=teilnehmer;
    }
    
    public Veranstalter getVeranstalter(){
        return veranstalter;
    }
    
    public void setVeranstalter(Veranstalter veranstalter){
        veranstalter.setLoggedIn(true);
        this.veranstalter=veranstalter;
    }
    
    public Gutachter getGutachter(){
        return gutachter;
    }
    
    public void setGutachter(Gutachter gutachter){
        gutachter.setLoggedIn(true);
        this.gutachter=gutachter;
    }
    
    public void invalidate(){
        this.teilnehmer = new Teilnehmer();
        this.veranstalter = new Veranstalter();
        this.gutachter = new Gutachter();
    }

}
