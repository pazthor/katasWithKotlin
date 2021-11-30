import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
    application
    id("io.gitlab.arturbosch.detekt") version "1.14.0"
}

group = "me.pazth"
version = "1.0-SNAPSHOT"
val detektVersion = "1.18.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.6.0")

    // Detekt
    detekt("io.gitlab.arturbosch.detekt:detekt-formatting:$detektVersion")
    detekt("io.gitlab.arturbosch.detekt:detekt-cli:$detektVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}

application {
    mainClass.set("MainKt")
}

detekt {
    toolVersion = detektVersion
    input = files("./")
    config = files("./detekt-config.yml")
    autoCorrect = true
}
