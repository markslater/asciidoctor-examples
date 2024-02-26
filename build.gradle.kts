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
    asciidoctorGems(group = "rubygems", name="asciidoctor-tabs", version="1.0.0.beta.6")
}

asciidoctorj {
    requires("asciidoctor-tabs")
}