package mnz.creatori.converter3.Model


data class Valute (val id: String,
                   val numCode: String,
                   val charCode: String,
                   val nominal: String,
                   val name: String,
                   val value: String)

data class ValutesResponse(val valutes: List<Valute>)