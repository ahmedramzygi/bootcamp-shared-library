#!/usr/bin/env groovy

def call() {
    echo "building the java application "
    sh 'mvn package'
}
