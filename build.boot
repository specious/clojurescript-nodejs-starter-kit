(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/boot-cljs "2.0.0" :scope "test"]])

(require
  '[adzerk.boot-cljs :refer [cljs]])

(deftask dev
  "Watch/compile files in development"
  []
  (comp
    (watch)
    (cljs :source-map true
          :optimizations :none
          :compiler-options {:target :nodejs})
    (target)))

(deftask prod
  "Compile for production"
  []
  (comp
    (cljs :optimizations :advanced
          :compiler-options {:target :nodejs})
    (target)))
