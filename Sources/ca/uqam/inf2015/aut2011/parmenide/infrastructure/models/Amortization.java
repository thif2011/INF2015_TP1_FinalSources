/*
 * Copyright (C) 2011, UQAM
 * 
 * $Revision: 1.0.0.0 $
 */
package ca.uqam.inf2015.aut2011.parmenide.infrastructure.models;

/**
 * Contient l information d un amortissement
 * 
 * @author Frederic Thibodeau
 * @author Roosvelt Lamour
 * @version 1.0
 */
public class Amortization {
    
    private int periode;
    private double capitalDebut;
    private double versementTotal;
    private double versementInteret;
    private double versementCapital;
    private double capitalFin;

    /**
     * @return the periode
     */
    public int getPeriode() {
        return periode;
    }

    /**
     * @param periode the periode to set
     */
    public void setPeriode(int periode) {
        this.periode = periode;
    }

    /**
     * @return the capitalDebut
     */
    public double getCapitalDebut() {
        return capitalDebut;
    }

    /**
     * @param capitalDebut the capitalDebut to set
     */
    public void setCapitalDebut(double capitalDebut) {
        this.capitalDebut = capitalDebut;
    }

    /**
     * @return the versementTotal
     */
    public double getVersementTotal() {
        return versementTotal;
    }

    /**
     * @param versementTotal the versementTotal to set
     */
    public void setVersementTotal(double versementTotal) {
        this.versementTotal = versementTotal;
    }

    /**
     * @return the versementInteret
     */
    public double getVersementInteret() {
        return versementInteret;
    }

    /**
     * @param versementInteret the versementInteret to set
     */
    public void setVersementInteret(double versementInteret) {
        this.versementInteret = versementInteret;
    }

    /**
     * @return the versementCapital
     */
    public double getVersementCapital() {
        return versementCapital;
    }

    /**
     * @param versementCapital the versementCapital to set
     */
    public void setVersementCapital(double versementCapital) {
        this.versementCapital = versementCapital;
    }

    /**
     * @return the capitalFin
     */
    public double getCapitalFin() {
        return capitalFin;
    }

    /**
     * @param capitalFin the capitalFin to set
     */
    public void setCapitalFin(double capitalFin) {
        this.capitalFin = capitalFin;
    }
}
