package {{group_id_default}}

import android.app.Application

class AppApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        BeagleSetup().init(this)
    }
}