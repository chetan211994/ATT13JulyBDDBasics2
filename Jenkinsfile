pipeline {
    agent any

    stages {
        stage('Build the image') {
            steps {
                bat "Docker build -t=cucumbertestimage ."
            }
        }
        
        stage('Making the infrastructure ready') {
            steps {
                bat "docker-compose up -d hub chrome"
            }
        }

        stage('Executing the project') {
            steps {
                bat "docker-compose up cucumber-testcase"
            }
            post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'executionreport/amazontestreport/reports.html', body: '''<h1>Hi Team,</h1>
<p>Please find the details of execution below:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks & Regards,<br>
Chetan''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customised email from jenkins for Firefox', to: 'beralchetan3210@gmail.com'
        }
    }
        }
        

        
    }
     
}