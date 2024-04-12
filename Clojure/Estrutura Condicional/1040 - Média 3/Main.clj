(def valores (repeatedly 4 read))

(defn media [valores]
    (float (/ (+ (* (nth valores 0) 2.0) (* (nth valores 1) 3.0) (* (nth valores 2) 4.0) (* (nth valores 3) 1.0)) 10.0))
    )

(println (format "Media: %.1f" (media valores)))

(defn resultadoexame []
    (def exame (read))
    (println (format "Nota do exame: %.1f" exame))
    (cond
         (>= (/ (+ (media valores) exame ) 2) 5.0) (do (println "Aluno aprovado.") (println (format "Media final: %.1f" (float(/ (+ (media valores) exame ) 2)))))
         (<= (/ (+ (media valores) exame ) 2) 4.9) (do (println "Aluno reprovado.") (println (format "Media final: %.1f" (float(/ (+ (media valores) exame ) 2)))))
    )
    )

(cond 
    (>= (media valores) 7.0) (println "Aluno aprovado.")
    (< (media valores) 5.0) (println "Aluno reprovado.")
    (and (>= (media valores) 5.0) (<= (media valores) 6.9)) (do (println "Aluno em exame.") (resultadoexame))
    )