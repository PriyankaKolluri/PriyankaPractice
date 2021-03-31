pipeline {
    agent any
    environment {
        POM_VERSION = readMavenPom().getVersion()
        BUILD_RELEASE_VERSION = readMavenPom().getVersion().replace("-SNAPSHOT", "")
        IS_SNAPSHOT = readMavenPom().getVersion().endsWith("-SNAPSHOT")
        GIT_TAG_COMMIT = sh(script: 'git describe --tags --always', returnStdout: true).trim()
    }

    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh 'mvn clean package'
                }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                    }
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