package project.android.get_location.usecase

import android.app.Activity
import android.content.Context
import android.location.Location
import android.view.ViewGroup

interface GetLocationFeature {
    fun getLocation(context : Context)
    fun disableGetLocation()
    enum class Status{
        DENY,
        ACCEPT,
        BUG,
        DISABLE
    }
}
data class Response(
    val value : Any?,
    val status : GetLocationFeature.Status
)