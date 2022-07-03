echo "---build start---"

  stage("Get Source") {
        git url: "https://github.com/skyer9/TestPublic",
            branch: "master"
    }

    stage("Build") {
        sh "chmod 700 gradlew"
        sh "./gradlew clean"
        sh "./gradlew bootJar"
    }


stage('Push Stage') {
    echo "---Push Stage---"
    sh "java -version"
}
