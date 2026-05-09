package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.aplicatie_farmacie.AdaptorMedicamentSpital;
import ro.ase.cts.adapter.aplicatie_farmacie.MedicamentFarmacie;
import ro.ase.cts.adapter.aplicatie_spital.MedicamentSpital;

public class Main {

    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie)
    {
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {

        MedicamentSpital paracetamol = new MedicamentSpital();
        MedicamentFarmacie nurofen = new MedicamentFarmacie();
        AdaptorMedicamentSpital paracetamolAdaptat = new AdaptorMedicamentSpital(paracetamol);


        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        realizeazaAchizitie(nurofen);
        realizeazaAchizitie(paracetamolAdaptat);


    }
}