pipeline {
    agent any
    environment {
        mavenProps = readMavenPom file: "pom.xml"
        ARTIFACT_ID = mavenProps.getArtifactId()
        GROUP_ID = mavenProps.getGroupId()
        PACKAGING = mavenProps.getPackaging()
        POM_VERSION = mavenProps().getVersion()
        BUILD_RELEASE_VERSION = mavenProps().getVersion().replace("-SNAPSHOT", "")
        IS_SNAPSHOT = mavenProps().getVersion().endsWith("-SNAPSHOT")
        GIT_TAG_COMMIT = sh(script: 'git describe --tags --always', returnStdout: true).trim()
    }
    tools {
        maven 'apache-maven-3.6.3'
        jdk 'jdk-1.8.0.282'
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