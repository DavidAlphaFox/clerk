;; # Closing parens

[[1] 2]


[1 [2]]

[[[1] 2] 3]

[1 [2 [3]]]

[1 [2] 3]


[1 [2] #{[3]}]


[1 [2] #{[3]} 4]


{:foo [1 [2] #{[3] [4] [5 6 7 8]}]}


{:foo [1 [2] [[3] [4] [5 6 7 8] 9]]}

(comment
  (nextjournal.clerk/serve! {})
  (nextjournal.clerk/show! "notebooks/closing-parens.clj")
  (nextjournal.clerk/build-static-app! {:paths ["notebooks/closing-parens.clj"]})

  )
