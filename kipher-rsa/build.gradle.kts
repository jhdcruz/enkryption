plugins {
    id("conventions.module")
    id("conventions.reports")
    id("conventions.compile")
    id("conventions.publish")
}

dependencies {
    api(projects.kipherCommon)
    implementation(libs.bouncycastle.pcix)
}
