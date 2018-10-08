
#!/usr/bin/env groovy

def call(){
    def beatles = ["John","Paul","George","Subbu"]
    //for (int i=0;i < beatles.size();i++ ){ Or

    for (beatle in beatles) {
        def greeting = "Hello, "
    //println "$greeting" + "${beatles[i]}"  Or beatles[i]
        println "$greeting" + beatle
        
    }
}
