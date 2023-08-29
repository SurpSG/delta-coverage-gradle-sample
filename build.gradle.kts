import io.github.surpsg.deltacoverage.gradle.DeltaCoverageConfiguration

plugins {
    kotlin("jvm") version "1.9.0"
    `java-library`
    `jvm-test-suite`

    id("io.github.surpsg.delta-coverage") version "1.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(8)
}

testing.suites {
    val test by getting(JvmTestSuite::class) {
        useJUnitJupiter()
    }
}


configure<DeltaCoverageConfiguration> {
    diffSource.file.set("./diff-file.patch")

    violationRules.failIfCoverageLessThan(0.5)
    reports {
        html.set(true)
    }
}
