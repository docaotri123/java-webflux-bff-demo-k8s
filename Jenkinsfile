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
                    echo '$IMAGE_NAME:$TAG'
                    docker.build('$IMAGE_NAME:$TAG')
                }
            }
        }

//         stage('Test image') {
//             steps {
//                 // Add your testing steps here
//                 script {
//                     // Run tests if needed
//                     // For example: sh './mvnw test' for Maven
//                 }
//             }
//         }

//         stage('Push image to DockerHub') {
//             steps {
//                 // Push Docker image to DockerHub
//                 script {
//                     withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'DOCKER_HUB_USERNAME', passwordVariable: 'DOCKER_HUB_PASSWORD')]) {
//                         sh 'docker login -u $DOCKER_HUB_USERNAME -p $DOCKER_HUB_PASSWORD'
//                         sh 'docker push $DOCKER_HUB_USERNAME/$IMAGE_NAME:$TAG'
//                     }
//                 }
//             }
//         }
//     }

//     post {
//         success {
//             // Do something on success
//             echo 'Pipeline succeeded!'
//
//             // Additional steps like triggering deployments, notifications, etc.
//         }
//
//         failure {
//             // Do something on failure
//             echo 'Pipeline failed!'
//
//             // Additional steps like sending notifications, cleaning up, etc.
//         }
    }
}
