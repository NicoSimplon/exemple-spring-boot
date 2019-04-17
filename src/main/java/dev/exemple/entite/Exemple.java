package dev.exemple.entite;

public class Exemple {

    private String champ1;

    private String champ2;

    public Exemple(String champ1, String champ2) {
        this.champ1 = champ1;
        this.champ2 = champ2;
    }

	/**
	 * @return the champ1
	 */
	public String getChamp1() {
		return champ1;
	}

	/**
	 * @param champ1 the champ1 to set
	 */
	public void setChamp1(String champ1) {
		this.champ1 = champ1;
	}

	/**
	 * @return the champ2
	 */
	public String getChamp2() {
		return champ2;
	}

	/**
	 * @param champ2 the champ2 to set
	 */
	public void setChamp2(String champ2) {
		this.champ2 = champ2;
	}

}