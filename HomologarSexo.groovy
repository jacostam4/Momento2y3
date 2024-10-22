//parametros
//tipoSex String
//Return
//Long

println("Llega sexp: "+ tipoSex)

def lookupTable =
        [
                'FEMENINO'  : 1,
                'MASCULINO'  : 6
        ]

// Buscar el valor en la tabla
return lookupTable[tipoSex] ?: null