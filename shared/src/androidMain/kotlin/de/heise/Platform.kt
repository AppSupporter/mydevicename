package de.heise

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"

    actual fun getDeviceName(): String {
        return android.os.Build.MODEL
    }
}