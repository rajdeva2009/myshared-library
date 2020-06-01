// def call(Map stageParams) {
// 
//    checkout([
//        $class: 'GitSCM',
//        branches: [[name:  stageParams.branch ]],
//        userRemoteConfigs: [[ url: stageParams.url ]]
//    ])
//  }

import com.google.common.collect.*
    
def call(args) {
    
    try {
        def jobUrl = env.JOB_URL
        println jobUrl
        long startTime = System.currentTimeMillis()
        println startTime
        
        def scm = steps.checkout args
		def commitHash = scm.GIT_COMMIT
        
        }catch (exc) {
		   recordEvent('anomaly', ['type':'GitCheckout','level':'error','where':'gitCheckout.groovy'])
		   throw exc
	       }
   }
        
