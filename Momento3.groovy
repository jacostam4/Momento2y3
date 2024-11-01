// Canal Call Center
if(ChannelTypeCd == '5'){
    def token = GenerarToken()
    def fechaFormateada = Formatear_Fecha(CreationDate)
    def valor = nvl(getSelectedListDisplayValue('CategoryId'),"")
    def valfin = valor.length() >= 3 ? valor.substring(0, 3) : valor
    // Define el map que se va a enviar


    def groovyMap = [
            codigo_queja: dl_sr_tipo_entidad_c+dl_sr_entidad_cod_c+SrNumber,
            sexo: 1, // tiene como homologar
            lgbtiq: dl_co_LGTBQ_c.toInteger(), // tiene como homologar
            condicion_especial: dl_sr_condicion_especial.toInteger(), // tiene como homologar
            canal_cod: ChannelTypeCd.toInteger(),
            producto_cod: ProductVO?.ItemNumber.toInteger(),
            macro_motivo_cod: valfin,
            estado_cod: 2,
            fecha_actualizacion: fechaFormateada,
            producto_digital: dl_sr_producto_digital_c.toInteger(), // no encuentro sus valores
            a_favor_de: dl_sr_resuelto_a_favor_de_c.toInteger(),
            aceptacion_queja: dl_sr_Aceptacion_c.toInteger(),
            rectificacion_queja: dl_sr_Rectificacion_c.toInteger(),
            desistimiento_queja: dl_sr_desistimiento_queja_c.toInteger(),
            prorroga_queja: dl_sr_prorroga_c,
            admision: dl_sr_admision_c.toInteger(),
            documentacion_rta_final: false,
            anexo_queja: true,
            tutela: dl_sr_tutela_c.toInteger(),,
            ente_control: dl_sr_ente_control_c.toInteger(),
            marcacion: dl_sr_Marcacion_c.toInteger(),
            queja_expres: dl_sr_queja_expres_c.toInteger()
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
        rtas = adf.webServices.Momento3
        println("line 46: " + rtas)
        rtas.requestHTTPHeaders = headersSmart
        impr = rtas.PUT(groovyMap)
        println("RTA Servicio: "+ impr)
    }catch(e){
        println("Error: "+ e)
    }

}