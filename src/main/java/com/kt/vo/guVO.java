package com.kt.vo;


public class guVO {

	private String sigCd;          	  //시군구코드 
	private String sigEngNm;          //시군구명 
	private String sigKorNm;          //시군구명 
	private String geom; 			  //geometry
	private double xCrd;              //위도
	private double yCrd;              //경도
	
	//읍면동 경계, 추가 부분
	private String emdCd;			  //읍면동코드
	private String emdNm;			  //읍면동명
	
	//추가 끝
	
	public String getSigCd() {
		return sigCd;
	}
	public void setSigCd(String sigCd) {
		this.sigCd = sigCd;
	}
	public String getSigEngNm() {
		return sigEngNm;
	}
	public void setSigEngNm(String sigEngNm) {
		this.sigEngNm = sigEngNm;
	}
	public String getSigKorNm() {
		return sigKorNm;
	}
	public void setSigKorNm(String sigKorNm) {
		this.sigKorNm = sigKorNm;
	}
	public String getGeom() {
		return geom;
	}
	public void setGeom(String geom) {
		this.geom = geom;
	}
	public double getxCrd() {
		return xCrd;
	}
	public void setxCrd(double xCrd) {
		this.xCrd = xCrd;
	}
	public double getyCrd() {
		return yCrd;
	}
	public void setyCrd(double yCrd) {
		this.yCrd = yCrd;
	}
	public String getEmdCd() {
		return emdCd;
	}
	public void setEmdCd(String emdCd) {
		this.emdCd = emdCd;
	}
	public String getEmdNm() {
		return emdNm;
	}
	public void setEmdNm(String emdNm) {
		this.emdNm = emdNm;
	}
	
	
	
}
