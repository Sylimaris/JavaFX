package app.model;

public class Plaque {
	String code_barre_plaque;
	int id_photometre, code_barre_lot;

	/**
	 * @param code_barre_plaque
	 * @param id_photometre
	 * @param code_barre_lot
	 */
	public Plaque(String code_barre_plaque, int id_photometre, int code_barre_lot) {
		super();
		this.code_barre_plaque = code_barre_plaque;
		this.id_photometre = id_photometre;
		this.code_barre_lot = code_barre_lot;
	}

	/**
	 * @return the code_barre_plaque
	 */
	public String getCode_barre_plaque() {
		return code_barre_plaque;
	}
	/**
	 * @return the id_photometre
	 */
	public int getId_photometre() {
		return id_photometre;
	}
	/**
	 * @return the code_barre_lot
	 */
	public int getCode_barre_lot() {
		return code_barre_lot;
	}


}
