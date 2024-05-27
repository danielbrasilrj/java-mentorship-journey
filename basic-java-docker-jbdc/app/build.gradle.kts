plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("com.google.guava:guava:32.1.1-jre")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("basic.java.docker.jdbc.JdbcDockerApp")
}

version = "1.0"

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "basic.java.docker.jdbc.JdbcDockerApp"
        )
    }
    archiveFileName.set("${project.name}-${project.version}.jar")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
