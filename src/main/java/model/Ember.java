package model;

import java.time.Year;

public class Ember {
    private String nev;
    private int szulEv;
    private String cim;
    private String foglalkozas = "nincs megadva";
    private String nem = "nincs megadva";

    public Ember(String nev, int szulEv, String cim) {
        this.nev = nev;
        this.szulEv = szulEv;
        this.cim = cim;
    }

    public Ember(String nev, int szulEv, String cim, String foglalkozas, String nem) {
        this.nev = nev;
        this.szulEv = szulEv;
        this.cim = cim;
        this.foglalkozas = foglalkozas;
        this.nem = nem;
    }

    public String getNev() {
        return nev;
    }

    public int getSzulEv() {
        return szulEv;
    }

    public String getCim() {
        return cim;
    }

    public String getFoglalkozas() {
        return foglalkozas;
    }

    public String getNem() {
        return nem;
    }
    
    public String bemutatkozik() {
        return "Hello! A nevem " + this.nev + ", " + (Year.now().getValue() - this.szulEv) + " éves vagyok.";
    }
    
    public String mitDolgozik() {
        return "Foglalkozásom " + this.foglalkozas + ".";
    }
    
    public String holLakik() {
        return "Lakhelyem " + this.cim + ".";
    }
    
    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", szulEv=" + szulEv + ", cim=" + cim + '}';
    }
}
