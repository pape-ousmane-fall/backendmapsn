package com.mapsn;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapsn.model.Arrondissement;
import com.mapsn.model.Commun;
import com.mapsn.model.CommunAr;
import com.mapsn.model.CommunRu;
import com.mapsn.model.Departement;
import com.mapsn.model.Region;
import com.mapsn.service.repository.ILocaliteService;

@SpringBootApplication
public class BackenMapSnApplication implements CommandLineRunner {

	@Autowired
	private ILocaliteService iLocaliteService;

	public static void main(String[] args) {
		SpringApplication.run(BackenMapSnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub;
		// region
		Region dakar = new Region("001", "dakar", 10.2, 142, 25.5, 55.6, "dakar detail", new ArrayList<>());
		Region thies = new Region("002", "thies", 10.2, 142, 25.5, 55.6, "thies detail", new ArrayList<>());
		Region fatick = new Region("003", "fatick", 10.2, 142, 25.5, 55.6, "fatick detail", new ArrayList<>());
		Region diourbel = new Region("004", "diourbel", 10.2, 142, 25.5, 55.6, "diourbel detail", new ArrayList<>());
		Region Ziguinchor = new Region("005", "Ziguinchor ", 10.2, 142, 25.5, 55.6, "Ziguinchor  detail",
				new ArrayList<>());
		Region kaolack = new Region("006", "dakar", 10.2, 142, 25.5, 55.6, "kaolack detail", new ArrayList<>());
		Region Kaffrine = new Region("007", "Kaffrine ", 10.2, 142, 25.5, 55.6, "Kaffrine  detail", new ArrayList<>());
		Region Kedougou = new Region("008", "Kedougou", 10.2, 142, 25.5, 55.6, "Kedougou  detail", new ArrayList<>());

		Region Tambacounda = new Region("009", "Tambacounda ", 10.2, 142, 25.5, 55.6, "Tambacounda  detail",
				new ArrayList<>());
		Region Matam = new Region("0010", "Matam", 10.2, 142, 25.5, 55.6, "Matam detail", new ArrayList<>());
		Region Saint_Louis = new Region("0011", "Saint-Louis", 10.2, 142, 25.5, 55.6, "Saint-Louis detail",
				new ArrayList<>());
		Region S??dhiou = new Region("0012", "S??dhiou ", 10.2, 142, 25.5, 55.6, "S??dhiou  detail", new ArrayList<>());
		Region Louga = new Region("0013", "Louga ", 10.2, 142, 25.5, 55.6, "Louga  detail", new ArrayList<>());
		Region Kolda = new Region("0014", "Kolda ", 10.2, 142, 25.5, 55.6, "Kolda  detail", new ArrayList<>());
//Depatement
		// dakar department
		Departement dakardep = new Departement("001", "dakar", 10.2, 142, 25.5, 55.6, "dakar detail", dakar,
				new ArrayList<>());
		Departement Gu??diawaye = new Departement("002", "Gu??diawaye", 10.2, 142, 25.5, 55.6, "Gu??diawaye detail", dakar,
				new ArrayList<>());
		Departement Pikine = new Departement("003", "dakar", 10.2, 142, 25.5, 55.6, "Pikine  detail", dakar,
				new ArrayList<>());
		Departement Rufisque = new Departement("004", "Rufisque", 10.2, 142, 25.5, 55.6, "Rufisque detail", dakar,
				new ArrayList<>());
		// Diourbel deapartment
		Departement diourbelDep = new Departement("005", "diourbel", 10.2, 142, 25.5, 55.6, "diourbel detail", diourbel,
				new ArrayList<>());
		Departement Bambey = new Departement("006", "Bambey ", 10.2, 142, 25.5, 55.6, "Bambey  detail", diourbel,
				new ArrayList<>());
		Departement Mback?? = new Departement("007", "Mback??", 10.2, 142, 25.5, 55.6, "Mback?? detail", diourbel,
				new ArrayList<>());

		// fatick depatement
		Departement fatickdep = new Departement("008", "fatick", 10.2, 142, 25.5, 55.6, "fatick detail", fatick,
				new ArrayList<>());
		Departement Foundiougne = new Departement("009", "Foundiougne ", 10.2, 142, 25.5, 55.6, "Foundiougne  detail",
				fatick, new ArrayList<>());
		Departement Gossas = new Departement("0010", "Gossas ", 10.2, 142, 25.5, 55.6, "Gossas  detail", fatick,
				new ArrayList<>());
// kaolack departement

		Departement kaolackdep = new Departement("0011", "Kaolack", 10.2, 142, 25.5, 55.6, "Kaolack detail", kaolack,
				new ArrayList<>());
		Departement Guinguin??o = new Departement("0012", "Guinguin??o ", 10.2, 142, 25.5, 55.6, "Guinguin??o  detail",
				kaolack, new ArrayList<>());
		Departement Nioro_du_Rip = new Departement("0013", "Nioro du Rip ", 10.2, 142, 25.5, 55.6,
				"Nioro du Rip  detail", kaolack, new ArrayList<>());
		// kolda departement
		Departement koldadep = new Departement("0014", "Kolda", 10.2, 142, 25.5, 55.6, "Kolda detail", Kolda,
				new ArrayList<>());
		Departement V??lingara = new Departement("0015", "V??lingara ", 10.2, 142, 25.5, 55.6, "V??lingara  detail", Kolda,
				new ArrayList<>());
		Departement M??dina_Yoro_Foulah = new Departement("0016", "M??dina Yoro Foulah ", 10.2, 142, 25.5, 55.6,
				"M??dina Yoro Foulah", Kolda, new ArrayList<>());

		// Louga departement
		Departement Lougadep = new Departement("0017", "Louga", 10.2, 142, 25.5, 55.6, "Louga detail", Louga,
				new ArrayList<>());
		Departement K??b??mer = new Departement("0018", "K??b??mer ", 10.2, 142, 25.5, 55.6, "K??b??mer  detail", Louga,
				new ArrayList<>());
		Departement Lingu??re = new Departement("0019", "Lingu??re  ", 10.2, 142, 25.5, 55.6, "Lingu??re", Louga,
				new ArrayList<>());

		// Matam departement
		Departement Matamdep = new Departement("0020", "Louga", 10.2, 142, 25.5, 55.6, "Louga detail", Matam,
				new ArrayList<>());
		Departement Kanel = new Departement("0021", "Kanel ", 10.2, 142, 25.5, 55.6, "Kanel  detail", Matam,
				new ArrayList<>());
		Departement Ran??rou = new Departement("0022", "Ran??rou  ", 10.2, 142, 25.5, 55.6, "Ran??rou", Matam,
				new ArrayList<>());
		// Saint-Louis departement
		Departement Saint_Louisdep = new Departement("0023", "Saint-Louis", 10.2, 142, 25.5, 55.6, "Saint-Louis detail",
				Saint_Louis, new ArrayList<>());
		Departement Dagana = new Departement("0024", "Dagana ", 10.2, 142, 25.5, 55.6, "Dagana  detail", Saint_Louis,
				new ArrayList<>());
		Departement Podor = new Departement("0025", "Podor  ", 10.2, 142, 25.5, 55.6, "Podor", Saint_Louis,
				new ArrayList<>());
//Tambacounda departement

		Departement Tambacoundadep = new Departement("0026", "Tambacounda", 10.2, 142, 25.5, 55.6, "Tambacounda detail",
				Tambacounda, new ArrayList<>());
		Departement Bakel = new Departement("0027", "Bakel ", 10.2, 142, 25.5, 55.6, "Bakel  detail", Tambacounda,
				new ArrayList<>());
		Departement Koumpentoum = new Departement("0028", "Koumpentoum  ", 10.2, 142, 25.5, 55.6, "Koumpentoum",
				Tambacounda, new ArrayList<>());
		Departement Goudiry = new Departement("0029", "Goudiry  ", 10.2, 142, 25.5, 55.6, "Goudiry", Tambacounda,
				new ArrayList<>());
		// Thies departement

		Departement thiesdep = new Departement("0030", "thies", 10.2, 142, 25.5, 55.6, "thies detail", thies,
				new ArrayList<>());
		Departement Mbour = new Departement("0031", "Mbour ", 10.2, 142, 25.5, 55.6, "Mbour  detail", thies,
				new ArrayList<>());
		Departement Tivaouane = new Departement("0032", "Tivaouane  ", 10.2, 142, 25.5, 55.6, "Tivaouane", thies,
				new ArrayList<>());
		// Ziguinchor departement

		Departement Ziguinchordep = new Departement("0033", "Ziguinchor", 10.2, 142, 25.5, 55.6, "Ziguinchor detail",
				Ziguinchor, new ArrayList<>());
		Departement Bignogna = new Departement("0034", "Bignogna ", 10.2, 142, 25.5, 55.6, "Bignogna  detail",
				Ziguinchor, new ArrayList<>());
		Departement Oussouye = new Departement("0035", "Oussouye  ", 10.2, 142, 25.5, 55.6, "Oussouye", Ziguinchor,
				new ArrayList<>());

		// Kaffrine departement

		Departement Kaffrinedep = new Departement("0036", "Kaffrine", 10.2, 142, 25.5, 55.6, "Kaffrine detail",
				Kaffrine, new ArrayList<>());
		Departement Birkilane = new Departement("0037", "Birkilane ", 10.2, 142, 25.5, 55.6, "Birkilane  detail",
				Kaffrine, new ArrayList<>());
		Departement Malem_Hodar = new Departement("0038", "Malem-Hodar  ", 10.2, 142, 25.5, 55.6, "Malem-Hodar",
				Kaffrine, new ArrayList<>());
		Departement Kounghel = new Departement("0039", "Kounghel ", 10.2, 142, 25.5, 55.6, "Kounghel", Kaffrine,
				new ArrayList<>());

		// K??dougou departement

		Departement K??dougoudep = new Departement("0040", "K??dougou", 10.2, 142, 25.5, 55.6, "K??dougou detail",
				Kedougou, new ArrayList<>());
		Departement Salemata = new Departement("0041", "Salemata ", 10.2, 142, 25.5, 55.6, "Salemata  detail", Kedougou,
				new ArrayList<>());
		Departement Saraya = new Departement("0042", "Saraya  ", 10.2, 142, 25.5, 55.6, "Saraya", Kedougou,
				new ArrayList<>());
//Sedhiou departement

		Departement Sedhioudep = new Departement("0043", "Sedhiou", 10.2, 142, 25.5, 55.6, "Sedhiou detail", S??dhiou,
				new ArrayList<>());
		Departement Bounkiling = new Departement("0044", "Bounkiling ", 10.2, 142, 25.5, 55.6, "Bounkiling  detail",
				S??dhiou, new ArrayList<>());
		Departement Goudomp = new Departement("0045", "Goudomp  ", 10.2, 142, 25.5, 55.6, "Goudomp", S??dhiou,
				new ArrayList<>());

		// Arrond Dakar
		Arrondissement DAKAR = new Arrondissement("001", "DAKAR", 125.5, 25.6, 558.6, 554.5, "DAKAR detail", dakardep,
				new ArrayList<>());

		Arrondissement DAKAR_PLATEAU = new Arrondissement("002", "DAKAR-PLATEAU", 125.5, 25.6, 558.6, 554.5,
				"DAKAR-PLATEAU detail", dakardep, new ArrayList<>());
		Arrondissement GRAND_DAKAR = new Arrondissement("003", "GRAND DAKAR ", 125.5, 25.6, 558.6, 554.5,
				"GRAND DAKAR  detail", dakardep, new ArrayList<>());
		Arrondissement ALMADIES = new Arrondissement("004", "ALMADIES", 125.5, 25.6, 558.6, 554.5, "ALMADIES detail",
				dakardep, new ArrayList<>());
		Arrondissement PARCELLES_ASSAINIES = new Arrondissement("005", "PARCELLES ASSAINIES", 125.5, 25.6, 558.6, 554.5,
				"PARCELLES ASSAINIESdetail", dakardep, new ArrayList<>());

		// Arrond Gu??diawaye
				Arrondissement Gu??diawayeAr = new Arrondissement("006", "Gu??diawaye", 125.5, 25.6, 558.6, 554.5, "Gu??diawaye detail", Gu??diawaye,
						new ArrayList<>());
				// Arrond Pikin
				Arrondissement PIKINE_DAGOUDANE  = new Arrondissement("007", "PIKINE DAGOUDANE ", 125.5, 25.6, 558.6, 554.5, "pikine detail", Pikine,
						new ArrayList<>());
				//Thiaroy
				Arrondissement Thiaroy  = new Arrondissement("008", "Thiaroy ", 125.5, 25.6, 558.6, 554.5, "Thiaroy detail", Pikine,
						new ArrayList<>());
				//niaye
				Arrondissement Niaye  = new Arrondissement("009", "Niaye  ", 125.5, 25.6, 558.6, 554.5, "Niaye detail", Pikine,
						new ArrayList<>());
				// Arrond Rufisque
				Arrondissement RUFISQUE = new Arrondissement("0010", "RUFISQUE ", 125.5, 25.6, 558.6, 554.5, "RUFISQUE detail", Rufisque,
						new ArrayList<>());
				Arrondissement RUFISQUE_EST   = new Arrondissement("0011", "RUFISQUE - EST  ", 125.5, 25.6, 558.6, 554.5, "RUFISQUE - EST  detail", Rufisque,
						new ArrayList<>());
				Arrondissement BAMBYLOR  = new Arrondissement("0012", "BAMBYLOR  ", 125.5, 25.6, 558.6, 554.5, "BAMBYLOR detail", Rufisque,
						new ArrayList<>());
		
	 // commune Dakar
				Commun Mermoz_Sacre_Coeur = new Commun("0013", " Mermoz_Sacre_Coeur", 125.5, 25.6, 558.6, 554.5, " Mermoz_Sacre_Coeur detail", ALMADIES,
						new ArrayList<>());	
				Commun Ngor = new Commun("0014", " Ngor", 125.5, 25.6, 558.6, 554.5, " Ngor detail", ALMADIES,
						new ArrayList<>());	
				Commun Ouakam = new Commun("0015", " Ouakam", 125.5, 25.6, 558.6, 554.5, " Ouakam detail", ALMADIES,
						new ArrayList<>());	
				Commun Yoff = new Commun("0016", " Yoff", 125.5, 25.6, 558.6, 554.5, " Yoff detail", ALMADIES,
						new ArrayList<>());	
				Commun ??les_des_Madeleines = new Commun("0017", " ??les_des_Madeleines", 125.5, 25.6, 558.6, 554.5, " ??les_des_Madeleines detail", DAKAR_PLATEAU,
						new ArrayList<>());	
				Commun Fann_PointE_Amitie = new Commun("0018", " Fann_PointE_Amitie", 125.5, 25.6, 558.6, 554.5, " Fann_PointE_Amitie detail", DAKAR_PLATEAU,
						new ArrayList<>());	
				Commun Gor??e = new Commun("0019", " Gor??e", 125.5, 25.6, 558.6, 554.5, " Gor??e detail", DAKAR_PLATEAU,
						new ArrayList<>());	
				Commun GueleTap??e_Fass_Colobane = new Commun("0020", " GueleTap??e_Fass_Colobane", 125.5, 25.6, 558.6, 554.5, " GueleTap??e_Fass_Colobane detail", DAKAR_PLATEAU,
						new ArrayList<>());	
				Commun M??dina = new Commun("0021", " M??dina", 125.5, 25.6, 558.6, 554.5, " M??dina detail", DAKAR_PLATEAU,
						new ArrayList<>());	
				Commun Plateau = new Commun("0022", " Plateau", 125.5, 25.6, 558.6, 554.5, " Plateau detail", DAKAR_PLATEAU,
						new ArrayList<>());	
				Commun Buscuterie = new Commun("0023", " Buscuterie", 125.5, 25.6, 558.6, 554.5, " Buscuterie detail", GRAND_DAKAR,
						new ArrayList<>());	
	   //Commune d'arrondissement
				CommunAr abcdef = new CommunAr("0024", " abcdef", 125.5, 25.6, 558.6, 554.5, " abcdef detail", Yoff,
					new ArrayList<>());	
				
	 //Communaut?? rurales
				CommunRu ghijkl = new CommunRu("0025", " ghijkl", 125.5, 25.6, 558.6, 554.5, " ghijkl detail", abcdef);
									
		// save Region
		iLocaliteService.saveRegion(dakar);
		iLocaliteService.saveRegion(thies);
		iLocaliteService.saveRegion(fatick);
		iLocaliteService.saveRegion(diourbel);
		iLocaliteService.saveRegion(Ziguinchor);
		iLocaliteService.saveRegion(kaolack);
		iLocaliteService.saveRegion(Kaffrine);
		iLocaliteService.saveRegion(Kedougou);
		iLocaliteService.saveRegion(Tambacounda);
		iLocaliteService.saveRegion(Matam);
		iLocaliteService.saveRegion(Saint_Louis);
		iLocaliteService.saveRegion(S??dhiou);
		iLocaliteService.saveRegion(Louga);
		iLocaliteService.saveRegion(Kolda);
		// save department

		// save dakar department
		iLocaliteService.saveDepartemnt(dakardep);
		iLocaliteService.saveDepartemnt(Gu??diawaye);
		iLocaliteService.saveDepartemnt(Pikine);
		iLocaliteService.saveDepartemnt(Rufisque);

		// save Diourbel department
		iLocaliteService.saveDepartemnt(diourbelDep);
		iLocaliteService.saveDepartemnt(Bambey);
		iLocaliteService.saveDepartemnt(Mback??);

		// save Diourbel department
		iLocaliteService.saveDepartemnt(diourbelDep);
		iLocaliteService.saveDepartemnt(Bambey);
		iLocaliteService.saveDepartemnt(Mback??);

		// save Fatick department
		iLocaliteService.saveDepartemnt(fatickdep);
		iLocaliteService.saveDepartemnt(Foundiougne);
		iLocaliteService.saveDepartemnt(Gossas);

		// save Kaolack department
		iLocaliteService.saveDepartemnt(kaolackdep);
		iLocaliteService.saveDepartemnt(Guinguin??o);
		iLocaliteService.saveDepartemnt(Nioro_du_Rip);

		// save Kolda department
		iLocaliteService.saveDepartemnt(koldadep);
		iLocaliteService.saveDepartemnt(V??lingara);
		iLocaliteService.saveDepartemnt(M??dina_Yoro_Foulah);

		// save Louga department
		iLocaliteService.saveDepartemnt(Lougadep);
		iLocaliteService.saveDepartemnt(K??b??mer);
		iLocaliteService.saveDepartemnt(Lingu??re);

		// save Matam department
		iLocaliteService.saveDepartemnt(Matamdep);
		iLocaliteService.saveDepartemnt(Kanel);
		iLocaliteService.saveDepartemnt(Ran??rou);

		// save Saint-Louis department
		iLocaliteService.saveDepartemnt(Saint_Louisdep);
		iLocaliteService.saveDepartemnt(Dagana);
		iLocaliteService.saveDepartemnt(Podor);

		// save Tambacounda department
		iLocaliteService.saveDepartemnt(Tambacoundadep);
		iLocaliteService.saveDepartemnt(Bakel);
		iLocaliteService.saveDepartemnt(Koumpentoum);
		iLocaliteService.saveDepartemnt(Goudiry);

		// save Thi??s department
		iLocaliteService.saveDepartemnt(thiesdep);
		iLocaliteService.saveDepartemnt(Mbour);
		iLocaliteService.saveDepartemnt(Tivaouane);

		// save Ziguinchor department
		iLocaliteService.saveDepartemnt(Ziguinchordep);
		iLocaliteService.saveDepartemnt(Bignogna);
		iLocaliteService.saveDepartemnt(Oussouye);

		// save Kaffrine department
		iLocaliteService.saveDepartemnt(Kaffrinedep);
		iLocaliteService.saveDepartemnt(Birkilane);
		iLocaliteService.saveDepartemnt(Malem_Hodar);
		iLocaliteService.saveDepartemnt(Kounghel);

		// save K??dougou department
		iLocaliteService.saveDepartemnt(K??dougoudep);
		iLocaliteService.saveDepartemnt(Salemata);
		iLocaliteService.saveDepartemnt(Saraya);

		// save S??dhiou department
		iLocaliteService.saveDepartemnt(Sedhioudep);
		iLocaliteService.saveDepartemnt(Bounkiling);
		iLocaliteService.saveDepartemnt(Goudomp);
//Arrondissement
		//Dakar Arrondissement
		iLocaliteService.saveArrondissement(DAKAR);
		iLocaliteService.saveArrondissement(DAKAR_PLATEAU);
		iLocaliteService.saveArrondissement(GRAND_DAKAR);
		iLocaliteService.saveArrondissement(ALMADIES);
		iLocaliteService.saveArrondissement(PARCELLES_ASSAINIES);
		//Guediaway Arrondissement
		iLocaliteService.saveArrondissement(Gu??diawayeAr);
		//Pikine Arrondissement
		iLocaliteService.saveArrondissement(PIKINE_DAGOUDANE);
		//Niaye
		iLocaliteService.saveArrondissement(Niaye);
		//Rufisque Arrondissement
		iLocaliteService.saveArrondissement(RUFISQUE);
		iLocaliteService.saveArrondissement(RUFISQUE_EST);
        iLocaliteService.saveArrondissement(BAMBYLOR);
 //commune
        //Save Dakar Commune
        iLocaliteService.saveCommun(Mermoz_Sacre_Coeur);
        iLocaliteService.saveCommun(Ngor);
        iLocaliteService.saveCommun(Ouakam);
        iLocaliteService.saveCommun(Yoff);
        iLocaliteService.saveCommun(??les_des_Madeleines);
        iLocaliteService.saveCommun(Fann_PointE_Amitie);
        iLocaliteService.saveCommun(Gor??e);
        iLocaliteService.saveCommun(GueleTap??e_Fass_Colobane);
        iLocaliteService.saveCommun(M??dina);
        iLocaliteService.saveCommun(Plateau);
        iLocaliteService.saveCommun(Buscuterie);

//Commune d'arrondissement
      //Save Dakar Commune d'arrondissement
	   iLocaliteService.saveCommunAr(abcdef);
	   
//Commune d'arrondissement
	      //Save Dakar Communaut?? rurales
		   iLocaliteService.saveCommunRu(ghijkl);
	  
	
	}
}
