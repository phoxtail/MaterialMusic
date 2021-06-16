// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven { url =  uri("https://maven.aliyun.com/repository/public") }
        maven { url =  uri("https://maven.aliyun.com/repository/central") }
        maven { url =  uri("https://maven.aliyun.com/repository/google") }
        maven { url =  uri("https://maven.aliyun.com/repository/gradle-plugin") }
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.0-alpha02")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        maven { url =  uri("https://maven.aliyun.com/repository/public") }
        maven { url =  uri("https://maven.aliyun.com/repository/central") }
        maven { url =  uri("https://maven.aliyun.com/repository/google") }
        maven { url =  uri("https://maven.aliyun.com/repository/gradle-plugin") }
        google()
        mavenCentral()
    }
}