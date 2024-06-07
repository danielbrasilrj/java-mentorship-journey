plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("basic.java.docker.Application")
}

version = "1.0"

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "basic.java.docker.Application"
        )
    }
    archiveFileName.set("${project.name}-${project.version}.jar")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
