pipeline {
    agent any

    stages {

        stage("build") {

            steps {
                echo 'building the application...'
                sh './gradlew assemble'
            }
        }

        stage("test") {

            steps {
                echo 'testing the application...'
                sh './gradlew test'
            }
        }

        stage("deploy") {

            steps {
                echo 'deploying the application...'
            }
        }
    }
}