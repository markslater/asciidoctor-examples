buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.asciidoctor.jvm.convert") version "4.0.2"
    id("org.asciidoctor.jvm.gems") version "4.0.2"
}

repositories {
    mavenCentral()
    ruby {
        gems()
    }
}

dependencies {
    asciidoctorGems("rubygems:asciidoctor-revealjs:1.1.3")
}

asciidoctorj {
    requires("asciidoctor-revealjs")
}

tasks {
    asciidoctor {
        dependsOn("asciidoctorGemsPrepare")
    }
}
