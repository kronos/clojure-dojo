(defproject dojo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :resource-paths ["config" "resources"]
  :profiles {:dev     {:source-paths ["dev"]
                       :dependencies [[pjstadig/humane-test-output "0.8.3"]
                                      [reloaded.repl "0.2.4"]]
                       :resource-paths ["test/resources"]
                       :repl-options {:init-ns user}}
             :uberjar {:aot :all}}
  :main ^{:skip-aot true} dojo.core.main)
