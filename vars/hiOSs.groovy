#!/usr/bin/env groovy

def call() {
    oss = ["windows", "linux", "unix", "ubuntu"]
    
    for (i in oss) {
        echo i
        println(i)
        echo "inside looop"
    }
}
