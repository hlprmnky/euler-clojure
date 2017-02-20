(ns hlprmnky.test
 (:require [cljs.spec :as s]))
 
 (s/def ::big-number (s/and number?
                     #(> % 10000)))