(def valor (read))
(defn calcquot [valor numero]
    (quot valor numero))
(defn calcmod [valor numero]
    (mod valor numero))

;;Calculo para 100
(def calc100 (calcquot valor 100))
(def rest100 (calcmod valor 100))

;;Calculo para 50
(def calc50 (calcquot rest100 50))
(def rest50 (calcmod rest100 50))

;;Calculo para 20
(def calc20 (calcquot rest50 20))
(def rest20 (calcmod rest50 20))

;;Calculo para 10
(def calc10 (calcquot rest20 10))
(def rest10 (calcmod rest20 10))

;;Calculo para 5
(def calc5 (calcquot rest10 5))
(def rest5 (calcmod rest10 5))

;;Calculo para 2
(def calc2 (calcquot rest5 2))
(def rest2 (calcmod rest5 2))

(println valor)
(println calc100 "nota(s) de R$ 100,00")
(println calc50 "nota(s) de R$ 50,00")
(println calc20 "nota(s) de R$ 20,00")
(println calc10 "nota(s) de R$ 10,00")
(println calc5 "nota(s) de R$ 5,00")
(println calc2 "nota(s) de R$ 2,00")
(println rest2 "nota(s) de R$ 1,00")