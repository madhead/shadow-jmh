plugins {
    id("com.github.johnrengelman.shadow").version("5.2.0").apply(false)
    id("me.champeau.gradle.jmh").version("0.5.0").apply(false)
}

subprojects {
    apply<com.github.jengelman.gradle.plugins.shadow.ShadowPlugin>()
    apply<me.champeau.gradle.JMHPlugin>()

    repositories {
        jcenter()
    }

    dependencies {
        val jmh by configurations

        jmh("org.openjdk.jmh:jmh-core:1.22")
        jmh("org.openjdk.jmh:jmh-generator-annprocess:1.22")
    }
}
