(def n(read))
(def porcent (list "15 %" "12 %" "10 %" "7 %" "4 %"))

(cond
    (and(<= n 400.00) (>= n 0.00)) (println(format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %s"(+ n (* n 0.15))(* n 0.15)(nth porcent 0)))
    (and(<= n 800.00) (> n 400.00)) (println(format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %s"(+ n (* n 0.12))(* n 0.12)(nth porcent 1)))
    (and(<= n 1200.00) (> n 800.00)) (println(format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %s"(+ n (* n 0.10))(* n 0.10)(nth porcent 2)))
    (and(<= n 2000.00) (> n 1200.00)) (println(format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %s"(+ n (* n 0.07))(* n 0.07)(nth porcent 3)))
    :else (println(format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %s"(+ n (* n 0.04))(* n 0.04)(nth porcent 4))))

