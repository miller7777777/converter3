package mnz.creatori.converter3.Network


import java.util.ArrayList

import mnz.creatori.converter3.Model.Valute

class NetworkHelperJavaToKotlin {

    val valutes: List<Valute>
        get() {
            val fakeList = ArrayList<Valute>()
            fakeList.add(Valute("36", "643", "RUB", "1", "Российский Рубль", "1.0"))
            return fakeList
        }
}
