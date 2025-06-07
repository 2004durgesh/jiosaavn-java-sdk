plugins {
    id("java-library")
    id("maven-publish")
    id ("com.diffplug.spotless") version "6.25.0"
}

group = "com.github.2004durgesh"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_18
    targetCompatibility = JavaVersion.VERSION_18

    withSourcesJar()
    withJavadocJar()
}

spotless {
    java {
        googleJavaFormat() // or any version
        target ("src/**/*.java")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // HTTP Client
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    // JSON Processing
    implementation("com.fasterxml.jackson.core:jackson-core:2.16.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.16.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.16.1")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = "com.github.2004durgesh"
            artifactId = "jiosaavn-java-sdk"
            version = "1.0.0"

            pom {
                name.set("JioSaavn Java API")
                description.set("A lightweight Java wrapper for JioSaavn APIs.")
                url.set("https://github.com/2004durgesh/jiosaavn-java")

                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("2004durgesh")
                        name.set("Durgesh Kumar")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/2004durgesh/jiosaavn-java.git")
                    developerConnection.set("scm:git:ssh://github.com:2004durgesh/jiosaavn-java.git")
                    url.set("https://github.com/2004durgesh/jiosaavn-java")
                }
            }
        }
    }

}

// signing {
//    useGpgCmd()
//    sign(publishing.publications["mavenJava"])
// }