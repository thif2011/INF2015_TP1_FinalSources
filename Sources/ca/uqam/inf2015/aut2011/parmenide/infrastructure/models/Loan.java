/*
 * Copyright (C) 2011, UQAM
 * 
 * $Revision: 1.0.0.0 $
 */
package ca.uqam.inf2015.aut2011.parmenide.infrastructure.models;

import java.util.List;

/**
 * Contient l information d un pret
 * 
 * @author Frederic Thibodeau
 * @author Roosvelt Lamour
 * @version 1.0
 */
public class Loan {
       
    private String id;
    private String description;
    private double montant;
    private int nombreAnnee;
    private int frequenceRemboursement;
    private int tauxInteret;
    private int frequenceComposition;
    private List<Amortization> Amortissement;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the montant
     */
    public double getMontant() {
        return montant;
    }

    /**
     * @param montant the montant to set
     */
    public void setMontant(long montant) {
        this.montant = montant;
    }

    /**
     * @return the nombreAnnee
     */
    public int getNombreAnnee() {
        return nombreAnnee;
    }

    /**
     * @param nombreAnnee the nombreAnnee to set
     */
    public void setNombreAnnee(int nombreAnnee) {
        this.nombreAnnee = nombreAnnee;
    }

    /**
     * @return the frequenceRemboursement
     */
    public int getFrequenceRemboursement() {
        return frequenceRemboursement;
    }

    /**
     * @param frequenceRemboursement the frequenceRemboursement to set
     */
    public void setFrequenceRemboursement(int frequenceRemboursement) {
        this.frequenceRemboursement = frequenceRemboursement;
    }

    /**
     * @return the tauxInteret
     */
    public int getTauxInteret() {
        return tauxInteret;
    }

    /**
     * @param tauxInteret the tauxInteret to set
     */
    public void setTauxInteret(int tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    /**
     * @return the frequenceComposition
     */
    public int getFrequenceComposition() {
        return frequenceComposition;
    }

    /**
     * @param frequenceComposition the frequenceComposition to set
     */
    public void setFrequenceComposition(int frequenceComposition) {
        this.frequenceComposition = frequenceComposition;
    }

    /**
     * @return the Amortissement
     */
    public List<Amortization> getAmortissement() {
        return Amortissement;
    }

    /**
     * @param Amortissement the Amortissement to set
     */
    public void setAmortissement(List<Amortization> Amortissement) {
        this.Amortissement = Amortissement;
    }
}
