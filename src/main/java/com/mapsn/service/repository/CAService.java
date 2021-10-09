package com.mapsn.service.repository;



import com.mapsn.model.CommunAr;

import antlr.collections.List;

public interface CAService {
 void initCommunAr();
 CommunAr saveCommunAr( CommunAr  communAr);
	java.util.List<CommunAr> findAllCommunAr();
	void deleteCommunAr(Long id);
	CommunAr updateCommunAr( CommunAr  communAr);

}
	
 

