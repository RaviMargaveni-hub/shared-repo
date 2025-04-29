def call(String message) {
    pipeline {
        agent any
        stages {
            stage('Shared Stage') {
                steps {
                    echo "Running shared stage with message: ${message}"
                }
            }
        }
    }
}
