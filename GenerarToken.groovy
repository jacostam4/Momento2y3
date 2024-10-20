//Return String
def rta = adf.webServices.GenerarToken


def params = [
  'client_id': "Aeg9ECnPABD0Qn03Ob2KMJ9d8QqgEeKt",
  'client_secret': "_MS5hzPl0TD0Wl4QL7tH_sB7mb9q_jDAI4mca6tYCiUp-A6__ZgIk_GQtVknitcI",
  'audience': "https://smartsupervision.stg.daleapps.com",
  'grant_type': "client_credentials"
]

// Enviar la solicitud POST
try {
    def response = rta.POST(params)
    println("Respuesta: " + response.access_token)
  return("Bearer " + response.access_token)
}catch (Exception e) {
    println("Error al enviar la solicitud POST: " + e.message)
    e.printStackTrace()
}