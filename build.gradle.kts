repositories {
	mavenCentral()
}

plugins {
	kotlin("jvm") version "1.4.31"

	id("com.github.johnrengelman.shadow") version "6.1.0"
	id("com.bmuschko.docker-remote-api") version "6.7.0"
	id("de.undercouch.download") version "4.1.1"
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
	implementation(kotlin("reflect"))

	implementation(platform("com.fasterxml.jackson:jackson-bom:2.12.1"))
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	runtimeOnly("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
}

tasks {
	wrapper {
		distributionType = Wrapper.DistributionType.ALL
		gradleVersion = "6.8.3"
	}
}
