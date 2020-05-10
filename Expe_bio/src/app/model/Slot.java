package app.model;

public class Slot {
	int id_slot, id_groupe;
	String code_barre_plaque,resultat_slot;
	float x,y,rm,rd,vm,vd,bm,bd,tm,td;
	/**
	 * @param id_slot
	 * @param id_groupe
	 * @param code_barre_plaque
	 * @param resultat_slot
	 * @param x
	 * @param y
	 * @param rm
	 * @param rd
	 * @param vm
	 * @param vd
	 * @param bm
	 * @param bd
	 * @param tm
	 * @param td
	 */
	public Slot(int id_slot, int id_groupe, String code_barre_plaque, String resultat_slot, float x, float y, float rm,
			float rd, float vm, float vd, float bm, float bd, float tm, float td) {
		super();
		this.id_slot = id_slot;
		this.id_groupe = id_groupe;
		this.code_barre_plaque = code_barre_plaque;
		this.resultat_slot = resultat_slot;
		this.x = x;
		this.y = y;
		this.rm = rm;
		this.rd = rd;
		this.vm = vm;
		this.vd = vd;
		this.bm = bm;
		this.bd = bd;
		this.tm = tm;
		this.td = td;
	}

	/**
	 * @return the id_slot
	 */
	public int getId_slot() {
		return id_slot;
	}
	/**
	 * @return the id_groupe
	 */
	public int getId_groupe() {
		return id_groupe;
	}
	/**
	 * @return the code_barre_plaque
	 */
	public String getCode_barre_plaque() {
		return code_barre_plaque;
	}
	/**
	 * @return the resultat_slot
	 */
	public String getResultat_slot() {
		return resultat_slot;
	}
	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}
	/**
	 * @return the rm
	 */
	public float getRm() {
		return rm;
	}
	/**
	 * @return the rd
	 */
	public float getRd() {
		return rd;
	}
	/**
	 * @return the vm
	 */
	public float getVm() {
		return vm;
	}
	/**
	 * @return the vd
	 */
	public float getVd() {
		return vd;
	}
	/**
	 * @return the bm
	 */
	public float getBm() {
		return bm;
	}
	/**
	 * @return the bd
	 */
	public float getBd() {
		return bd;
	}
	/**
	 * @return the tm
	 */
	public float getTm() {
		return tm;
	}
	/**
	 * @return the td
	 */
	public float getTd() {
		return td;
	}
}
