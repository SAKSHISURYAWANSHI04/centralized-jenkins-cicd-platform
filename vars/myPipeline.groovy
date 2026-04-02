def call() {
    pipeline {
        agent any

        stages {

            stage('Build') {
                steps {
                    echo 'Building application...'
                }
            }

            stage('Test') {
                steps {
                    echo 'Running tests...'
                }
            }

            stage('Scan') {
                steps {
                    echo 'Security scan...'
                }
            }

            stage('Deploy') {
                steps {
                    echo 'Deploying app...'
                }
            }

        }
    }
}
