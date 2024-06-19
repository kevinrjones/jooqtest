import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.jooq) apply false
}

subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>() {
        compilerOptions.jvmTarget.set(JvmTarget.JVM_21)
        dependsOn(tasks["jooqCodegen"])
    }
}