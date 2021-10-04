import com.google.common.collect.*
  
  def call(args){
    def jobURL = env.JOB_URL
    echo "${jobURL}"
  }
