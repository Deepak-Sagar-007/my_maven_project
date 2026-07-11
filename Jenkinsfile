pipeline {

    agent { label 'linux-node1' }

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

    }

    post {
        success {
            echo "Build SUCCESS"
        }
        failure {
            echo "Build FAILED"
        }
    }
}
