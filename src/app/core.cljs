(ns app.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn main [& args]
  (println "Abracadabra!"))

(set! *main-cli-fn* main)
