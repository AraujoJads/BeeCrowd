(def valor (read))

(cond
    (< valor 0.0) (println "Fora de intervalo")
    (> valor 100.0) (println "Fora de intervalo")
    (and (>= valor 0.0) (<= valor 25.0)) (println "Intervalo [0,25]")
    (and (> valor 25.0) (<= valor 50.0)) (println "Intervalo (25,50]")
    (and (> valor 50.0) (<= valor 75.0)) (println "Intervalo (50,75]")
    (and (> valor 75.0) (<= valor 100.0)) (println "Intervalo (75,100]")
    )