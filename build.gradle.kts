plugins {
    kotlin("jvm") version "1.9.23"
}

group = "info.maxbehr"
version = "1.0-SNAPSHOT"

val assertjVersion = "3.12.2"
val assertkVersion = "0.28.0"

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation("org.assertj:assertj-core:$assertjVersion")
    testImplementation("com.willowtreeapps.assertk:assertk:$assertkVersion")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}