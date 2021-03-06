/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bonn.ooka.conference.ejb;

import java.util.List;
import org.bonn.ooka.conference.dtos.Gutachter;
import org.bonn.ooka.conference.dtos.Konferenz;
import org.bonn.ooka.conference.dtos.Teilnehmer;
import org.bonn.ooka.conference.dtos.Veranstalter;

/**
 *
 * @author alex
 */
public interface ConferenceSearchLocal {
    
    List<Konferenz> findConferences(String s);   
    
    List<Konferenz> getAllConferences();
    
    List<Konferenz> getKonferenzenOf(Veranstalter v);
    
    List<Konferenz> getAvailableConferences(Teilnehmer t);
    
}
