pipeline {
     agent { label 'linux-node1' }

    tools {
        maven 'Maven'
       
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/YOUR_USERNAME/my-maven-project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}