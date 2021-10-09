package com.mapsn.service.repository;




import com.mapsn.model.CommunRu;

import antlr.collections.List;

public interface CRService {
 void initCommunRu();
 CommunRu saveCommunRu( CommunRu  communRu);
	java.util.List<CommunRu> findAllCommunRu();
	void deleteCommunRu(Long id);
	CommunRu updateCommunRu( CommunRu  communRu);

}
	
 

