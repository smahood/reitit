(defproject ring-example "0.1.0-SNAPSHOT"
  :description "Reitit Http App with Swagger"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring-jetty-adapter "1.7.0"]
                 [aleph "0.4.6"]
                 [metosin/reitit "0.2.5"]]
  :repl-options {:init-ns example.server})
