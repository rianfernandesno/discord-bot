plugins {
    kotlin("jvm") version "2.3.0"
}

group = "com.yui.bot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val kordVersion: String = "0.17.0"

dependencies {
    testImplementation(kotlin("test"))
    implementation("dev.kord:kord-core:$kordVersion")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}