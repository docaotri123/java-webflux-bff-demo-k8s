node {
    def app

    stage('Clone repository') {


        checkout scm
    }

    stage('Build image') {

       app = docker.build("trido123/test:1")
    }

    stage('Test image') {


        app.inside {
            sh 'echo "Tests passed"'
        }
    }

    stage('Push image') {

        docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
            app.push("${env.BUILD_NUMBER}")
        }
    }

//     stage('Trigger ManifestUpdate') {
//                 echo "triggering updatemanifestjob"
//                 build job: 'updatemanifest', parameters: [string(name: 'DOCKERTAG', value: env.BUILD_NUMBER)]
//         }
   post {
         success {
             // Do something on success
             echo 'Pipeline succeeded!'

             // Additional steps like triggering deployments, notifications, etc.
         }

         failure {
             // Do something on failure
             echo 'Pipeline failed!'

             // Additional steps like sending notifications, cleaning up, etc.
         }
     }
}