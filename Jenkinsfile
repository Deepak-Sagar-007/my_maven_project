pipeline {
     agent { label 'linux-node1' }

    tools {
        maven 'Maven'
       
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Deepak-Sagar-007/my_maven_project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
