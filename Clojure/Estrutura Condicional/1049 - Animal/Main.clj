(def a (read-line))
(def b (read-line))
(def c (read-line))

(cond(= a "vertebrado")
    (if(= b "ave")
        (if(= c "carnivoro")
            (println "aguia")
            (println "pomba")
        )
        (if(= c "onivoro")
            (println "homem")
            (println "vaca")
        )
    )    
:else (do
        (if(= b "inseto")
            (if(= c "hematofago")
                (println "pulga")
                (println "lagarta")
            ) 
            (if(= c "hematofago")
                (println "sanguessuga")
                (println "minhoca")
            )
        )            
    )
)

