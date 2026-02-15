plugins {
    kotlin("jvm") version "2.3.0"
}

group = "com.yui.bot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val kordVersion: String = "0.17.0"
val slf4j: String = "2.0.17"

dependencies {
    testImplementation(kotlin("test"))
    implementation("dev.kord:kord-core:$kordVersion")
    implementation("org.slf4j:slf4j-simple:$slf4j")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}