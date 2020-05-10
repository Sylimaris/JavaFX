package app.model;

public class Experience {
	private int id_experience,id_chercheur,exp_id_experience,id_technicien,id_facture,id_reactif,a1,a2,a3,indice_priorite, nb_slot_par_groupe,nb_max_reprogrammation,suivie_dans_temps,duree_d,frequence_obs_f,a_renouveler,taille_plaque_exp,nb_groupe;
    private String date_demande_chercheur, date_debut_experience, date_fin_experience, date_transmission_resultats, type_experience, etat_experience, nom_experience;

    public Experience(int id_experience, int id_chercheur, int exp_id_experience, int id_technicien, int id_facture,
			int id_reactif, int a1, int a2, int a3, int indice_priorite, int nb_slot_par_groupe,
			int nb_max_reprogrammation, int suivie_dans_temps, int duree_d, int frequence_obs_f, int a_renouveler,
			int taille_plaque_exp, int nb_groupe, String date_demande_chercheur, String date_debut_experience,
			String date_fin_experience, String date_transmission_resultats, String type_experience,
			String etat_experience, String nom_experience) {
		this.id_experience = id_experience;
		this.id_chercheur = id_chercheur;
		this.exp_id_experience = exp_id_experience;
		this.id_technicien = id_technicien;
		this.id_facture = id_facture;
		this.id_reactif = id_reactif;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.indice_priorite = indice_priorite;
		this.nb_slot_par_groupe = nb_slot_par_groupe;
		this.nb_max_reprogrammation = nb_max_reprogrammation;
		this.suivie_dans_temps = suivie_dans_temps;
		this.duree_d = duree_d;
		this.frequence_obs_f = frequence_obs_f;
		this.a_renouveler = a_renouveler;
		this.taille_plaque_exp = taille_plaque_exp;
		this.nb_groupe = nb_groupe;
		this.date_demande_chercheur = date_demande_chercheur;
		this.date_debut_experience = date_debut_experience;
		this.date_fin_experience = date_fin_experience;
		this.date_transmission_resultats = date_transmission_resultats;
		this.type_experience = type_experience;
		this.etat_experience = etat_experience;
		this.nom_experience = nom_experience;
	}

	public int getId_experience() {
		return id_experience;
	}

	public int getId_chercheur() {
		return id_chercheur;
	}

	public int getExp_id_experience() {
		return exp_id_experience;
	}

	public int getId_technicien() {
		return id_technicien;
	}

	public int getId_facture() {
		return id_facture;
	}

	public int getId_reactif() {
		return id_reactif;
	}

	public int getA1() {
		return a1;
	}

	public int getA2() {
		return a2;
	}

	public int getA3() {
		return a3;
	}

	public int getIndice_priorite() {
		return indice_priorite;
	}

	public int getNb_slot_par_groupe() {
		return nb_slot_par_groupe;
	}

	public int getNb_max_reprogrammation() {
		return nb_max_reprogrammation;
	}

	public int getSuivie_dans_temps() {
		return suivie_dans_temps;
	}

	public int getDuree_d() {
		return duree_d;
	}

	public int getFrequence_obs_f() {
		return frequence_obs_f;
	}

	public int getA_renouveler() {
		return a_renouveler;
	}

	public int getTaille_plaque_exp() {
		return taille_plaque_exp;
	}

	public int getNb_groupe() {
		return nb_groupe;
	}

	public String getDate_demande_chercheur() {
		return date_demande_chercheur;
	}

	public String getDate_debut_experience() {
		return date_debut_experience;
	}

	public String getDate_fin_experience() {
		return date_fin_experience;
	}

	public String getDate_transmission_resultats() {
		return date_transmission_resultats;
	}

	public String getType_experience() {
		return type_experience;
	}

	public String getEtat_experience() {
		return etat_experience;
	}

	public String getNom_experience() {
		return nom_experience;
	}


    }
