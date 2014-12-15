/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bonn.ooka.conference.ejb;

import javax.ejb.Stateful;
import org.bonn.ooka.conference.dao.FakeDB;
import org.bonn.ooka.conference.dtos.Konferenz;
import org.bonn.ooka.conference.dtos.Veranstalter;

/**
 *
 * @author Fabian
 */
@Stateful
public class CreateConferenceEJB implements CreateConferenceEJBLocal {

    @Override
    public String createConference(Konferenz konferenz){
        
        if(FakeDB.addKonferenz(konferenz))
            return konferenz.getVeranstalter().getName() + ", ihre Konferenz '" + konferenz.getTitel() + "' wurde erfolgreich erstellt.";
        else{
            return konferenz.getVeranstalter().getName() + ", ihre Konferenz '" + konferenz.getTitel() + "' darf aufgrund negativer Bewertungen nicht mehr als 200 Teilnehmer groß sein. Die Konferenz wurde nicht erstellt.";
        }
    }
    
}
