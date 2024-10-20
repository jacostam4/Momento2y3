//Parametros: departamentocod String
//Return String

println("Este es el departamento que llega: "+ departamentocod)

def codigosMap = [
        "ANTIOQUIA"       : "5",
        "ATLANTICO"       : "8",
        "BOGOTÁ"          : "11",
        "BOGOTÁ, D.C."    : "11",
        "BOLIVAR"         : "13",
        "BOYACA"          : "15",
        "CALDAS"          : "17",
        "CAQUETA"         : "18",
        "CAUCA"           : "19",
        "CESAR"           : "20",
        "CORDOBA"         : "23",
        "CUNDINAMARCA"    : "25",
        "CHOCO"           : "27",
        "HUILA"           : "41",
        "LA GUAJIRA"      : "44",
        "MAGDALENA"       : "47",
        "META"            : "50",
        "NARIÑO"          : "52",
        "NORTE DE SANTANDER": "54",
        "QUINDIO"         : "63",
        "RISARALDA"       : "66",
        "SANTANDER"       : "68",
        "SUCRE"           : "70",
        "TOLIMA"          : "73",
        "VALLE DEL CAUCA" : "76",
        "ARAUCA"          : "81",
        "CASANARE"        : "85",
        "PUTUMAYO"        : "86",
        "SAN ANDRES"      : "88",
        "PROVIDENCIA"     : "88",
        "SANTA CATALINA"  : "88",
        "AMAZONAS"        : "91",
        "GUAINIA"         : "94",
        "GUAVIARE"        : "95",
        "VAUPES"          : "97",
        "VICHADA"         : "99"
]

// Devolver el valor sin usar la palabra clave return
return codigosMap.get(departamentocod.toUpperCase(), "Código no encontrado")
