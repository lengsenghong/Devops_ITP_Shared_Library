def call(String type) {

    if (type == "react") {
        writeFile file: "Dockerfile", text: """
FROM node:18 AS build
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

FROM nginx:alpine
COPY --from=build /app/build /usr/share/nginx/html
EXPOSE 80
"""
    }

    if (type == "spring") {
        writeFile file: "Dockerfile", text: """
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
"""
    }
}
