buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath(ClassPath.gradle)
        classpath(ClassPath.kotlin)
        classpath(ClassPath.bintray)
    }
}
allprojects {
    repositories {
        maven("https://jitpack.io")
        jcenter()
        google()
    }
}