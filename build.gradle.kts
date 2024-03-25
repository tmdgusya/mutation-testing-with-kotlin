import info.solidsoft.gradle.pitest.PitestPluginExtension

plugins {
    kotlin("jvm") version "1.9.0"
    id("info.solidsoft.pitest") version "1.15.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.8.1")
    testImplementation("io.kotest.extensions:kotest-extensions-pitest:1.2.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

configure<PitestPluginExtension> {
    testPlugin.set("Kotest")
    targetClasses = listOf("com.example.*")
    targetTests = listOf("com.example.*")
    outputFormats = listOf("html")
}
