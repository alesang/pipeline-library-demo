#!/usr/bin/env groovy

def call() {
    def oss = ["windows", "linux", "unix", "ubuntu"]
    
    for (i in oss) {
        echo i
        println(i)
        echo "inside looop"
    }
}
