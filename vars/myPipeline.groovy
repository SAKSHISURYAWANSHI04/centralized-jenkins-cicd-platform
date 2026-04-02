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
                    sh 'docker build -t myapp .'
                    sh 'docker run -d -p 8081:80 myapp'
                }
            }

        }
    }
}
