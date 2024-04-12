(def valor (read))

(cond
    (= valor 61) (println "Brasilia")
    (= valor 71) (println "Salvador")
    (= valor 11) (println "Sao Paulo")
    (= valor 21) (println "Rio de Janeiro")
    (= valor 32) (println "Juiz de Fora")
    (= valor 19) (println "Campinas")
    (= valor 27) (println "Vitoria")
    (= valor 31) (println "Belo Horizonte")
    :else (println "DDD nao cadastrado")
    )