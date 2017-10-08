(defproject lein-3waysaur "0.1.0-SNAPSHOT"
  :description "Lein plugin for secure and developer friendly API"
  :url "https://github.com/GodiStudios/lein-3waysaur"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.20.0"]]}}
  :test-refresh {:growl false
                 :notify-on-success false
                 :quiet true
                 :changes-only true
                 :stack-trace-depth nil
                 :run-once false
                 :watch-dirs ["src" "test"]
                 :refresh-dirs ["src" "test"]}
  :eval-in-leiningen true)
