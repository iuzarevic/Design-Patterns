/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.ivauzarev.dz2.observers;

import org.foi.uzdiz.ivauzarev.dz2.Vozilo;
import org.foi.uzdiz.ivauzarev.dz2.iterator.VozniParkRepository;

/**
 *
 * @author Ivan
 */
public abstract class ObserverZaVozila {
    protected Vozilo subject;
    protected VozniParkRepository vpr;
    public abstract void premjesti();
}
