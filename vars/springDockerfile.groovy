def call() {
    if (fileExists("Dockerfile")) {
        echo "Dockerfile already exists — using repo Dockerfile"
    } else {
        echo "No Dockerfile found — generating from Shared Library"

        writeFile file: "Dockerfile", text: """
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
"""
    }
}
