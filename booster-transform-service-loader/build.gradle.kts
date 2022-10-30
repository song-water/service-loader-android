plugins {
    kotlin("jvm")
    kotlin("kapt")
}

apply(plugin = "de.marcphilipp.nexus-publish")

dependencies {
    implementation(gradleApi())

    kapt("com.google.auto.service:auto-service:1.0.1")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation(project(":service-registry"))
    implementation("com.didiglobal.booster:booster-android-gradle-api:4.14.0")
    implementation("com.didiglobal.booster:booster-task-spi:4.14.0")
    implementation("com.didiglobal.booster:booster-transform-asm:4.14.0")
    implementation("com.didiglobal.booster:booster-transform-util:4.14.0")
    compileOnly("com.android.tools.build:gradle:4.2.1")
    testCompileOnly("com.android.tools.build:gradle:4.2.1")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
