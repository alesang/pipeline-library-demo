#!/usr/bin/env groovy

def call(String name = "advi" ) {
    def beatles = ["John","Paul","George","Subbu"]
    //for (int i=0;i < beatles.size();i++ ){ Or
    
    echo "${name}"
    for (beatle in beatles) {
        def greeting = "Hello, "
    //println "$greeting" + "${beatles[i]}"  Or beatles[i]
        echo "$greeting" + beatle
        
    }
}
