(def valores (repeatedly 3 read))
(defn delta [valores]
    (- (* (nth valores 1) (nth valores 1)) (* 4 (nth valores 0) (nth valores 2)))
    )
(defn R1 [valores]
    (/ (+ (* (nth valores 1) -1) (Math/sqrt (delta valores))) (* 2 (nth valores 0)))
    )

(defn R2 [valores]
    (/ (- (* (nth valores 1) -1) (Math/sqrt (delta valores))) (* 2 (nth valores 0)))
    )

(cond 
    (< (delta valores) 0.0) (println "Impossivel calcular")
    (= (nth valores 0) 0.0) (println "Impossivel calcular")
    :else (do (println (format "R1 = %.5f" (R1 valores))) (println (format "R2 = %.5f" (R2 valores))))
    
    )