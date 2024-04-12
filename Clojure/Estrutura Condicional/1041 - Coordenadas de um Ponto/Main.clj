(def valores (repeatedly 2 read))

(cond
    (and (= (nth valores 0) 0.0) (not= (nth valores 1) 0.0)) (println "Eixo Y")
    (and (not= (nth valores 0) 0.0) (= (nth valores 1) 0.0)) (println "Eixo X")
    (and (= (nth valores 0) 0.0) (= (nth valores 1) 0.0)) (println "Origem")
    (and (> (nth valores 0) 0.0) (> (nth valores 1) 0.0)) (println "Q1")
    (and (> (nth valores 0) 0.0) (< (nth valores 1) 0.0)) (println "Q4")
    (and (< (nth valores 0) 0.0) (> (nth valores 1) 0.0)) (println "Q2")
    (and (< (nth valores 0)) 0.0 (< (nth valores 1) 0.0)) (println "Q3")
    )
