plugins {
    id("module")
    id("compile")
    id("publish")
}

dependencies {
    implementation(projects.kipherCommon)
    implementation(libs.bouncycastle.pcix)
}
