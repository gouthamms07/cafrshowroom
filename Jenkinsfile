pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t used-car-showroom .'
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                docker stop showroom || true
                docker rm showroom || true
                docker run -d -p 8080:8080 --name showroom used-car-showroom
                '''
            }
        }
    }
}
