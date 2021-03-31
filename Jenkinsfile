pipeline {
    agent any
    environment {

        GIT_TAG_COMMIT = sh(script: 'git describe --tags --always', returnStdout: true).trim()
    }
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh '''
                 mvn clean package
                 ls target
                 '''
                 junit 'build/test-results/test/*.xml'
                 archiveArtifacts artifacts: 'dist/reactiveApp.zip'
            }
        }

/*		stage("Testing") {
      parallel {
        stage("Unit Tests") {
          agent { docker 'openjdk:8-jdk-alpine' }
          steps {
            sh 'java -version'
          }
        }
        stage("Functional Tests") {
          agent { docker 'openjdk:8-jdk-alpine' }
          steps {
            sh 'java -version'
          }
        }
        stage("Integration Tests") {
          steps {
            sh 'java -version'
          }
        }
      }
    }
    */

    stage("Deploy") {
      steps {
        echo "Deploy!"
        }
        }
        }
        }