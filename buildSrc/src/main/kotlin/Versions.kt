import org.gradle.api.JavaVersion

object Versions {

    const val kotlin = "1.3.71"

    object Android {
        const val compileSdk = 29
        const val minSdk = 21
        const val targetSdk = 29
    }

    object Application {
        val code by lazy {
            val format = "%02d"
            val minSdk = String.format(format, Android.minSdk)
            val versionMajor = String.format(format, major)
            val versionMinor = String.format(format, minor)
            val versionPatch = String.format(format, patch)
            "${minSdk}${versionMajor}${versionMinor}${versionPatch}".toInt()
        }
        val name by lazy { "$major.$minor.$patch" }

        private const val major = 2
        private const val minor = 13
        private const val patch = 0
    }

    object Compatibility {
        val source: JavaVersion = JavaVersion.VERSION_1_8
        val target: JavaVersion = JavaVersion.VERSION_1_8
    }

    object Dependencies {
        const val androidXConstraintLayout = "2.0.0-beta4"
        const val androidXFragment = "1.3.0-alpha03"
        const val androidXLegacySupportV4 = "1.0.0"
        const val androidXLifecycle = "2.2.0"
        const val androidXNavigation = "2.3.0-alpha04"
        const val androidXPreference = "1.1.0"
        const val androidXRecyclerView = "1.2.0-alpha02"
        const val firebaseBoM = "25.2.1"
        const val geoCoordinatesConversion = "360781e"
        const val kotlin = Versions.kotlin
        const val loaderView = "2.0.0"
        const val material = "1.2.0-alpha05"
        const val pageIndicatorView = "1.0.3"
        const val playServicesLocation = "17.0.0"
        const val spek = "2.0.10"
        const val sunriseSunset = "1.1.1"
        const val threeTenAbp = "1.2.3"
        const val timber = "4.7.1"
        const val truth = "1.0.1"
        const val worldWind = "0.8.0"
    }

    object Plugins {
        const val android = "4.0.0-beta04"
        const val firebaseCrashlytics = "2.0.0-beta03"
        const val firebasePerf = "1.3.1"
        const val googleServices = "4.3.3"
        const val gradleVersions = "0.28.0"
        const val jUnit5 = "1.5.2.0"
        const val kotlin = Versions.kotlin
    }
}