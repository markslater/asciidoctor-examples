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
    asciidoctorGems("rubygems:asciidoctor-revealjs:5.1.0")
}

asciidoctorj {
    requires(
        project.layout.buildDirectory.file(".asciidoctorGems/gems/asciidoctor-revealjs-5.1.0/lib/asciidoctor-revealjs.rb")
    )
}

tasks {
    asciidoctor {
        dependsOn("asciidoctorGemsPrepare")
    }
}
