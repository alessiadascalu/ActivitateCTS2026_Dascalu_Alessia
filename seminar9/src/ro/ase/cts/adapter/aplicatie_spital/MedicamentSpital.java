package ro.ase.cts.adapter.aplicatie_spital;

public class MedicamentSpital {

    public void achizitioneazaMedicament()
    {
        System.out.println(
                this.prezintaReteta() ?
                        "Medicament achizitionat": "Nu are reteta valida"
        );
    }

        protected boolean prezintaReteta()
        {
            return true;
        }
}
