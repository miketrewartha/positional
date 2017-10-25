package io.trewartha.positional.map.tracking

import android.location.Location
import org.threeten.bp.Instant

class TrackPoint(val location: Location) {

    val accuracy = location.accuracy
    val bearing = location.bearing
    val altitude = location.altitude
    val latitude = location.latitude
    val longitude = location.longitude
    val speed = location.speed
    val time = Instant.ofEpochMilli(location.time)

}