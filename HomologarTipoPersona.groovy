//Parametros: TipoPer String
//return Long

println("Llega tipoper: "+ TipoPer)
def lookupTable = [
        'PERSONA NATURAL'  : 1,
        'PERSONA JURIDICA'  : 2
]

return lookupTable[TipoPer] ?: null // Retorna null si no encuentra el TipoDoc