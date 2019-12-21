plugins {
    id("com.github.johnrengelman.shadow").version("5.2.0")
    id("me.champeau.gradle.jmh").version("0.5.0")
}

repositories {
    jcenter()
}

dependencies {
    jmh("org.openjdk.jmh:jmh-core:1.22")
    jmh("org.openjdk.jmh:jmh-generator-annprocess:1.22")
}
