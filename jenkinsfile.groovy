pipeline {
    agent {label 'studentscourse'}
    stages {
        stage('vcs'){
            steps {
                git url: 'https://github.com/Lakshmanadapa/student-course-registration-api.git',
                branch: 'master'
            }
        }
        stage('build studentscourse'){
         steps {
            sh "docker image build -t studentcourserestapi:1.0 ."
         }   
        }
    }
}