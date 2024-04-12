(def valores (repeatedly 2 read))

(def n (sort >[(nth valores 0) (nth valores 1)]))

(if (integer? (/ (nth n 0) (nth n 1)))
    (println "Sao Multiplos")
    (println "Nao sao Multiplos"))