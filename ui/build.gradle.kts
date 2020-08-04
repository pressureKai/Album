plugins {
    id(Plugin.library)
    kotlin(Plugin.kotlin_android)
    kotlin(Plugin.kotlin_ext)
}
apply(from = "../gradle/UPLOAD.gradle")
android {
    compileSdkVersion(Version.compileSdk)
    defaultConfig {
        minSdkVersion(Version.minSdk)
        targetSdkVersion(Version.targetSdk)
    }
    androidExtensions { isExperimental = true }
}
dependencies {
    api(project(":core"))
    compileOnly(Dep.recyclerView)
    compileOnly(Dep.fragment)
    compileOnly(Dep.uCrop)
    compileOnly(Dep.kotlin)
    compileOnly(Dep.glide)
    compileOnly(Dep.material)
}