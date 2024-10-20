//Parametros: CreationDate Date
//Return String

println("Esta es la fecha de creacion: "+ CreationDate)
def year = CreationDate.year + 1900   // El año empieza en 1900, por lo que hay que sumarlo
def month = (CreationDate.month + 1).toString().padLeft(2, '0') // Los meses comienzan desde 0
def day = CreationDate.date.toString().padLeft(2, '0') // El día del mes
def hours = CreationDate.hours.toString().padLeft(2, '0') // La hora
def minutes = CreationDate.minutes.toString().padLeft(2, '0') // Los minutos
def seconds = CreationDate.seconds.toString().padLeft(2, '0') // Los segundos

// Ensamblar la fecha en el formato "yyyy-MM-dd'T'HH:mm:ss"
def formattedDate = "${year}-${month}-${day}T${hours}:${minutes}:${seconds}"

return formattedDate