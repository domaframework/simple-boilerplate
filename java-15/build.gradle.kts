plugins {
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(15))
    }
}

eclipse {
    jdt {
        javaRuntimeName = "JavaSE-15"
    }
}
