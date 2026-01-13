def call() {
    if (fileExists("Dockerfile")) {
        echo "Dockerfile already exists — using repo Dockerfile"
    } else {
        echo "No Dockerfile found — generating from Shared Library"

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
}
