pipeline {
    agent any

    environment {
        // Define environment variables
        DOCKER_HUB_USERNAME = 'trido123'
        REPO_NAME = 'java-webflux-bff-demo-k8s'
        IMAGE_NAME = 'webflux_example'
        TAG = 'latest'
    }

    stages {
        stage('Clone repository') {
            steps {
                // Clone your Git repository
                git 'https://github.com/docaotri123/java-webflux-bff-demo-k8s.git'
            }
        }

        stage('Build image') {
            steps {
                // Build Docker image using Maven or Gradle
                script {
                    // Build Docker image
                    echo "$IMAGE_NAME:$TAG"
                    docker.build("$DOCKER_HUB_USERNAME/$IMAGE_NAME:$TAG")
                }
            }
        }
    }
}
