plugins {
    kotlin("jvm") version "1.9.23"
}

group = "info.maxbehr"
version = "1.0-SNAPSHOT"

val junit5Version = "5.7.1"
val assertjVersion = "3.12.2"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.assertj:assertj-core:$assertjVersion")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}