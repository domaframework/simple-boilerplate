plugins {
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

eclipse {
    jdt {
        javaRuntimeName = "JavaSE-1.8"
    }
}
