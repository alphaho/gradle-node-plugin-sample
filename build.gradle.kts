plugins {
    java
    id("com.moowork.grunt") version "1.2.0"

}

group = "org.sample"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

node {
    version = "5.1.0"
    download = true
}