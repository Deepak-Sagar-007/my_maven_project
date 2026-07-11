pipeline {

```
agent { label 'linux-node1' }

options {
    timestamps()
}

tools {
    maven 'Maven'
}

stages {

    stage('Start') {
        steps {
            echo "Build Started"
        }
    }

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

    stage('Archive') {
        steps {
            archiveArtifacts artifacts: 'target/*.jar'
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
```

}
