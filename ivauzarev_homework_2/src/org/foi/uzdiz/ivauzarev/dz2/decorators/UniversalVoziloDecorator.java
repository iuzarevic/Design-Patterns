/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.ivauzarev.dz2.decorators;

import org.foi.uzdiz.ivauzarev.dz2.KonkretniSpremnik;
import org.foi.uzdiz.ivauzarev.dz2.Vozilo;
import org.foi.uzdiz.ivauzarev.dz2.loggers.VozilaLogger;

/**
 *
 * @author Ivan
 */
public class UniversalVoziloDecorator extends VoziloDecorator {

    public UniversalVoziloDecorator(VoziloInterface customVozilo) {
        super(customVozilo);
    }

    @Override
    public void dohvatiOtpad(KonkretniSpremnik ks) {
        Vozilo v = (Vozilo) customVozilo;
        //sta ako je spremnik veci od nosivosti, mislim da je to nemoguca situacija, nijedan spremnik u stvarnosti nije veci od nosivosti
        VozilaLogger.printRad(v, ks);
        float nova_popunjenost = v.getPopunjenost() + ks.getNapunjenost();
        if (nova_popunjenost >= v.getNosivost()) {
            v.notifyAllObservers();
        } else {
            v.setPopunjenost(nova_popunjenost);
            ks.isprazni();
            v.azurirajStatistikuOtpada(1, ks.getNapunjenost());
        }
    }
    
    public void povecajKapacitet() {
        ((Vozilo)customVozilo).povecajKapacitet(1000);
    }
}
