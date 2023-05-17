package {{group_id_default}}

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import br.com.zup.beagle.android.networking.RequestData
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ServerDrivenActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(newServerDrivenIntent<ServerDrivenActivity>(RequestData("http://192.168.0.152:8080/screen")))
    }
}
