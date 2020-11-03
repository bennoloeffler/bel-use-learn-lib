(ns bel-use-learn-lib.core
  [:require [bel-learn-lib.core :as bel]]
  (:gen-class))

; HOW to use the lib
; ;;;;;;;;;;;;;;;;;;
; Make a dir in the project
; c:\projects\bel-use-learn-lib\src\bel-learn-lib
; BASICALLY: bel-learn-lib in src
; Put a symbolic link there: 
; mklink ..\..\..\..\bel-learn-lib\src\ (AS ADMIN)
; THATS IT

(defn -main
  "just calling the lib..."
  []
  (bel/test-the-lib))
