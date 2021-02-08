plugins {
    val kt = "1.4.30"

    kotlin("jvm") version kt
    kotlin("kapt") version kt
    id("net.mamoe.mirai-console") version "2.3.2"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "net.im45.bot"
version = "0.1.0"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}

mirai {
    coreVersion = "2.3.2"
}

kotlin.sourceSets.all {
    languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
}

kotlin.target.compilations.all {
    kotlinOptions.freeCompilerArgs += "-Xjvm-default=enable"
    kotlinOptions.jvmTarget = "11"
}
