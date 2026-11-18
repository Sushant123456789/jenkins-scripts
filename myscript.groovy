pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git 'https://github.com/Sushant123456789/git-practical.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}