pipeline {

```
agent { label 'linux-node1' }

tools {
    maven 'Maven'
}

options {
    timestamps()
}

stages {

    stage('Checkout') {
        steps {
            checkout scm
        }
    }

    stage('Build & Test') {
        steps {
            sh 'mvn clean install'
        }
    }

    stage('Archive Artifacts') {
        steps {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            archiveArtifacts artifacts: 'target/surefire-reports/*.xml', allowEmptyArchive: true
            archiveArtifacts artifacts: 'target/surefire-reports/*.txt', allowEmptyArchive: true
        }
    }
}

post {
    always {
        junit 'target/surefire-reports/*.xml'
    }
    success {
        echo "Build SUCCESS"
    }
    failure {
        echo "Build FAILED"
    }
}
```

}
