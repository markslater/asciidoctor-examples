buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    java
    `jvm-test-suite`
    id("org.asciidoctor.jvm.convert") version "4.0.2"
}

repositories {
    mavenCentral()
}

testing {
    @Suppress("UnstableApiUsage")
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
            dependencies {
                implementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
                runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
            }
        }
    }
}