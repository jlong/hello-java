node {
  stage "Checkout"
  checkout scm

  stage "Build"
  sh "mvn compile"

  stage "Test"
  sh "mvn test"

  stage "Package"
  sh "mvn package"
}