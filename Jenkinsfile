node { 
    stage('Stage 1') { 
        sh 'pwd' 
        sh 'java -version' 
    } 
    
    stage('Clone repository') {
         checkout scm #repository를 jenkins workspace로 clone
     }
    
}
