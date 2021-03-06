/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.ivauzarev.dz3.command;

/**
 *
 * @author Ivan
 */
public class OtkazCommand implements Command{

    private DispatcherReceiver dr;
    private String podaci;

    public OtkazCommand(DispatcherReceiver dr, String podaci) {
        this.dr = dr;
        this.podaci = podaci;
    }

    @Override
    public void execute() {
        dr.otkaz(podaci);
    }
}
