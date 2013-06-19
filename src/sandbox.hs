module Main
where

main = do
  --print (initials "John" "Pradeep")
  --print (calcBmi [(1,2), (2,3)])
  --print (calcBmis [(1,2), (2,3)])
  --print (cylinder 2 2)
  --print (caseHead [1,2])
  --print (describeList [])
  --print (describeList [1])
  --print (describeList [1,2])
  print (mapper [1,2,3])


initials :: String -> String -> String
initials firstname lastname  = [f] ++ ". " ++ [l] ++ "."
  where (f:_) = firstname
        (l:_) = lastname


calcBmi :: [(Double, Double)] -> [Double]
calcBmi xs = [bmi w h | (w,h) <- xs]
  where bmi weight height = weight/height^2

cylinder :: Double -> Double -> Double
cylinder r h =
  let sideArea = 2 * 3.14 * r * h
      topArea = 3.14 * r ^ 2
  in sideArea + 2 * topArea



calcBmis :: [(Double, Double)] -> [Double]
calcBmis xs = [bmi | (w, h) <- xs, let bmi = w / h ^ 2]


caseHead :: [a] -> a
caseHead xs = case xs of [] -> error "No Head for empty list"
                         (x:_) -> x


describeList :: [a] -> String
describeList ls = "The list is " ++ what ls
  where what [] = "Empty."
        what [x] = "A singleton list"
        what xs = "A Longer list"

mapper ::  (Num a) => [a] -> [a]
mapper xs = map (\x -> x * x) xs


