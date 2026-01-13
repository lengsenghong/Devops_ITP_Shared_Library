def call() {
    if (fileExists("pom.xml")) {
        return "spring"
    }
    if (fileExists("package.json")) {
        return "react"
    }
    error "Unknown project type"
}
