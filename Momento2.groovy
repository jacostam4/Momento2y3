Obligatorios()
// Canal Call Center
if(ChannelTypeCd == '5'){
  def token = GenerarToken()
  def fechaFormateada = Formatear_Fecha(CreationDate)
  def valor = nvl(getSelectedListDisplayValue('CategoryId'),"")
  def valfin = valor.length() >= 3 ? valor.substring(0, 3) : valor
  // Define el map que se va a enviar
  def groovyMap = [
          tipo_entidad: dl_sr_tipo_entidad_c.toInteger(),
          entidad_cod: dl_sr_entidad_cod_c.toInteger(),
          codigo_queja: dl_sr_tipo_entidad_c+dl_sr_entidad_cod_c+SrNumber,
          codigo_pais: "170",
          departamento_cod: HomologacionDepartamientos(ContactPerson?.PrimaryAddressState),
          municipio_cod: HomologacionMunicipios(ContactPerson?.PrimaryAddressCity),
          canal_cod: ChannelTypeCd.toInteger(),
          producto_cod: ProductVO?.ItemNumber.toInteger(),
          producto_nombre: ProductVO?.Name,
          macro_motivo_cod: valfin.toInteger(),
          fecha_creacion: fechaFormateada,
          nombres: ContactPerson?.PartyUniqueName,
          tipo_id_CF: HomologacioTipoDoc(ContactPerson?.dl_tipo_identificacion_c),
          numero_id_CF: ContactPerson?.dl_numero_identificacion_c,
          tipo_persona: HomologarTipoPersona(ContactPerson?.dl_tipo_persona_c),
          insta_recepcion: dl_sr_Instancia_recepcion_c.toInteger(), //DALE_INSTANCIA_RECEPCION
          punto_recepcion: ChannelTypeCd.toInteger(),//duda
          admision: dl_sr_admision_c.toInteger().toInteger(), //duda
          texto_queja: dl_sr_DescripcionDelProblema_c,
          anexo_queja: true,
          ente_control: dl_sr_ente_control_c.toInteger()
  ]
  println("Body: " + groovyMap)
// define los headers del servicio
  def headersSmart = [
          "X-Transaction-Id": "fd2ca1a9-0ee8-45db-b5fc-087bcd6237ef",
          "X-Channel-Id": "crmoracle",
          "X-Session-Id": "fd2ca1a9-0ee8-45db-b5fc-087bcd6237ef",
          "X-Timestamp": "2022-05-08T06:23:06",
          "X-IpAddress": "69.69.69.69",
          "X-Application": "crmoracle",
          "X-Version": "1.0",
          "x-secret": "e4829ba8-d1b7-4c72-8b15-7e804353a571",
          "Content-Type": "application/json",
          "Authorization": token
  ]
  println("Headers: " + headersSmart)

  def rtas
  def impr
  try{
    rtas = adf.webServices.Momento2
    rtas.requestHTTPHeaders = headersSmart
    impr = rtas.POST(groovyMap)
    println("RTA Servicio: "+ impr)
  }catch(e){
    println("Error: "+ e)
  }

}