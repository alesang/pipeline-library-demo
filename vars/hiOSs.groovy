#!/usr/bin/env groovy

def call() {
    oss = ["windows", "linux", "unix", "ubuntu"]
    
    for (i in oss) {
        echo i
        echo "inside looop"
    }
}
