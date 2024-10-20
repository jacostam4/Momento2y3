// Parametros: MunicipioCod String
//Return String

println("Municipio entrante: "+ MunicipioCod)

def codigosMap = [
        "ABEJORRAL" : "5002",
        "ABREGO" : "54003",
        "ABRIAQUI" : "5004",
        "ACACIAS" : "50006",
        "ACANDI" : "27006",
        "ACEVEDO" : "41006",
        "ACHI" : "13006",
        "AGRADO" : "41013",
        "AGUA DE DIOS" : "25001",
        "AGUACHICA" : "20011",
        "AGUADA" : "68013",
        "AGUADAS" : "17013",
        "AGUAZUL" : "85010",
        "AGUSTIN CODAZZI" : "20013",
        "AIPE" : "41016",
        "ALBAN" : "25019",
        "ALBAN" : "52019",
        "ALBANIA" : "18029",
        "ALBANIA" : "44035",
        "ALBANIA" : "68020",
        "ALCALA" : "76020",
        "ALDANA" : "52022",
        "ALEJANDRIA" : "5021",
        "ALGARROBO" : "47030",
        "ALGECIRAS" : "41020",
        "ALMAGUER" : "19022",
        "ALMEIDA" : "15022",
        "ALPUJARRA" : "73024",
        "ALTAMIRA" : "41026",
        "ALTO BAUDO" : "27025",
        "ALTOS DEL ROSARIO" : "13030",
        "ALVARADO" : "73026",
        "AMAGA" : "5030",
        "AMALFI" : "5031",
        "AMBALEMA" : "73030",
        "ANAPOIMA" : "25035",
        "ANCUYA" : "52036",
        "ANDALUCIA" : "76036",
        "ANDES" : "5034",
        "ANGELOPOLIS" : "5036",
        "ANGOSTURA" : "5038",
        "ANOLAIMA" : "25040",
        "ANORI" : "5040",
        "ANSERMA" : "17042",
        "ANSERMANUEVO" : "76041",
        "ANZA" : "5044",
        "ANZOATEGUI" : "73043",
        "APARTADO" : "5045",
        "APIA" : "66045",
        "APULO" : "25599",
        "AQUITANIA" : "15047",
        "ARACATACA" : "47053",
        "ARANZAZU" : "17050",
        "ARATOCA" : "68051",
        "ARAUCA" : "81001",
        "ARAUQUITA" : "81065",
        "ARBELAEZ" : "25053",
        "ARBOLEDA" : "52051",
        "ARBOLEDAS" : "54051",
        "ARBOLETES" : "5051",
        "ARCABUCO" : "15051",
        "ARENAL" : "13042",
        "ARGELIA" : "5055",
        "ARGELIA" : "19050",
        "ARGELIA" : "76054",
        "ARIGUANI" : "47058",
        "ARJONA" : "13052",
        "ARMENIA" : "5059",
        "ARMENIA" : "63001",
        "ARMERO" : "73055",
        "ARROYOHONDO" : "13062",
        "ASTREA" : "20032",
        "ATACO" : "73067",
        "ATRATO" : "27050",
        "AYAPEL" : "23068",
        "BAGADO" : "27073",
        "BAHIA SOLANO" : "27075",
        "BAJO BAUDO" : "27077",
        "BALBOA" : "19075",
        "BALBOA" : "66075",
        "BARANOA" : "8078",
        "BARAYA" : "41078",
        "BARBACOAS" : "52079",
        "BARBOSA" : "5079",
        "BARBOSA" : "68077",
        "BARICHARA" : "68079",
        "BARRANCA DE UPIA" : "50110",
        "BARRANCABERMEJA" : "68081",
        "BARRANCAS" : "44078",
        "BARRANCO DE LOBA" : "13074",
        "BARRANCO MINAS" : "94343",
        "BARRANQUILLA" : "8001",
        "BECERRIL" : "20045",
        "BELALCAZAR" : "17088",
        "BELEN" : "15087",
        "BELEN" : "52083",
        "BELEN DE LOS ANDAQUIES" : "18094",
        "BELEN DE UMBRIA" : "66088",
        "BELLO" : "5088",
        "BELMIRA" : "5086",
        "BELTRAN" : "25086",
        "BERBEO" : "15090",
        "BETANIA" : "5091",
        "BETEITIVA" : "15092",
        "BETULIA" : "5093",
        "BETULIA" : "68092",
        "BITUIMA" : "25095",
        "BOAVITA" : "15097",
        "BOCHALEMA" : "54099",
        "BOGOTÁ, D.C." : "11001",
        "BOJACA" : "25099",
        "BOJAYA" : "27099",
        "BOLIVAR" : "19100",
        "BOLIVAR" : "68101",
        "BOLIVAR" : "76100",
        "BOSCONIA" : "20060",
        "BOYACA" : "15104",
        "BRICEÑO" : "5107",
        "BRICEÑO" : "15106",
        "BUCARAMANGA" : "68001",
        "BUCARASICA" : "54109",
        "BUENAVENTURA" : "76109",
        "BUENAVISTA" : "15109",
        "BUENAVISTA" : "23079",
        "BUENAVISTA" : "63111",
        "BUENAVISTA" : "70110",
        "BUENOS AIRES" : "19110",
        "BUESACO" : "52110",
        "BUGALAGRANDE" : "76113",
        "BURITICA" : "5113",
        "BUSBANZA" : "15114",
        "CABRERA" : "25120",
        "CABRERA" : "68121",
        "CABUYARO" : "50124",
        "CACAHUAL" : "94886",
        "CACERES" : "5120",
        "CACHIPAY" : "25123",
        "CACHIRA" : "54128",
        "CACOTA" : "54125",
        "CAICEDO" : "5125",
        "CAICEDONIA" : "76122",
        "CAIMITO" : "70124",
        "CAJAMARCA" : "73124",
        "CAJIBIO" : "19130",
        "CAJICA" : "25126",
        "CALAMAR" : "13140",
        "CALAMAR" : "95015",
        "CALARCA" : "63130",
        "CALDAS" : "5129",
        "CALDAS" : "15131",
        "CALDONO" : "19137",
        "CALI" : "76001",
        "CALIFORNIA" : "68132",
        "CALIMA" : "76126",
        "CALOTO" : "19142",
        "CAMPAMENTO" : "5134",
        "CAMPO DE LA CRUZ" : "8137",
        "CAMPOALEGRE" : "41132",
        "CAMPOHERMOSO" : "15135",
        "CANALETE" : "23090",
        "CANDELARIA" : "8141",
        "CANDELARIA" : "76130",
        "CANTAGALLO" : "13160",
        "CAÑASGORDAS" : "5138",
        "CAPARRAPI" : "25148",
        "CAPITANEJO" : "68147",
        "CAQUEZA" : "25151",
        "CARACOLI" : "5142",
        "CARAMANTA" : "5145",
        "CARCASI" : "68152",
        "CAREPA" : "5147",
        "CARMEN DE APICALA" : "73148",
        "CARMEN DE CARUPA" : "25154",
        "CARMEN DEL DARIEN" : "27150",
        "CAROLINA" : "5150",
        "CARTAGENA" : "13001",
        "CARTAGENA DEL CHAIRA" : "18150",
        "CARTAGO" : "76147",
        "CARURU" : "97161",
        "CASABIANCA" : "73152",
        "CASTILLA LA NUEVA" : "50150",
        "CAUCASIA" : "5154",
        "CEPITA" : "68160",
        "CERETE" : "23162",
        "CERINZA" : "15162",
        "CERRITO" : "68162",
        "CERRO SAN ANTONIO" : "47161",
        "CERTEGUI" : "27160",
        "CHACHAGsI" : "52240",
        "CHAGUANI" : "25168",
        "CHALAN" : "70230",
        "CHAMEZA" : "85015",
        "CHAPARRAL" : "73168",
        "CHARALA" : "68167",
        "CHARTA" : "68169",
        "CHIA" : "25175",
        "CHIBOLO" : "5172",
        "CHIGORODO" : "68176",
        "CHIMA" : "23168",
        "CHIMA" : "20175",
        "CHIMICHAGUA" : "54172",
        "CHINACOTA" : "15172",
        "CHINAVITA" : "17174",
        "CHINCHINA" : "23182",
        "CHINU" : "25178",
        "CHIPAQUE" : "68179",
        "CHIPATA" : "15176",
        "CHIQUINQUIRA" : "15232",
        "CHIQUIZA" : "20178",
        "CHIRIGUANA" : "15180",
        "CHISCAS" : "15183",
        "CHITA" : "54174",
        "CHITAGA" : "15185",
        "CHITARAQUE" : "15187",
        "CHIVATA" : "47170",
        "CHIVOR" : "15236",
        "CHOACHI" : "25181",
        "CHOCONTA" : "25183",
        "CICUCO" : "13188",
        "CIENAGA" : "47189",
        "CIENAGA DE ORO" : "23189",
        "CIENEGA" : "15189",
        "CIMITARRA" : "68190",
        "CIRCASIA" : "63190",
        "CISNEROS" : "5190",
        "CIUDAD BOLIVAR" : "5101",
        "CLEMENCIA" : "13222",
        "COCORNA" : "5197",
        "COELLO" : "73200",
        "COGUA" : "25200",
        "COLOMBIA" : "41206",
        "COLON" : "52203",
        "COLON" : "86219",
        "COLOSO" : "70204",
        "COMBITA" : "15204",
        "CONCEPCION" : "5206",
        "CONCEPCION" : "68207",
        "CONCORDIA" : "5209",
        "CONCORDIA" : "47205",
        "CONDOTO" : "27205",
        "CONFINES" : "68209",
        "CONSACA" : "52207",
        "CONTADERO" : "52210",
        "CONTRATACION" : "68211",
        "CONVENCION" : "54206",
        "COPACABANA" : "5212",
        "COPER" : "15212",
        "CORDOBA" : "13212",
        "CORDOBA" : "52215",
        "CORDOBA" : "63212",
        "CORINTO" : "19212",
        "COROMORO" : "68217",
        "COROZAL" : "70215",
        "CORRALES" : "15215",
        "COTA" : "25214",
        "COTORRA" : "23300",
        "COVARACHIA" : "15218",
        "COVEÑAS" : "70221",
        "COYAIMA" : "73217",
        "CRAVO NORTE" : "81220",
        "CUASPUD" : "52224",
        "CUBARA" : "15223",
        "CUBARRAL" : "50223",
        "CUCAITA" : "15224",
        "CUCUNUBA" : "25224",
        "CUCUTA" : "54223",
        "CUCUTILLA" : "15226",
        "CUITIVA" : "50226",
        "CUMARAL" : "99773",
        "CUMARIBO" : "52227",
        "CUMBAL" : "52233",
        "CUMBITARA" : "73226",
        "CUNDAY" : "18205",
        "CURILLO" : "68229",
        "CURITI" : "20228",
        "CURUMANI" : "5234",
        "DABEIBA" : "76233",
        "DAGUA" : "44090",
        "DIBULLA" : "44098",
        "DISTRACCION" : "73236",
        "DOLORES" : "5237",
        "DON MATIAS" : "66170",
        "DOSQUEBRADAS" : "15238",
        "DUITAMA" : "54239",
        "DURANIA" : "5240",
        "EBEJICO" : "76243",
        "EL AGUILA" : "5250",
        "EL BAGRE" : "47245",
        "EL BANCO" : "76246",
        "EL CAIRO" : "50245",
        "EL CALVARIO" : "27135",
        "EL CANTON DEL SAN PABLO" : "54245",
        "EL CARMEN" : "27245",
        "EL CARMEN DE ATRATO" : "13244",
        "EL CARMEN DE BOLIVAR" : "68235",
        "EL CARMEN DE CHUCURI" : "5148",
        "EL CARMEN DE VIBORAL" : "50251",
        "EL CASTILLO" : "76248",
        "EL CERRITO" : "52250",
        "EL CHARCO" : "15244",
        "EL COCUY" : "25245",
        "EL COLEGIO" : "20238",
        "EL COPEY" : "18247",
        "EL DONCELLO" : "50270",
        "EL DORADO" : "76250",
        "EL DOVIO" : "91263",
        "EL ENCANTO" : "15248",
        "EL ESPINO" : "68245",
        "EL GUACAMAYO" : "13248",
        "EL GUAMO" : "27250",
        "EL LITORAL DEL SAN JUAN" : "44110",
        "EL MOLINO" : "20250",
        "EL PASO" : "18256",
        "EL PAUJIL" : "52254",
        "EL PEÑOL" : "13268",
        "EL PEÑON" : "25258",
        "EL PEÑON" : "68250",
        "EL PEÑON" : "47258",
        "EL PIÑON" : "68255",
        "EL PLAYON" : "47268",
        "EL RETEN" : "95025",
        "EL RETORNO" : "70233",
        "EL ROBLE" : "25260",
        "EL ROSAL" : "52256",
        "EL ROSARIO" : "5697",
        "EL SANTUARIO" : "52258",
        "EL TABLON DE GOMEZ" : "19256",
        "EL TAMBO" : "52260",
        "EL TAMBO" : "54250",
        "EL TARRA" : "54261",
        "EL ZULIA" : "41244",
        "ELIAS" : "68264",
        "ENCINO" : "68266",
        "ENCISO" : "5264",
        "ENTRERRIOS" : "5266",
        "ENVIGADO" : "73268",
        "ESPINAL" : "25269",
        "FACATATIVA" : "73270",
        "FALAN" : "17272",
        "FILADELFIA" : "63272",
        "FILANDIA" : "15272",
        "FIRAVITOBA" : "73275",
        "FLANDES" : "18001",
        "FLORENCIA" : "19290",
        "FLORENCIA" : "15276",
        "FLORESTA" : "68271",
        "FLORIAN" : "76275",
        "FLORIDA" : "68276",
        "FLORIDABLANCA" : "25279",
        "FOMEQUE" : "44279",
        "FONSECA" : "81300",
        "FORTUL" : "25281",
        "FOSCA" : "52520",
        "FRANCISCO PIZARRO" : "5282",
        "FREDONIA" : "73283",
        "FRESNO" : "5284",
        "FRONTINO" : "50287",
        "FUENTE DE ORO" : "47288",
        "FUNDACION" : "52287",
        "FUNES" : "25286",
        "FUNZA" : "25288",
        "FUQUENE" : "25290",
        "FUSAGASUGA" : "25293",
        "GACHALA" : "25295",
        "GACHANCIPA" : "15293",
        "GACHANTIVA" : "25297",
        "GACHETA" : "68296",
        "GALAN" : "8296",
        "GALAPA" : "70235",
        "GALERAS" : "25299",
        "GAMA" : "20295",
        "GAMARRA" : "68298",
        "GAMBITA" : "15296",
        "GAMEZA" : "15299",
        "GARAGOA" : "41298",
        "GARZON" : "63302",
        "GENOVA" : "41306",
        "GIGANTE" : "76306",
        "GINEBRA" : "5306",
        "GIRALDO" : "25307",
        "GIRARDOT" : "5308",
        "GIRARDOTA" : "68307",
        "GIRON" : "5310",
        "GOMEZ PLATA" : "20310",
        "GONZALEZ" : "54313",
        "GRAMALOTE" : "5313",
        "GRANADA" : "25312",
        "GRANADA" : "50313",
        "GRANADA" : "68318",
        "GsEPSA" : "15317",
        "GsICAN" : "76318",
        "GUACA" : "19300",
        "GUACAMAYAS" : "25317",
        "GUACARI" : "52317",
        "GUACHENE" : "76111",
        "GUACHETA" : "5315",
        "GUACHUCAL" : "41319",
        "GUADALAJARA DE BUGA" : "68320",
        "GUADALUPE" : "25320",
        "GUADALUPE" : "52320",
        "GUADALUPE" : "52323",
        "GUADUAS" : "47318",
        "GUAITARILLA" : "50318",
        "GUALMATAN" : "73319",
        "GUAMAL" : "19318",
        "GUAMAL" : "68322",
        "GUAMO" : "70265",
        "GUAPI" : "5318",
        "GUAPOTA" : "25322",
        "GUARANDA" : "5321",
        "GUARNE" : "25324",
        "GUASCA" : "25326",
        "GUATAPE" : "15322",
        "GUATAQUI" : "66318",
        "GUATAVITA" : "68324",
        "GUATEQUE" : "25328",
        "GUATICA" : "25335",
        "GUAVATA" : "15325",
        "GUAYABAL DE SIQUIMA" : "68327",
        "GUAYABETAL" : "15332",
        "GUAYATA" : "25339",
        "GUTIERREZ" : "54344",
        "HACARI" : "13300",
        "HATILLO DE LOBA" : "68344",
        "HATO" : "85125",
        "HATO COROZAL" : "44378",
        "HATONUEVO" : "5347",
        "HELICONIA" : "54347",
        "HERRAN" : "73347",
        "HERVEO" : "5353",
        "HISPANIA" : "41349",
        "HOBO" : "73349",
        "HONDA" : "73001",
        "IBAGUE" : "73352",
        "ICONONZO" : "52352",
        "ILES" : "52354",
        "IMUES" : "94001",
        "INIRIDA" : "19355",
        "INZA" : "52356",
        "IPIALES" : "41357",
        "IQUIRA" : "41359",
        "ISNOS" : "27361",
        "ISTMINA" : "5360",
        "ITAGUI" : "5361",
        "ITUANGO" : "15362",
        "IZA" : "19364",
        "JAMBALO" : "76364",
        "JAMUNDI" : "5364",
        "JARDIN" : "15367",
        "JENESANO" : "5368",
        "JERICO" : "15368",
        "JERICO" : "25368",
        "JERUSALEN" : "68368",
        "JESUS MARIA" : "68370",
        "JORDAN" : "8372",
        "JUAN DE ACOSTA" : "25372",
        "JUNIN" : "27372",
        "JURADO" : "23350",
        "LA APARTADA" : "41378",
        "LA ARGENTINA" : "68377",
        "LA BELLEZA" : "25377",
        "LA CALERA" : "15380",
        "LA CAPILLA" : "5376",
        "LA CEJA" : "66383",
        "LA CELIA" : "91405",
        "LA CHORRERA" : "52378",
        "LA CRUZ" : "76377",
        "LA CUMBRE" : "17380",
        "LA DORADA" : "54385",
        "LA ESPERANZA" : "5380",
        "LA ESTRELLA" : "52381",
        "LA FLORIDA" : "20383",
        "LA GLORIA" : "94885",
        "LA GUADALUPE" : "20400",
        "LA JAGUA DE IBIRICO" : "44420",
        "LA JAGUA DEL PILAR" : "52385",
        "LA LLANADA" : "50350",
        "LA MACARENA" : "17388",
        "LA MERCED" : "25386",
        "LA MESA" : "18410",
        "LA MONTAÑITA" : "25394",
        "LA PALMA" : "20621",
        "LA PAZ" : "68397",
        "LA PAZ" : "91407",
        "LA PEDRERA" : "25398",
        "LA PEÑA" : "5390",
        "LA PINTADA" : "41396",
        "LA PLATA" : "54398",
        "LA PLAYA" : "99524",
        "LA PRIMAVERA" : "85136",
        "LA SALINA" : "19392",
        "LA SIERRA" : "63401",
        "LA TEBAIDA" : "52390",
        "LA TOLA" : "5400",
        "LA UNION" : "52399",
        "LA UNION" : "70400",
        "LA UNION" : "76400",
        "LA UNION" : "15403",
        "LA UVITA" : "19397",
        "LA VEGA" : "25402",
        "LA VEGA" : "15401",
        "LA VICTORIA" : "76403",
        "LA VICTORIA" : "91430",
        "LA VICTORIA" : "66400",
        "LA VIRGINIA" : "54377",
        "LABATECA" : "15377",
        "LABRANZAGRANDE" : "68385",
        "LANDAZURI" : "68406",
        "LEBRIJA" : "52405",
        "LEGUIZAMO" : "50400",
        "LEIVA" : "25407",
        "LEJANIAS" : "73408",
        "LENGUAZAQUE" : "91001",
        "LERIDA" : "73411",
        "LETICIA" : "5411",
        "LIBANO" : "52411",
        "LIBORINA" : "27413",
        "LINARES" : "19418",
        "LLORO" : "23417",
        "LOPEZ" : "52418",
        "LORICA" : "23419",
        "LOS ANDES" : "70418",
        "LOS CORDOBAS" : "54405",
        "LOS PALMITOS" : "68418",
        "LOS PATIOS" : "54418",
        "LOS SANTOS" : "8421",
        "LOURDES" : "15425",
        "LURUACO" : "68425",
        "MACANAL" : "5425",
        "MACARAVITA" : "25426",
        "MACEO" : "25430",
        "MACHETA" : "13430",
        "MADRID" : "52427",
        "MAGANGUE" : "13433",
        "MAGsI" : "44430",
        "MAHATES" : "70429",
        "MAICAO" : "68432",
        "MAJAGUAL" : "8433",
        "MALAGA" : "52435",
        "MALAMBO" : "8436",
        "MALLAMA" : "44560",
        "MANATI" : "20443",
        "MANAURE" : "85139",
        "MANAURE" : "17001",
        "MANI" : "25436",
        "MANIZALES" : "17433",
        "MANTA" : "50325",
        "MANZANARES" : "13440",
        "MAPIRIPAN" : "13442",
        "MAPIRIPANA" : "5440",
        "MARGARITA" : "15442",
        "MARIA LA BAJA" : "17442",
        "MARINILLA" : "17444",
        "MARIPI" : "66440",
        "MARIQUITA" : "17446",
        "MARMATO" : "68444",
        "MARQUETALIA" : "5001",
        "MARSELLA" : "25438",
        "MARULANDA" : "27425",
        "MATANZA" : "27430",
        "MEDELLIN" : "27450",
        "MEDINA" : "73449",
        "MEDIO ATRATO" : "19450",
        "MEDIO BAUDO" : "50330",
        "MEDIO SAN JUAN" : "18460",
        "MELGAR" : "15455",
        "MERCADERES" : "95200",
        "MESETAS" : "19455",
        "MILAN" : "91460",
        "MIRAFLORES" : "66456",
        "MIRAFLORES" : "97001",
        "MIRANDA" : "86001",
        "MIRITI - PARANA" : "68464",
        "MISTRATO" : "68468",
        "MITU" : "23464",
        "MOCOA" : "13468",
        "MOGOTES" : "15464",
        "MOLAGAVITA" : "15466",
        "MOMIL" : "15469",
        "MOMPOS" : "5467",
        "MONGUA" : "13458",
        "MONGUI" : "23466",
        "MONIQUIRA" : "63470",
        "MONTEBELLO" : "23001",
        "MONTECRISTO" : "85162",
        "MONTELIBANO" : "23500",
        "MONTENEGRO" : "13473",
        "MONTERIA" : "19473",
        "MONTERREY" : "18479",
        "MOÑITOS" : "94888",
        "MORALES" : "70473",
        "MORALES" : "25473",
        "MORELIA" : "52473",
        "MORICHAL" : "15476",
        "MORROA" : "73461",
        "MOSQUERA" : "5475",
        "MOSQUERA" : "5480",
        "MOTAVITA" : "54480",
        "MURILLO" : "15480",
        "MURINDO" : "5483",
        "MUTATA" : "25483",
        "MUTISCUA" : "52480",
        "MUZO" : "41483",
        "NARIÑO" : "73483",
        "NARIÑO" : "5495",
        "NARIÑO" : "5490",
        "NATAGA" : "17486",
        "NATAGAIMA" : "41001",
        "NECHI" : "25486",
        "NECOCLI" : "25488",
        "NEIRA" : "25489",
        "NEIVA" : "15491",
        "NEMOCON" : "25491",
        "NILO" : "17495",
        "NIMAIMA" : "13490",
        "NOBSA" : "27491",
        "NOCAIMA" : "47460",
        "NORCASIA" : "15494",
        "NOROSI" : "85225",
        "NOVITA" : "27495",
        "NUEVA GRANADA" : "76497",
        "NUEVO COLON" : "68498",
        "NUNCHIA" : "54498",
        "NUQUI" : "68500",
        "OBANDO" : "15500",
        "OCAMONTE" : "5501",
        "OCAÑA" : "52490",
        "OIBA" : "68502",
        "OICATA" : "41503",
        "OLAYA" : "86320",
        "OLAYA HERRERA" : "85230",
        "ONZAGA" : "73504",
        "OPORAPA" : "52506",
        "ORITO" : "15507",
        "OROCUE" : "70508",
        "ORTEGA" : "15511",
        "OSPINA" : "25513",
        "OTANCHE" : "97511",
        "OVEJAS" : "17513",
        "PACHAVITA" : "19513",
        "PACHO" : "15514",
        "PACOA" : "19517",
        "PACORA" : "41518",
        "PADILLA" : "20517",
        "PAEZ" : "25518",
        "PAEZ" : "15516",
        "PAICOL" : "15518",
        "PAILITAS" : "41524",
        "PAIME" : "17524",
        "PAIPA" : "41530",
        "PAJARITO" : "68522",
        "PALERMO" : "8520",
        "PALESTINA" : "68524",
        "PALESTINA" : "76520",
        "PALMAR" : "70523",
        "PALMAR DE VARELA" : "73520",
        "PALMAS DEL SOCORRO" : "54518",
        "PALMIRA" : "54520",
        "PALMITO" : "94887",
        "PALOCABILDO" : "25524",
        "PAMPLONA" : "15522",
        "PAMPLONITA" : "97777",
        "PANA PANA" : "68533",
        "PANDI" : "25530",
        "PANQUEBA" : "25535",
        "PAPUNAUA" : "52001",
        "PARAMO" : "19532",
        "PARATEBUENO" : "15531",
        "PASCA" : "15533",
        "PASTO" : "85250",
        "PATIA" : "15537",
        "PAUNA" : "47541",
        "PAYA" : "20550",
        "PAZ DE ARIPORO" : "17541",
        "PAZ DE RIO" : "5541",
        "PEÐOL" : "5543",
        "PEDRAZA" : "66001",
        "PELAYA" : "15542",
        "PENSILVANIA" : "19533",
        "PEQUE" : "68547",
        "PEREIRA" : "73547",
        "PESCA" : "19548",
        "PIAMONTE" : "63548",
        "PIEDECUESTA" : "47545",
        "PIEDRAS" : "68549",
        "PIENDAMO" : "13549",
        "PIJAO" : "8549",
        "PIJIÑO DEL CARMEN" : "15550",
        "PINCHOTE" : "41548",
        "PINILLOS" : "41551",
        "PIOJO" : "47551",
        "PISBA" : "73555",
        "PITAL" : "23555",
        "PITALITO" : "47555",
        "PIVIJAY" : "52540",
        "PLANADAS" : "8558",
        "PLANETA RICA" : "8560",
        "PLATO" : "19001",
        "POLICARPA" : "85263",
        "POLONUEVO" : "52560",
        "PONEDERA" : "76563",
        "POPAYAN" : "73563",
        "PORE" : "52565",
        "POTOSI" : "88564",
        "PRADERA" : "20570",
        "PRADO" : "23570",
        "PROVIDENCIA" : "66572",
        "PROVIDENCIA" : "5576",
        "PUEBLO BELLO" : "47570",
        "PUEBLO NUEVO" : "68572",
        "PUEBLO RICO" : "52573",
        "PUEBLORRICO" : "91530",
        "PUEBLOVIEJO" : "91536",
        "PUENTE NACIONAL" : "86568",
        "PUERRES" : "5579",
        "PUERTO ALEGRIA" : "15572",
        "PUERTO ARICA" : "86569",
        "PUERTO ASIS" : "99001",
        "PUERTO BERRIO" : "8573",
        "PUERTO BOYACA" : "94884",
        "PUERTO CAICEDO" : "50450",
        "PUERTO CARREÑO" : "23574",
        "PUERTO COLOMBIA" : "50568",
        "PUERTO COLOMBIA" : "86571",
        "PUERTO CONCORDIA" : "86573",
        "PUERTO ESCONDIDO" : "23580",
        "PUERTO GAITAN" : "50577",
        "PUERTO GUZMAN" : "50573",
        "PUERTO LIBERTADOR" : "5585",
        "PUERTO LLERAS" : "91540",
        "PUERTO LOPEZ" : "68573",
        "PUERTO NARE" : "18592",
        "PUERTO NARIÑO" : "50590",
        "PUERTO PARRA" : "81591",
        "PUERTO RICO" : "25572",
        "PUERTO RICO" : "54553",
        "PUERTO RONDON" : "91669",
        "PUERTO SALGAR" : "19573",
        "PUERTO SANTANDER" : "5591",
        "PUERTO SANTANDER" : "68575",
        "PUERTO TEJADA" : "25580",
        "PUERTO TRIUNFO" : "52585",
        "PUERTO WILCHES" : "19585",
        "PULI" : "73585",
        "PUPIALES" : "23586",
        "PURACE" : "25592",
        "PURIFICACION" : "25594",
        "PURISIMA" : "27001",
        "QUEBRADANEGRA" : "63594",
        "QUETAME" : "66594",
        "QUIBDO" : "15580",
        "QUIMBAYA" : "25596",
        "QUINCHIA" : "54599",
        "QUIPAMA" : "15599",
        "QUIPILE" : "15600",
        "RAGONVALIA" : "85279",
        "RAMIRIQUI" : "13580",
        "RAQUIRA" : "5604",
        "RECETOR" : "47605",
        "REGIDOR" : "8606",
        "REMEDIOS" : "50606",
        "REMOLINO" : "76606",
        "REPELON" : "5607",
        "RESTREPO" : "25612",
        "RESTREPO" : "52612",
        "RETIRO" : "20614",
        "RICAURTE" : "27580",
        "RICAURTE" : "27600",
        "RIO DE ORO" : "13600",
        "RIO IRO" : "73616",
        "RIO QUITO" : "76616",
        "RIO VIEJO" : "44001",
        "RIOBLANCO" : "5615",
        "RIOFRIO" : "68615",
        "RIOHACHA" : "17614",
        "RIONEGRO" : "27615",
        "RIONEGRO" : "17616",
        "RIOSUCIO" : "41615",
        "RIOSUCIO" : "52621",
        "RISARALDA" : "76622",
        "RIVERA" : "73622",
        "ROBERTO PAYAN" : "15621",
        "ROLDANILLO" : "19622",
        "RONCESVALLES" : "73624",
        "RONDON" : "68655",
        "ROSAS" : "8634",
        "ROVIRA" : "5628",
        "SABANA DE TORRES" : "8638",
        "SABANAGRANDE" : "85300",
        "SABANALARGA" : "47660",
        "SABANALARGA" : "5631",
        "SABANALARGA" : "15632",
        "SABANAS DE SAN ANGEL" : "85315",
        "SABANETA" : "15638",
        "SABOYA" : "23660",
        "SACAMA" : "41660",
        "SACHICA" : "17653",
        "SAHAGUN" : "47675",
        "SALADOBLANCO" : "54660",
        "SALAMINA" : "73671",
        "SALAMINA" : "63690",
        "SALAZAR" : "5642",
        "SALDAÑA" : "15646",
        "SALENTO" : "17662",
        "SALGAR" : "52678",
        "SAMACA" : "70670",
        "SAMANA" : "41668",
        "SAMANIEGO" : "20710",
        "SAMPUES" : "68669",
        "SAN AGUSTIN" : "88001",
        "SAN ALBERTO" : "5647",
        "SAN ANDRES" : "23670",
        "SAN ANDRES" : "52835",
        "SAN ANDRES DE CUERQUIA" : "23672",
        "SAN ANDRES DE TUMACO" : "73675",
        "SAN ANDRES SOTAVENTO" : "25645",
        "SAN ANTERO" : "68673",
        "SAN ANTONIO" : "70678",
        "SAN ANTONIO DEL TEQUENDAMA" : "25649",
        "SAN BENITO" : "52685",
        "SAN BENITO ABAD" : "23675",
        "SAN BERNARDO" : "54670",
        "SAN BERNARDO" : "5649",
        "SAN BERNARDO DEL VIENTO" : "23678",
        "SAN CALIXTO" : "50680",
        "SAN CARLOS" : "25653",
        "SAN CARLOS" : "54673",
        "SAN CARLOS DE GUAROA" : "13620",
        "SAN CAYETANO" : "20750",
        "SAN CAYETANO" : "15660",
        "SAN CRISTOBAL" : "13647",
        "SAN DIEGO" : "94883",
        "SAN EDUARDO" : "13650",
        "SAN ESTANISLAO" : "5652",
        "SAN FELIPE" : "25658",
        "SAN FERNANDO" : "86755",
        "SAN FRANCISCO" : "68679",
        "SAN FRANCISCO" : "13654",
        "SAN FRANCISCO" : "13655",
        "SAN GIL" : "5656",
        "SAN JACINTO" : "68682",
        "SAN JACINTO DEL CAUCA" : "17665",
        "SAN JERONIMO" : "54001",
        "SAN JOAQUIN" : "5658",
        "SAN JOSE" : "68684",
        "SAN JOSE DE LA MONTAÑA" : "15664",
        "SAN JOSE DE MIRANDA" : "70823",
        "SAN JOSE DE PARE" : "23682",
        "SAN JOSE DE URE" : "18610",
        "SAN JOSE DEL FRAGUA" : "95001",
        "SAN JOSE DEL GUAVIARE" : "27660",
        "SAN JOSE DEL PALMAR" : "50683",
        "SAN JUAN DE ARAMA" : "70702",
        "SAN JUAN DE BETULIA" : "25662",
        "SAN JUAN DE RIO SECO" : "5659",
        "SAN JUAN DE URABA" : "44650",
        "SAN JUAN DEL CESAR" : "13657",
        "SAN JUAN NEPOMUCENO" : "50686",
        "SAN JUANITO" : "52687",
        "SAN LORENZO" : "5660",
        "SAN LUIS" : "73678",
        "SAN LUIS" : "15667",
        "SAN LUIS DE GACENO" : "85325",
        "SAN LUIS DE PALENQUE" : "70742",
        "SAN LUIS DE SINCE" : "70708",
        "SAN MARCOS" : "20770",
        "SAN MARTIN" : "50689",
        "SAN MARTIN" : "13667",
        "SAN MARTIN DE LOBA" : "15673",
        "SAN MATEO" : "68686",
        "SAN MIGUEL" : "86757",
        "SAN MIGUEL" : "15676",
        "SAN MIGUEL DE SEMA" : "70713",
        "SAN ONOFRE" : "13670",
        "SAN PABLO" : "52693",
        "SAN PABLO" : "15681",
        "SAN PABLO DE BORBUR" : "70717",
        "SAN PEDRO" : "76670",
        "SAN PEDRO" : "52694",
        "SAN PEDRO" : "5664",
        "SAN PEDRO DE CARTAGO" : "5665",
        "SAN PEDRO DE URABA" : "23686",
        "SAN PELAYO" : "5667",
        "SAN RAFAEL" : "5670",
        "SAN ROQUE" : "19693",
        "SAN SEBASTIAN" : "47692",
        "SAN SEBASTIAN DE BUENAVISTA" : "73443",
        "SAN VICENTE" : "68689",
        "SAN VICENTE DE CHUCURI" : "18753",
        "SAN VICENTE DEL CAGUAN" : "5674",
        "SAN ZENON" : "47703",
        "SANDONA" : "52683",
        "SANTA ANA" : "47707",
        "SANTA BARBARA" : "5679",
        "SANTA BARBARA" : "52696",
        "SANTA BARBARA" : "68705",
        "SANTA BARBARA DE PINTO" : "47720",
        "SANTA CATALINA" : "13673",
        "SANTA HELENA DEL OPON" : "5042",
        "SANTA ISABEL" : "68720",
        "SANTA LUCIA" : "73686",
        "SANTA MARIA" : "8675",
        "SANTA MARIA" : "15690",
        "SANTA MARTA" : "41676",
        "SANTA ROSA" : "47001",
        "SANTA ROSA" : "13683",
        "SANTA ROSA DE CABAL" : "19701",
        "SANTA ROSA DE OSOS" : "66682",
        "SANTA ROSA DE VITERBO" : "5686",
        "SANTA ROSA DEL SUR" : "15693",
        "SANTA ROSALIA" : "13688",
        "SANTA SOFIA" : "99624",
        "SANTACRUZ" : "15696",
        "SANTAFE DE ANTIOQUIA" : "52699",
        "SANTANA" : "15686",
        "SANTANDER DE QUILICHAO" : "19698",
        "SANTIAGO" : "54680",
        "SANTIAGO" : "86760",
        "SANTIAGO DE TOLU" : "70820",
        "SANTO DOMINGO" : "5690",
        "SANTO TOMAS" : "8685",
        "SANTUARIO" : "66687",
        "SAPUYES" : "52720",
        "SARAVENA" : "81736",
        "SARDINATA" : "54720",
        "SASAIMA" : "25718",
        "SATIVANORTE" : "15720",
        "SATIVASUR" : "15723",
        "SEGOVIA" : "5736",
        "SESQUILE" : "25736",
        "SEVILLA" : "76736",
        "SIACHOQUE" : "15740",
        "SIBATE" : "25740",
        "SIBUNDOY" : "86749",
        "SILOS" : "54743",
        "SILVANIA" : "25743",
        "SILVIA" : "19743",
        "SIMACOTA" : "68745",
        "SIMIJACA" : "25745",
        "SIMITI" : "13744",
        "SINCELEJO" : "70001",
        "SIPI" : "27745",
        "SITIONUEVO" : "47745",
        "SOACHA" : "25754",
        "SOATA" : "15753",
        "SOCHA" : "15757",
        "SOCORRO" : "68755",
        "SOCOTA" : "15755",
        "SOGAMOSO" : "15759",
        "SOLANO" : "18756",
        "SOLEDAD" : "8758",
        "SOLITA" : "18785",
        "SOMONDOCO" : "15761",
        "SONSON" : "5756",
        "SOPETRAN" : "5761",
        "SOPLAVIENTO" : "13760",
        "SOPO" : "25758",
        "SORA" : "15762",
        "SORACA" : "15764",
        "SOTAQUIRA" : "15763",
        "SOTARA" : "19760",
        "SUAITA" : "68770",
        "SUAN" : "8770",
        "SUAREZ" : "19780",
        "SUAREZ" : "73770",
        "SUAZA" : "41770",
        "SUBACHOQUE" : "25769",
        "SUCRE" : "19785",
        "SUCRE" : "68773",
        "SUCRE" : "70771",
        "SUESCA" : "25772",
        "SUPATA" : "25777",
        "SUPIA" : "17777",
        "SURATA" : "68780",
        "SUSA" : "25779",
        "SUSACON" : "15774",
        "SUTAMARCHAN" : "15776",
        "SUTATAUSA" : "25781",
        "SUTATENZA" : "15778",
        "TABIO" : "25785",
        "TADO" : "27787",
        "TALAIGUA NUEVO" : "13780",
        "TAMALAMEQUE" : "20787",
        "TAMARA" : "85400",
        "TAME" : "81794",
        "TAMESIS" : "5789",
        "TAMINANGO" : "52786",
        "TANGUA" : "52788",
        "TARAIRA" : "97666",
        "TARAPACA" : "91798",
        "TARAZA" : "5790",
        "TARQUI" : "41791",
        "TARSO" : "5792",
        "TASCO" : "15790",
        "TAURAMENA" : "85410",
        "TAUSA" : "25793",
        "TELLO" : "41799",
        "TENA" : "25797",
        "TENERIFE" : "47798",
        "TENJO" : "25799",
        "TENZA" : "15798",
        "TEORAMA" : "54800",
        "TERUEL" : "41801",
        "TESALIA" : "41797",
        "TIBACUY" : "25805",
        "TIBANA" : "15804",
        "TIBASOSA" : "15806",
        "TIBIRITA" : "25807",
        "TIBU" : "54810",
        "TIERRALTA" : "23807",
        "TIMANA" : "41807",
        "TIMBIO" : "19807",
        "TIMBIQUI" : "19809",
        "TINJACA" : "15808",
        "TIPACOQUE" : "15810",
        "TIQUISIO" : "13810",
        "TITIRIBI" : "5809",
        "TOCA" : "15814",
        "TOCAIMA" : "25815",
        "TOCANCIPA" : "25817",
        "TOGsI" : "15816",
        "TOLEDO" : "5819",
        "TOLEDO" : "54820",
        "TONA" : "68820",
        "TOPAGA" : "15820",
        "TOPAIPI" : "25823",
        "TORIBIO" : "19821",
        "TORO" : "76823",
        "TOTA" : "15822",
        "TOTORO" : "19824",
        "TRINIDAD" : "85430",
        "TRUJILLO" : "76828",
        "TUBARA" : "8832",
        "TUCHÍN" : "23815",
        "TULUA" : "76834",
        "TUNJA" : "15001",
        "TUNUNGUA" : "15832",
        "TUQUERRES" : "52838",
        "TURBACO" : "13836",
        "TURBANA" : "13838",
        "TURBO" : "5837",
        "TURMEQUE" : "15835",
        "TUTA" : "15837",
        "TUTAZA" : "15839",
        "UBALA" : "25839",
        "UBAQUE" : "25841",
        "ULLOA" : "76845",
        "UMBITA" : "15842",
        "UNE" : "25845",
        "UNGUIA" : "27800",
        "UNION PANAMERICANA" : "27810",
        "URAMITA" : "5842",
        "URIBE" : "50370",
        "URIBIA" : "44847",
        "URRAO" : "5847",
        "URUMITA" : "44855",
        "USIACURI" : "8849",
        "UTICA" : "25851",
        "VALDIVIA" : "5854",
        "VALENCIA" : "23855",
        "VALLE DE SAN JOSE" : "68855",
        "VALLE DE SAN JUAN" : "73854",
        "VALLE DEL GUAMUEZ" : "86865",
        "VALLEDUPAR" : "20001",
        "VALPARAISO" : "5856",
        "VALPARAISO" : "18860",
        "VEGACHI" : "5858",
        "VELEZ" : "68861",
        "VENADILLO" : "73861",
        "VENECIA" : "5861",
        "VENECIA" : "25506",
        "VENTAQUEMADA" : "15861",
        "VERGARA" : "25862",
        "VERSALLES" : "76863",
        "VETAS" : "68867",
        "VIANI" : "25867",
        "VICTORIA" : "17867",
        "VIGIA DEL FUERTE" : "5873",
        "VIJES" : "76869",
        "VILLA CARO" : "54871",
        "VILLA DE LEYVA" : "15407",
        "VILLA DE SAN DIEGO DE UBATE" : "25843",
        "VILLA DEL ROSARIO" : "54874",
        "VILLA RICA" : "19845",
        "VILLAGARZON" : "86885",
        "VILLAGOMEZ" : "25871",
        "VILLAHERMOSA" : "73870",
        "VILLAMARIA" : "17873",
        "VILLANUEVA" : "13873",
        "VILLANUEVA" : "44874",
        "VILLANUEVA" : "68872",
        "VILLANUEVA" : "85440",
        "VILLAPINZON" : "25873",
        "VILLARRICA" : "73873",
        "VILLAVICENCIO" : "50001",
        "VILLAVIEJA" : "41872",
        "VILLETA" : "25875",
        "VIOTA" : "25878",
        "VIRACACHA" : "15879",
        "VISTAHERMOSA" : "50711",
        "VITERBO" : "17877",
        "YACOPI" : "25885",
        "YACUANQUER" : "52885",
        "YAGUARA" : "41885",
        "YALI" : "5885",
        "YARUMAL" : "5887",
        "YAVARATE" : "97889",
        "YOLOMBO" : "5890",
        "YONDO" : "5893",
        "YOPAL" : "85001",
        "YOTOCO" : "76890",
        "YUMBO" : "76892",
        "ZAMBRANO" : "13894",
        "ZAPATOCA" : "68895",
        "ZAPAYAN" : "47960",
        "ZARAGOZA" : "5895",
        "ZARZAL" : "76895",
        "ZETAQUIRA" : "15897",
        "ZIPACON" : "25898",
        "ZIPAQUIRA" : "25899",
        "ZONA BANANERA" : "47980"
]

return codigosMap.get(MunicipioCod.toUpperCase(), "Código no encontrado")