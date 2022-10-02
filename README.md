
# Solutions for the Envelo tasks


1.A.
Klas abstrakcyjnych używamy jako klas ogólnikowych, które będą potem rozszerzane.
Możemy też zapisać ciała metod, aby uniknąć duplikowania kodu.

Interfejsów używamy przede wszystkim dla zaimplementowania jakichś konkretnych funkcjonalności.
Można również użyć ciał metod dla metod domyślnych, w celu uniknięcia duplikowania kodu.

1.B.
Główna róznica to fakt, iż tworząc tablicę musimy od razu zdefiniować jej rozmiar.
Tworząc listę nie musimy znać jej rozmiaru.
Ponadto, tablica jest dobrym rozwiązaniem gdy głównym zastosowaniem jest odczyt.
W przypadku, gdy często musimy dodawać/usuwać elementy, lepsza pod względem optymalizacji będzie lista.

2.

   private boolean search(int[] numbers, int x) {
        int indexLow = 0;
        int indexHigh = numbers.length - 1;

        while (indexLow <= indexHigh) {
            int indexMiddle = indexLow + (indexHigh - indexLow) / 2;

            if (x < numbers[indexMiddle]) {
                indexHigh = indexMiddle - 1;
            } else if (x > numbers[indexMiddle]) {
                indexLow = indexMiddle + 1;
            } else {
                return true;
            }
        }
        return false;
    }

Szacowana złożoność obliczeniowa - O(log(n))
Szacowana złożoność pamięciowa - O(1)
