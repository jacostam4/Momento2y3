//parametros
//TipoDoc String
//Return
//Long

println("Llega documento: "+ TipoDoc)

def lookupTable = [
        'CC'  : 1,
        'CD'  : 6,
        'CE'  : 2,
        'FI'  : 8,
        'NIT' : 3,
        'PAS' : 5,
        'PPT' : 10,
        'SE'  : 7,
        'TI'  : 4
]

// Buscar el valor en la tabla
return lookupTable[TipoDoc] ?: null