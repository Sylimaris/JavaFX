package app.model;

public class Groupe{
	private String statut_groupe;
    private int id_groupe,id_experience,quantite_a,quantite_c,is_cancereuse;


    public Groupe(String statut_groupe, int id_groupe, int id_experience, int quantite_a, int quantite_c,
			int is_cancereuse) {
		super();
		this.statut_groupe = statut_groupe;
		this.id_groupe = id_groupe;
		this.id_experience = id_experience;
		this.quantite_a = quantite_a;
		this.quantite_c = quantite_c;
		this.is_cancereuse = is_cancereuse;
	}


	public String getStatut_groupe() {
		return statut_groupe;
	}


	public int getId_groupe() {
		return id_groupe;
	}


	public int getId_experience() {
		return id_experience;
	}


	public int getQuantite_a() {
		return quantite_a;
	}


	public int getQuantite_c() {
		return quantite_c;
	}


	public int getIs_cancereuse() {
		return is_cancereuse;
	}
}
