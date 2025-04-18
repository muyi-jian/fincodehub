plugins {
    id("java")
    id("org.springframework.boot") version "3.3.6" // 应用Spring Boot插件，指定Spring Boot版本
    id("io.spring.dependency-management") version "1.1.7" // 应用Spring的依赖管理插件，简化依赖版本管理
}

group = "com.fincodehub"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}