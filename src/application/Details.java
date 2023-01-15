package application;

public class Details {
	//states in Nigeria
    public static String[] state_NG= {
        "Abuja","Abia","Adamawa","Akwa Ibom","Anambra","Bauchi","Bayelsa","Benue","Borno","Cross River","Delta","Ebonyi","Edo","Ekiti","Enugu","Gombe","Imo","Jigawa","Kaduna",
    	"Kano","Katsina","Kebbi","Kogi","Kwara","Lagos","Nassarawa","Niger","Ogun","Ondo","Osun","Oyo","Plateau","Rivers","Sokoto","Taraba","Yobe"
    	,"Zamfara"
    	    
    };

    //Local-Governments
    public  static String[] _LGAChooser(String stateSelected) {
    	if(stateSelected.equalsIgnoreCase("Delta")) {
    		String[] Delta_lga= {
    				"Aniocha South","Anioha","Bomadi","Burutu","Ethiope west","Ethiope east","Ika south","Ika north east","Isoko south","Isoko north",
    				"Ndokwa east","Ndokwa west","Okpe","Oshimili north","Oshimili south","Patani","Sapele","Udu","Ughelli south","Ughelli north"
    				,"Ukwuani","Uviwie","Warri central","Warri north","Warri south"		
    				};
    		return Delta_lga;
    		}else if(stateSelected.equalsIgnoreCase("Abia")) {
    			String[] Abia_lga= {
    					"Aba North","Aba South","Arochukwu","Bende","Isiala Ngwa South","Ikwuano","Isiala","Ngwa North","Isukwuato","Ukwa West","Ukwa East","Umuahia","Umuahia South"
    				};
    			return Abia_lga;
    			}else if(stateSelected.equalsIgnoreCase("Anambra")) {
    				String[] Anambra_lga= {
    						"Aguata","Anambra","Anambra West","Anaocha","Awka South","Awka North","Ogbaru","Onitsha South","Onitsha North","Orumba North","Orumba South","Oyi" 
    						};
        			return Anambra_lga;
        			
    			}else if(stateSelected.equalsIgnoreCase("Akwa Ibom")) {
    				String[] Akwa_Ibom_lga= {
    						"Abak","Eastern Obolo","Eket","Essien Udim","Etimekpo","Etinan","Ibeno","Ibesikpo Asutan","Ibiono Ibom","Ika","Ikono","Ikot Abasi","Ikot Ekpene","Ini","Itu"
    						,"Mbo","Mkpat Enin","Nsit Ibom","Nsit Ubium","Obot Akara","Okobo","Onna","Orukanam","Oron","Udung Uko","Ukanafun","Esit Eket","Uruan","	Oruko Ete","Uyo","Urue Offoung"
    					};
        			return Akwa_Ibom_lga;
    			}else if(stateSelected.equalsIgnoreCase("Adamawa")){
    				String[] Adamawa_lga= {
    						"Fufore","Ganye","Girei","Gombi","Jada","Yola North","Lamurde","Madagali","Maiha","Mayo-Belwa","Michika","Mubi South","Numna","Shelleng","Song","Toungo","Jimeta",
    						"Yola South","Hung"
    						};
    				return Adamawa_lga;
    				
    			}else if(stateSelected.equalsIgnoreCase("Bauchi")) {
    				String[] Bauchi_lga= {
    						"Alkaleri","Bauchi","Bogoro","Darazo","Dass","Gamawa","Ganjuwa","Katagum","Kirfi","Misau","Ningi","Hira","Jama`are","Giade","Tafawa Balewa","Itas gadau","Toro"
    						,"Warji","Zaki","Dambam"
    						};
        			return Bauchi_lga;
    			}else if(stateSelected.equalsIgnoreCase("Bayelsa")) {
    				String[] Bayelsa_lga= {
    						"Brass","Ekeremor","Kolok/Opokuma","Nembe","Ogbia","Sagbama","Southern Ijaw","Yenagoa","Membe"
    						};
        			return Bayelsa_lga;
    			}else if(stateSelected.equalsIgnoreCase("Benue")) {
    				String[] Benue_lga= {
    						"Ador","Agatu","Apa","Buruku","Gboko","Guma","Gwer East","	Gwer West","Kastina-ala","Konshisha","Kwande","Logo","Makurdi","Obi","Ogbadibo","Ohimini",
    						"Oju","Okpokwu","Oturkpo","Tarka","Ukum","Vandekya"
    						};
        			return Benue_lga;
    			}else if(stateSelected.equalsIgnoreCase("Borno")) {
    				String[] Borno_lga= {
    						"Abadan","Askira/Uba","Bama","Bayo","Biu","Chibok","Damboa","Dikwagubio","Guzamala","Gwoza","Hawul","Jere","Kaga","Kalka/Balge","Konduga","Kukawa","Kwaya-ku"
    						,"Mafa","Magumeri","Maiduguri","Marte","Mobbar","Monguno","Ngala","Nganzai","Shani"
    						};
        			return Borno_lga;
    			}else if(stateSelected.equalsIgnoreCase("Cross River")) {
    				String[] Cross_River_lga= {
    						"Abia","Akampa","Akpabuyo","Bakassi","Bekwara","Biase","Boki","Calabar South","Etung","Ikom","Obanliku","Obubra","Obudu","Odukpani","Ogoja","Ugep North","Yala","Yarkur"
    						};
        			return Cross_River_lga;
    			}else if(stateSelected.equalsIgnoreCase("Ebonyi")) {
    				String[] Ebonyi_lga= {
    						"Abakaliki","Afikpo south","Afikpo north","Ebonyi","Ezza","Ezza south","Ikwo","Ishielu","Ivo","Ohaozara","Ohaukwu","Onicha","Izzi"
    						};
        			return Ebonyi_lga;
    			}else if(stateSelected.equalsIgnoreCase("Edo")) {
    				String[] Edo_lga= {
    						"Akoko-Edo","Egor","Essann east","Esan south east","Esan central","	Esan west","Etsako central","Etsako east","Etsako","Orhionwon","Ovia north","Ovia south west",
    						"Owan west","Owan south","Uhunwonde"
    						};
        			return Edo_lga;
    			}else if(stateSelected.equalsIgnoreCase("Ekiti")) {
    				String[] Ekiti_lga= {
    						"Ado Ekiti","Effon Alaiye","Ekiti south west","Ekiti west","Ekiti east","Emure/ise","Orun","Ido","Osi","Ijero","Ikere","Ikole","Ilejemeje","Irepodun"
    						,"Ise/Orun","Moba","Oye","Aiyekire"
    						};
        			return Ekiti_lga;
    			}else if(stateSelected.equalsIgnoreCase("Enugu")) {
    				String[] Enugu_lga= {
    						"Awgu","Aninri","Enugu east","Enugu south","Enugu north","Ezeagu","Igbo Eze north","Igbi etiti","Nsukka","Oji river"
    						,"Undenu","Uzo Uwani","Udi"
    						};
        			return Enugu_lga;
    			}else if(stateSelected.equalsIgnoreCase("Gombe")) {
    				String[] gombe_lga= {
    						"Akko","Balanga","Billiri","Dukku","Dunakaye","Gombe","Kaltungo","Kwami","Nafada/Bajoga","Shomgom","Yamaltu/Deba"
    						};
        			return gombe_lga;
    			}else if(stateSelected.equalsIgnoreCase("Imo")) {
    				String[] Imo_lga= {
    						"Aboh-mbaise","Ahiazu-Mbaise","Ehime-Mbaino","Ezinhite, Ideato North","Ideato south","Ihitte/Uboma","Ikeduru","Isiala"
    						,"Isu","Mbaitoli","Ngor Okpala","Njaba","Nwangele","Nkwere","Obowo","Aguta","Ohaji Egbema","Okigwe"
    						,"Onuimo","Orlu","Orsu","Oru west","Oru","Owerri","Owerri North","Owerri south"
    						};
        			return Imo_lga;
    			}else if(stateSelected.equalsIgnoreCase("Jigawa")) {
    				String[] Jigawa_lga= {
    						"Auyo","Babura","Birnin- Kudu","Birniwa","Buji","Dutse","Garki","Gagarawa","Gumel","Guri","Gwaram","Gwiwa","Hadeji"
    						,"Jahun","Kafin-Hausa","kaugama","Kazaure","Kirikisamma","Birnin-magaji","Maigatari","Malamaduri","Miga"
    						,"Ringim","Roni","Sule Tankarka","Taura","Yankwasi"
        				};
        			return Jigawa_lga;
    			}else if(stateSelected.equalsIgnoreCase("Kaduna")) {
    				String[] Kaduna_lga= {
    						"Brnin Gwari","Chukun","Giwa","Kajuru","Igabi","Ikara","Jaba","Jema`a","Kachia","Kaduna North","Kaduna south"
    						,"Kagarok","Kauru","Kabau","Kudan","Kere","Makarfi","Sabongari","Sanga","Soba","Zangon-Kataf","Zaria"};
        			return Kaduna_lga;
    			}else if(stateSelected.equalsIgnoreCase("Abuja")) {
    				String[] Abuja_lga= {
    						"Abaji","Abuja Municipal","Bwari","Gwagwalada","Kuje","Kwali"
    						};
        			return Abuja_lga;
    			}else if(stateSelected.equalsIgnoreCase("Kano")) {
    				String[] Kano_lga= {
    						"Ajigi","Albasu","Bagwai","Bebeji","Bichi","Bunkure","Dala","Dambatta","Dawakin kudu","Dawakin tofa"
    						,"Doguwa","Fagge","Gabasawa","Garko","Garun mallam","Gaya","Gezawa","Gwale","Gwarzo","Kano","Karay",
    						"Kibiya","Kiru","Kumbtso","Kunch","Kura","Maidobi","Makoda","MInjibir Nassarawa","Rano","Rimin gado","Rogo"
    						,"Shanono","Sumaila","Takai","Tarauni","Tofa","Tsanyawa","Tudunwada","Ungogo","Warawa","Wudil",
    						};
        			return Kano_lga;
    			}else if(stateSelected.equalsIgnoreCase("Katsina")) {
    				String[] Katsina_lga= {
    						"Bakori","Batagarawa","Batsari","Baure","Bindawa","Charanchi","Dan- Musa","Dandume,Danja","Daura"
    						,"Dutsi","Dutsin `ma","Faskar","Funtua","Ingawa","Jibiya","Kafur","Kaita","Kankara","Kankiya","Katsina","Furfi",
    						"Kusada.Mai aduwa","Malumfashi","Mani","Mash","Matazu","Musawa","Rimi","Sabuwa","Safana","Sandamu","Zango"
    						};
        			return Katsina_lga;
    			}else if(stateSelected.equalsIgnoreCase("kebbi")) {
    				String[] Kebbi_lga= {
    						"Aliero","Arewa Dandi","Argungu","Augie","Bagudo","Birnin Kebbi","Bunza","Dandi","Danko"
    						,"Fakai","Gwandu","Jeda","Kalgo","Koko-besse","Maiyaama","Ngaski","Sakaba","Shanga","Suru","Wasugu","Yauri",
    						"Zuru"
    						};
        			return Kebbi_lga;
    			}else if(stateSelected.equalsIgnoreCase("Kogi")) {
    				String[] Kogi_lga= {
    						"Adavi","Ajaokuta","Ankpa","Bassa","Dekina","Yagba east","Ibaji","Idah","Igalamela","Ijumu","Kabba bunu","Kogi","Mopa muro","Ofu",
    						"Ogori magongo","Okehi","Okene","Olamaboro","Omala","Yagba west"
    						};
        			return Kogi_lga;
    			}else if(stateSelected.equalsIgnoreCase("Kwara")) {
    				String[] Kwara_lga= {
    						"Asa","Baruten","Ede","Ekiti","Ifelodun","Ilorin south","Ilorin west","Ilorin east","Irepodun","Isin","Kaiama","Moro","Offa","Oke ero",
    						"Oyun","Pategi"
    						};
        			return Kwara_lga;
    			}else if(stateSelected.equalsIgnoreCase("Lagos")) {
    				String[] lagos_lga= {
    						"Agege","Alimosho Ifelodun","Alimosho","Amuwo-Odofin","Apapa","Badagry","Epe","Eti-Osa","Ibeju- Lekki",
    						"Ifako/Ijaye","Ikeja","Ikorodu","Kosofe","Lagos Island","Lagos Mainland","Mushin","Ojo","Oshodi-Isolo",
    						"Shomolu","Surulere "
    						};
        			return lagos_lga;
    			}else if(stateSelected.equalsIgnoreCase("Nasarawa")) {
    				String[] Nasarawa_lga= {
    						"Akwanga","Awe","Doma","Karu","Keana","Keffi","Kokona","Lafia","Nassarawa","Nassarawa/Eggon","Obi","Toto","Wamba"
    						};
        			return Nasarawa_lga;
    			}else if(stateSelected.equalsIgnoreCase("Niger")) {
    				String[] Niger_lga= {
    						"Agaie","Agwara","Bida","Borgu","Bosso","Chanchanga","Edati","Gbako","Gurara","Kitcha","Kontagora"
    						,"Lapai","Lavun","Magama","Mariga","Mokwa","Moshegu","Muya","Paiko","Rafi","Shiroro","Suleija","Tawa-Wushishi"
    						};
        			return Niger_lga;
    			}else if(stateSelected.equalsIgnoreCase("Ogun")) {
    				String[] Ogun_lga= {
    						"Abeokuta south","Abeokuta north","Ado-odo/otta","Agbado south","Agbado north","Ewekoro","Idarapo","Ifo"
    						,"Ijebu east","Ijebu north","Ikenne","Ilugun Alaro","Imeko afon","Ipokia","Obafemi/owode","Odeda","Odogbolu","Ogun waterside"
    						,"Sagamu "
    						};
        			return Ogun_lga;
    			}else if(stateSelected.equalsIgnoreCase("Ondo")) {
    				String[] Ondo_lga= {
    						"Akoko north","Akoko north east","Akoko south east","Akoko south","Akure north","Akure","Idanre","Ifedore"
    						,"Ese odo","Ilaje","Ilaje oke-igbo","Irele","Odigbo","Okitipupa","Ondo","Ondo east","Ose","Owo "
    						};
        			return Ondo_lga;
    			}else if(stateSelected.equalsIgnoreCase("Osun")) {
    				String[] Osun_lga= {
    						"Atakumosa west","Atakumosa east","Ayeda-ade","Ayedire","Bolawaduro","Boripe","Ede","Ede north","Egbedore"
    						,"Ejigbo","Ife north","Ife central","Ife south","Ife east","Ifedayo","Ifelodun","Ilesha west","Ila-orangun",
    						"Ilesah east","Irepodun","Irewole","Isokan","Iwo","Obokun","Odo-otin","ola oluwa","olorunda","	Oriade","Orolu","Osogbo "
    						       };
        			return Osun_lga;
    			}else if(stateSelected.equalsIgnoreCase("Oyo")) {
    				String[] Oyo_lga= {
    						"Afijio","Akinyele","Attba","Atigbo","Egbeda","Ibadan","Ibadan north east","Ibadan central","Ibadan south east"
    						,"Ibadan west south","Ibarapa east","Ibarapa north","Ido","Ifedapo","Ifeloju","Irepo","Iseyin","Itesiwaju"
    						,"Iwajowa","Iwajowa olorunshogo","Kajola","Lagelu","Ogbomosho north","Ogbomosho south","Ogo oluwa","Oluyole","Ona ara"
    						,"Ore lope","Orire","Oyo east","Oyo west","Saki east","Saki west","Surulere "
    						};
        			return Oyo_lga;
    			}else if(stateSelected.equalsIgnoreCase("Plateau")) {
    				String[] Plateau_lga= {
    						"Barkin/ladi","Bassa","Bokkos","Jos north","Jos east","Jos south","Kanam","Kiyom","Langtang north","Langtang south"
    						,"Mangu","Mikang","Pankshin","Qua`an pan","Shendam","Wase "
    						};
        			return Plateau_lga;
    			}else if(stateSelected.equalsIgnoreCase("Rivers")) {
    				String[] Rivers_lga= {
    						"Abua/Odial","Ahoada west","Akuku toru","Andoni","Asari toru","Bonny","Degema","Eleme","Emohua","Etche","Gokana",
    						"Ikwerre","Oyigbo","Khana","Obio/Akpor","Ogba east /Edoni","Ogu/bolo","Okrika","Omumma","Opobo/Nkoro","Portharcourt","Tai "
    								};
        			return Rivers_lga;
    			}else if(stateSelected.equalsIgnoreCase("Sokoto")) {
    				String[] Sokoto_lga= {
    						"Binji","Bodinga","Dange/shuni","Gada","Goronyo","Gudu","Gwadabawa","Illela","Kebbe","Kware","Rabah","Sabon-Birni","Shagari","Silame","Sokoto south","Sokoto north"
    						,"Tambuwal","Tangaza","Tureta","Wamakko","Wurno","Yabo"
    						};
        			return Sokoto_lga;
    			}else if(stateSelected.equalsIgnoreCase("Taraba")) {
    				String[] Taraba_lga= {
    						"Akdo-kola","Bali","Donga","Gashaka","Gassol","Ibi","Jalingo","K/Lamido","Kurmi","lan","Sardauna","Tarum","Ussa","Wukari","Yorro","Zing"
    						};
        			return Taraba_lga;
    			}else if(stateSelected.equalsIgnoreCase("Yobe")) {
    				String[] Yobe_lga= {
    						"Borsari","Damaturu","Fika","Fune","Geidam","Gogaram","Gujba","Gulani","Jakusko","Karasuwa","Machina","Nagere","Nguru","Potiskum","Tarmua","Yunusari","Yusufari","Gashua"
    						};
        			return Yobe_lga;
    			}else if(stateSelected.equalsIgnoreCase("Zamfara")) {
    				String[] Zamfara_lga= {
    						"Anka","Bukkuyum","Dungudu","Chafe","Gummi","Gusau","Isa","Kaura Namoda","Mradun","Maru","Shinkafi","Talata Mafara","Zumi"
    						};
        			return Zamfara_lga;
    			}else {
    				return null;
    			}
    	
    	}
    
}
