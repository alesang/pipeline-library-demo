#!/usr/bin/env groovy

def call() {
    oss=['windows', 'linux', 'unix', 'ubuntu']
    
    for (def i in oss) {
        println(i)
    }
}
