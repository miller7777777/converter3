package mnz.creatori.converter3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.*
import mnz.creatori.converter3.Model.Valute
import mnz.creatori.converter3.Model.ValutesResponse
import mnz.creatori.converter3.Network.NetworkHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val response: List<Valute> = NetworkHelper().valutes

        tv.setText(response.get(0).toString())
    }

    companion object {
        public const val BASEURL: String = "http://www.cbr.ru/"

        //scripts/XML_daily.asp
    }


}
