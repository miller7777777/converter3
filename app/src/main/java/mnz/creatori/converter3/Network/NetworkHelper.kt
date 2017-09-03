package mnz.creatori.converter3.Network

import mnz.creatori.converter3.Model.Valute
import mnz.creatori.converter3.Model.ValutesResponse
import java.util.ArrayList


class NetworkHelper {

    val valutes: List<Valute>
        get() {
            val fakeList = ArrayList<Valute>()
            fakeList.add(Valute("36", "643", "RUB", "1", "Российский Рубль", "1.0"))
            return fakeList
        }
}