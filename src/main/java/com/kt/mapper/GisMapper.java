package com.kt.mapper;

import java.util.List;

import com.kt.vo.EmdVO;
import com.kt.vo.GisVO;
import com.kt.vo.SangVO;
import com.kt.vo.guVO;

public interface GisMapper {
   
   // 클릭영역 주소값 return
   List<GisVO> selectList(GisVO gisVO);
   
   //상권정보 가져오기(10건)
   List<SangVO> getSangList(SangVO sangVO);

   //상권정보 가져오기
   List<SangVO> getSangCluster(SangVO sangVO);
   
   //시군구 정보 가져오기(서울 - 25개 구)
   List<SangVO> getSeoulList();
   
   //읍면동 정보 가져오기(서울 - N개 동) --<실습>
   List<SangVO> getSeoulList2(SangVO sangVO);
   
   //시군구 경계영역 정보 가져오기(서울특별시)
   List<guVO> getSeoulGeom(guVO guVO);
   
   //'동' 경계영역 정보 가져오기(서울특별시)----<실습>
   List<guVO> getSeoulGeom2(guVO guVO);
   
   //읍면동 경계영역 정보 가져오기
   List<EmdVO> getEmdGeom(guVO guVO);
   
   //추가
   //강남구 도서관 정보 가져오기(10개)
   List<SangVO> getLibraryList(SangVO sangVO);   
}