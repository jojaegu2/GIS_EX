package com.kt.vo;


public class SangVO {

	private int traNum;            //상권번호
	private String traNm;          //상권명
	private String upjongBigCd;    //업종코드(대분류)
	private String upjongMidCd;    //업종코드(중분류)
	private String upjongSmallCd;  //업종코드(소분류)
	private String sidoCd;         //시도코드 
	private String sidoNm;         //시도명 
	private String sggCd;          //시군구코드 
	private String sggNm;          //시군구명 
	private String admdongCd;      //읍면동코드 
	private String admdongNm;      //읍면동명 
    private String buldNm;         //빌딩명
    private String doroAddr;       //도로명주소
    private int addrNum;           //지번
    private String dongInfo;       //건물동
    private String floorInfo;      //건물동
    private String hoInfo;         //건물동
    private double xCrd;           //위도
    private double yCrd;           //경도
    private String geom; 		   //Geometry
    private int zlevel;            //ZoomLevel
    
    //읍면동 드랍박스 추가부분
    private String emdCd;		   //읍면동 코드
    private String emdNm;		   //읍면동명
    
	//강남구 도서관 추가부분
    private String libraryNm;		//도서관 명
    private String librarySggNm;	//도서관 해당구
    private double lat;				//위도
    private double lon;				//경도
    
    private String point;			//좌표계로 변환한 값을 가져와야 하기 때문
    
    public String getLibraryNm() {
		return libraryNm;
	}
	public void setLibraryNm(String libraryNm) {
		this.libraryNm = libraryNm;
	}
	public String getLibrarySggNm() {
		return librarySggNm;
	}
	public void setLibrarySggNm(String librarySggNm) {
		this.librarySggNm = librarySggNm;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}


	public String getemdCd() {
		return emdCd;
	}
	public void setemdCd(String emdCd) {
		this.emdCd = emdCd;
	}
	public String getEmdNm() {
		return emdNm;
	}
	public void setEmdNm(String emdNm) {
		this.emdNm = emdNm;
	}

    
	public int getZlevel() {
		return zlevel;
	}
	public void setZlevel(int zlevel) {
		this.zlevel = zlevel;
	}
	public int getTraNum() {
		return traNum;
	}
	public void setTraNum(int traNum) {
		this.traNum = traNum;
	}
	public String getTraNm() {
		return traNm;
	}
	public void setTraNm(String traNm) {
		this.traNm = traNm;
	}
	public String getUpjongBigCd() {
		return upjongBigCd;
	}
	public void setUpjongBigCd(String upjongBigCd) {
		this.upjongBigCd = upjongBigCd;
	}
	public String getUpjongMidCd() {
		return upjongMidCd;
	}
	public void setUpjongMidCd(String upjongMidCd) {
		this.upjongMidCd = upjongMidCd;
	}
	public String getUpjongSmallCd() {
		return upjongSmallCd;
	}
	public void setUpjongSmallCd(String upjongSmallCd) {
		this.upjongSmallCd = upjongSmallCd;
	}
	public String getSidoCd() {
		return sidoCd;
	}
	public void setSidoCd(String sidoCd) {
		this.sidoCd = sidoCd;
	}
	public String getSidoNm() {
		return sidoNm;
	}
	public void setSidoNm(String sidoNm) {
		this.sidoNm = sidoNm;
	}
	public String getSggCd() {
		return sggCd;
	}
	public void setSggCd(String sggCd) {
		this.sggCd = sggCd;
	}
	public String getSggNm() {
		return sggNm;
	}
	public void setSggNm(String sggNm) {
		this.sggNm = sggNm;
	}
	public String getAdmdongCd() {
		return admdongCd;
	}
	public void setAdmdongCd(String admdongCd) {
		this.admdongCd = admdongCd;
	}
	public String getAdmdongNm() {
		return admdongNm;
	}
	public void setAdmdongNm(String admdongNm) {
		this.admdongNm = admdongNm;
	}
	public String getBuldNm() {
		return buldNm;
	}
	public void setBuldNm(String buldNm) {
		this.buldNm = buldNm;
	}
	public String getDoroAddr() {
		return doroAddr;
	}
	public void setDoroAddr(String doroAddr) {
		this.doroAddr = doroAddr;
	}
	public int getAddrNum() {
		return addrNum;
	}
	public void setAddrNum(int addrNum) {
		this.addrNum = addrNum;
	}
	public String getDongInfo() {
		return dongInfo;
	}
	public void setDongInfo(String dongInfo) {
		this.dongInfo = dongInfo;
	}
	public String getFloorInfo() {
		return floorInfo;
	}
	public void setFloorInfo(String floorInfo) {
		this.floorInfo = floorInfo;
	}
	public String getHoInfo() {
		return hoInfo;
	}
	public void setHoInfo(String hoInfo) {
		this.hoInfo = hoInfo;
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
	public String getGeom() {
		return geom;
	}
	public void setGeom(String geom) {
		this.geom = geom;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

	
}
