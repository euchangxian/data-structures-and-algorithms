stages {
    pipelines {
        stage("Build") {
            sh './gradlew clean build'
        }

        stage("Test") {
            sh './gradlew clean test'
        }

        stage("checkstyle") {
            sh './gradlew checkstyleMain checkstyleTest'
        }
    }
}