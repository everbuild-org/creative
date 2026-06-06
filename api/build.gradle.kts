plugins {
    id("creative.publishing-conventions")
}

description = "A resource-pack library for Minecraft: Java Edition."

dependencies {
    compileOnlyApi("org.jetbrains:annotations:26.0.2")
    api("net.kyori:adventure-key:5.1.1")
    api("net.kyori:adventure-api:5.1.1")
    implementation("net.kyori:adventure-text-serializer-legacy:5.1.1")
}