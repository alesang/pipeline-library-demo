#!/usr/bin/env groovy

def call(String os ) {
    oss=['windows', 'linux', 'unix', 'ubuntu']
    
    for (def i in oss) {
        echo $i
    }
}
