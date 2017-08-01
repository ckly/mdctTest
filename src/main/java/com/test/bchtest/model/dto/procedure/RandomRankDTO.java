package com.test.bchtest.model.dto.procedure;

public class RandomRankDTO {

	  private String nm;
	  private String kor;
	  private String eng;
	  private String mat;
	  private String sci;
	  private String mus;
	  private String gym;
	  private String art;
	  private String tot;
	  
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getSci() {
		return sci;
	}
	public void setSci(String sci) {
		this.sci = sci;
	}
	public String getMus() {
		return mus;
	}
	public void setMus(String mus) {
		this.mus = mus;
	}
	public String getGym() {
		return gym;
	}
	public void setGym(String gym) {
		this.gym = gym;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public String getTot() {
		return tot;
	}
	public void setTot(String tot) {
		this.tot = tot;
	}
	
	@Override
	public String toString() {
		return "RandomRank [nm=" + nm + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", sci=" + sci + ", mus="
				+ mus + ", gym=" + gym + ", art=" + art + ", tot=" + tot + "]";
	}
	 
	
	  
	  
}
