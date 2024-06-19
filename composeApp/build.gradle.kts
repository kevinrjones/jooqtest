
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jooq)
}

kotlin {
    jvm("desktop")
    
    sourceSets {
        val desktopMain by getting
        
        commonMain.dependencies {
        }
        desktopMain.dependencies {
        }
    }
}
